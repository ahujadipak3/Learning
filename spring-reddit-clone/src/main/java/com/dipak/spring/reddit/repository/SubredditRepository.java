/**
 * 
 */
package com.dipak.spring.reddit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipak.spring.reddit.model.Subreddit;

/**
 * @author dipak.ahuja
 *
 */
public interface SubredditRepository extends JpaRepository<Subreddit, Long> {

	public Optional<Subreddit> findByName(String subredditName);
}
