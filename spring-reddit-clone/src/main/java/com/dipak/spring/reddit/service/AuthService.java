package com.dipak.spring.reddit.service;

import static com.dipak.spring.reddit.util.RedditConstants.ACTIVATION_EMAIL;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dipak.spring.reddit.dto.AuthenticationResponse;
import com.dipak.spring.reddit.dto.LoginRequest;
import com.dipak.spring.reddit.dto.RefreshTokenRequest;
import com.dipak.spring.reddit.dto.RegisterRequest;
import com.dipak.spring.reddit.exception.SpringRedditException;
import com.dipak.spring.reddit.model.NotificationEmail;
import com.dipak.spring.reddit.model.User;
import com.dipak.spring.reddit.model.VerificationToken;
import com.dipak.spring.reddit.repository.UserRepository;
import com.dipak.spring.reddit.repository.VerificationTokenRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author dipak.ahuja
 *
 */

@Service
@AllArgsConstructor
@Slf4j
public class AuthService {

	private final UserRepository userRepository;

	private final PasswordEncoder passwordEncoder;

	private final VerificationTokenRepository verificationTokenRepository;

	private final MailContentBuilder mailContentBuilder;

	private final MailService mailService;

	private final AuthenticationManager authenticationManager;

	private final JwtProvider jwtProvider;

	private final RefreshTokenService refreshTokenService;

	/**
	 * 
	 * @param registerRequest
	 */
	@Transactional
	public void signup(RegisterRequest registerRequest) {

		User user = new User();
		user.setUsername(registerRequest.getUsername());
		user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
		user.setEnabled(false);
		user.setEmail(registerRequest.getEmail());
		userRepository.save(user);

		log.info("User is saved in database with userId {}!", user.getUserId());

		String token = generateVerificationToken(user);

		/* Preparing Thymeleaf template for Email body */
		String message = mailContentBuilder.build(
				"Thank you for signing up to Spring Reddit, please click on the below url to activate your account : "
						+ ACTIVATION_EMAIL + "/" + token);

		mailService.sendMail(new NotificationEmail("Account Verification", user.getEmail(), message));
	}

	/**
	 * 
	 * @param user
	 * @return token
	 */
	private String generateVerificationToken(User user) {
		String token = UUID.randomUUID().toString();
		VerificationToken verificationToken = new VerificationToken();
		verificationToken.setExpiryDate(Instant.now());
		verificationToken.setUser(user);
		verificationToken.setToken(token);

		verificationTokenRepository.save(verificationToken);
		return token;
	}

	@Transactional
	public void validateToken(String token) {
		VerificationToken verificationToken = verificationTokenRepository.findByToken(token);
		Optional<User> optionalUser = userRepository.findById(verificationToken.getUser().getUserId());

		User user = optionalUser.orElseThrow(() -> new SpringRedditException("Invalid Token Request!"));
		user.setEnabled(true);

		userRepository.save(user);
		log.info("User enabled in database!");
	}

	@Transactional
	public AuthenticationResponse login(LoginRequest loginRequest) {
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(authentication);
		String token = jwtProvider.generateToken(authentication);
		return AuthenticationResponse.builder().token(token).username(loginRequest.getUsername())
				.expiresAt(Instant.now().plusMillis(jwtProvider.getExpirationTimeInMillis()))
				.refreshToken(refreshTokenService.generateRefreshToken(loginRequest.getUsername()).getRefreshToken())
				.build();
	}

	@Transactional(readOnly = true)
	public User getCurrentUser() {
		org.springframework.security.core.userdetails.User principal = (org.springframework.security.core.userdetails.User) SecurityContextHolder
				.getContext().getAuthentication().getPrincipal();
		return userRepository.findByUsername(principal.getUsername())
				.orElseThrow(() -> new UsernameNotFoundException("User name not found - " + principal.getUsername()));
	}

	public AuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest) {
		refreshTokenService.validateRefreshToken(refreshTokenRequest);
		return AuthenticationResponse.builder()
				.token(jwtProvider.generateTokenByUserName(refreshTokenRequest.getUsername())).expiresAt(Instant.now())
				.username(refreshTokenRequest.getUsername()).refreshToken(refreshTokenRequest.getRefreshToken())
				.build();

	}

}