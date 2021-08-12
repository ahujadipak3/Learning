package com.dipak.spring.reddit.service;

import static java.util.Date.from;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.time.Instant;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import com.dipak.spring.reddit.exception.SpringRedditException;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Service
public class JwtProvider {

	@Value("${jwt.expiration.time}")
	private Long jwtExpirationInMillis;

	private KeyStore keyStore;

	@PostConstruct
	public void init() {
		try {
			keyStore = KeyStore.getInstance("JKS");
			InputStream stream = this.getClass().getResourceAsStream("/sprinreddit.jks");
			keyStore.load(stream, "changeit".toCharArray());
		} catch (KeyStoreException | NoSuchAlgorithmException | CertificateException | IOException e) {
			throw new SpringRedditException("An exception occurred while extracting the keystore!");
		}
	}

	public String generateToken(Authentication authentication) {
		User user = (User) authentication.getPrincipal();
		return Jwts.builder().setSubject(user.getUsername()).setIssuedAt(from(Instant.now()))
				.setExpiration(from(Instant.now().plusMillis(jwtExpirationInMillis))).signWith(getPrivateKey())
				.compact();
	}

	private PrivateKey getPrivateKey() {
		try {
			return (PrivateKey) keyStore.getKey("springreddit", "changeit".toCharArray());
		} catch (UnrecoverableKeyException | KeyStoreException | NoSuchAlgorithmException e) {
			throw new SpringRedditException("An exception occurred while extracting the Private Key!");
		}
	}

	public boolean validateToken(String token) {
		Jwts.parser().setSigningKey(getPublicKey()).parseClaimsJws(token);
		return true;
	}

	public PublicKey getPublicKey() {
		try {
			return keyStore.getCertificate("springreddit").getPublicKey();
		} catch (KeyStoreException e) {
			throw new SpringRedditException("An exception occurred while extracting the Public Key!");
		}
	}

	public String getUsernamefromtoken(String token) {
		Claims claims = Jwts.parser().setSigningKey(getPublicKey()).parseClaimsJws(token).getBody();
		return claims.getSubject();
	}

	public long getExpirationTimeInMillis() {
		return jwtExpirationInMillis;
	}

	public String generateTokenByUserName(String username) {
		return Jwts.builder()
				.setSubject(username)
				.setExpiration(from(Instant.now().plusMillis(getExpirationTimeInMillis())))
				.setIssuedAt(from(Instant.now()))
				.signWith(getPrivateKey())
				.compact();
	}

}
