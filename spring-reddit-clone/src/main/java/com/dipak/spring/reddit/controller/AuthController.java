package com.dipak.spring.reddit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dipak.spring.reddit.dto.AuthenticationResponse;
import com.dipak.spring.reddit.dto.LoginRequest;
import com.dipak.spring.reddit.dto.RefreshTokenRequest;
import com.dipak.spring.reddit.dto.RegisterRequest;
import com.dipak.spring.reddit.service.AuthService;
import com.dipak.spring.reddit.service.RefreshTokenService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
@Slf4j
public class AuthController {

	private final AuthService authService;

	private final RefreshTokenService refreshTokenService;

	@PostMapping(value = "/signup")
	public ResponseEntity<Object> signup(@RequestBody RegisterRequest registerRequest) {
		authService.signup(registerRequest);
		return new ResponseEntity<Object>("Account Registered Successfully!", HttpStatus.OK);
	}

	@GetMapping(value = "/accountVerification/{token}")
	public ResponseEntity<Object> verifyAccount(@PathVariable String token) {
		authService.validateToken(token);
		log.info("User activiated successfully!");
		return new ResponseEntity<Object>("User Activiated Successfully!", HttpStatus.OK);
	}

	@PostMapping(value = "/login")
	public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
		log.info("Login Request with {}", loginRequest);
		AuthenticationResponse response = authService.login(loginRequest);
		return new ResponseEntity<AuthenticationResponse>(response, HttpStatus.OK);
	}

	@PostMapping(value = "/refresh/token")
	public ResponseEntity<?> refreshToken(@RequestBody RefreshTokenRequest refreshTokenRequest) {
		log.info("Refresh-Token request with {}", refreshTokenRequest);
		AuthenticationResponse response = authService.refreshToken(refreshTokenRequest);
		return new ResponseEntity<AuthenticationResponse>(response, HttpStatus.OK);
	}

	@PostMapping(value = "/logout")
	public ResponseEntity<?> logout(@RequestBody RefreshTokenRequest refreshTokenRequest) {
		refreshTokenService.deleteRefreshToken(refreshTokenRequest.getRefreshToken());
		return ResponseEntity.status(HttpStatus.OK).body("Refresh Token Deleted Successfully!");

	}
}
