package com.dipak.ratings.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dipak.ratings.model.Ratings;

@RestController
@RequestMapping("/api/ratings")
public class RatingsController {

	
	@GetMapping("/{userId}")
	public List<Ratings> getRatingsByUser(@PathVariable Long userId) {
		return Arrays.asList(
				new Ratings(4,1,1),
				new Ratings(5,1,1));
				
	}
}
