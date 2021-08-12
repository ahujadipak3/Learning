package com.dipak.spring.reddit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipak.spring.reddit.model.Comment;
import com.dipak.spring.reddit.model.Post;

public interface CommentRepository extends JpaRepository<Comment, Long> {

	List<Comment> findByPost(Post post);

}
