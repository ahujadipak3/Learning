/**
 * 
 */
package com.dipak.spring.reddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipak.spring.reddit.model.Vote;

/**
 * @author dipak.ahuja
 *
 */
public interface VoteRepository extends JpaRepository<Vote, Long> {

}
