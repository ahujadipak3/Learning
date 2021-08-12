/**
 * 
 */
package com.dipak.spring.reddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipak.spring.reddit.model.VerificationToken;

/**
 * @author dipak.ahuja
 *
 */
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
	VerificationToken findByToken(String token);
}
