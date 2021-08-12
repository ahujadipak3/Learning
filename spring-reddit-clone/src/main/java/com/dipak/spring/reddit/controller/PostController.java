package com.dipak.spring.reddit.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dipak.spring.reddit.dto.PostRequest;
import com.dipak.spring.reddit.dto.PostResponse;
import com.dipak.spring.reddit.service.PostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/post")
@RequiredArgsConstructor
public class PostController {

	private final PostService postService;

	@GetMapping("/all")
	public ResponseEntity<List<PostResponse>> getAllPosts() {
		return ResponseEntity.status(HttpStatus.OK).body(postService.getAllPosts());
	}

	@GetMapping("/{id}")
	public ResponseEntity<PostResponse> getPost(@PathVariable long id) {
		return ResponseEntity.status(HttpStatus.OK).body(postService.getPostById(id));
	}

	@PostMapping("/create")
	public ResponseEntity<?> createPost(@RequestBody PostRequest postRequest) {
		postService.createPost(postRequest);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
