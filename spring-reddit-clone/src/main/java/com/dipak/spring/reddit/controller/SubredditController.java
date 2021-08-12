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

import com.dipak.spring.reddit.dto.SubredditDto;
import com.dipak.spring.reddit.service.SubredditService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/subreddit")
public class SubredditController {

	private final SubredditService subredditService;
	
	@GetMapping("/all")
	public ResponseEntity<List<SubredditDto>> getAllSubreddits() {
		return new ResponseEntity<List<SubredditDto>>(subredditService.getAllSubreddits(), HttpStatus.OK);
	}
	
	@PostMapping("/create")
	private void createSubreddit(@RequestBody SubredditDto subredditDto) {
		subredditService.createSubreddit(subredditDto);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<SubredditDto> getSubredditById(@PathVariable Long id) {
		return new ResponseEntity<SubredditDto>(subredditService.getSubredditById(id), HttpStatus.OK);
	}
}
