package com.dipak.spring.reddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipak.spring.reddit.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

	
}
