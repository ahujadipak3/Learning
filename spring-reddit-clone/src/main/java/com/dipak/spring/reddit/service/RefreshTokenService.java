package com.dipak.spring.reddit.service;

import java.time.Instant;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.dipak.spring.reddit.dto.RefreshTokenRequest;
import com.dipak.spring.reddit.exception.SpringRedditException;
import com.dipak.spring.reddit.model.RefreshToken;
import com.dipak.spring.reddit.repository.RefreshTokenRepository;

import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class RefreshTokenService {

	private final RefreshTokenRepository refreshTokenRepository;

	public void validateRefreshToken(RefreshTokenRequest refreshTokenRequest) {
		refreshTokenRepository.findByRefreshToken(refreshTokenRequest.getRefreshToken())
				.orElseThrow(() -> new SpringRedditException("Requested refresh token does not exist"));

	}

	public RefreshToken generateRefreshToken(String username) {
		RefreshToken refreshToken = RefreshToken.builder()
				.createdDate(Instant.now())
				.username(username)
				.refreshToken(UUID.randomUUID().toString())
				.build();
		return refreshTokenRepository.save(refreshToken);
	}
	
	public void deleteRefreshToken(String refreshToken) {
		refreshTokenRepository.deleteByRefreshToken(refreshToken);
	}

}
