package com.dipak.movie.catalogue.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dipak.movie.catalogue.model.MovieCatalogue;
import com.dipak.movie.catalogue.model.MovieDetails;
import com.dipak.movie.catalogue.model.Ratings;

@RestController
@RequestMapping("/api/movie/catalogue")
public class MovieCatalogueRestController {

	private static final Logger logger = LoggerFactory.getLogger(MovieCatalogueRestController.class);

	private final RestTemplate restTemplate;
	
	MovieCatalogueRestController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@GetMapping("/{userId}")
	public List<MovieCatalogue> getMovieCatalogue(@PathVariable Long userId) {
		logger.info("userId:: {}", userId);

		//List<Ratings> userRatings = Arrays.asList(new Ratings(4, 1, 3), new Ratings(5, 2, 3));

		ParameterizedTypeReference<List<Ratings>> parameterizedTypeReference =  new ParameterizedTypeReference<List<Ratings>>() {
		};
		//restTemplate.getForObject("http://localhost:8082/api/ratings/1", parameterizedTypeReference);
		ResponseEntity<List<Ratings>> response = restTemplate.exchange("http://ratings-service/api/ratings/1", HttpMethod.GET, null, parameterizedTypeReference);
		List<Ratings> userRatings = response.getBody();
		
		return userRatings.stream().map((Ratings rating) -> {
			MovieDetails movieDetails = restTemplate.getForObject("http://movie-details-service/api/movie/details/1", MovieDetails.class);
			return new MovieCatalogue(movieDetails.getName(), movieDetails.getDescription(), rating.getRatings());
			}).collect(Collectors.toList());
	}
}
