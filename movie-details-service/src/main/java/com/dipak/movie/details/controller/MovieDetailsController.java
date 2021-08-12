package com.dipak.movie.details.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dipak.movie.details.model.MovieDetails;

@RestController
@RequestMapping("/api/movie/details")
public class MovieDetailsController {

	@GetMapping("/{movieId}")
	public MovieDetails getMovieDetails(@PathVariable Long movieId) {
		return new MovieDetails(1, "3 Idiots", "Description");

	}

}
