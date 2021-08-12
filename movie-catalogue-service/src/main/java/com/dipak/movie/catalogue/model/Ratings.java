package com.dipak.movie.catalogue.model;

public class Ratings {

	private Integer ratings;
	private Integer movieId;
	private Integer userId;
	
	
	public Ratings() {
		super();
	}
	public Ratings(Integer ratings, Integer movieId, Integer userId) {
		super();
		this.ratings = ratings;
		this.movieId = movieId;
		this.userId = userId;
	}
	public Integer getRatings() {
		return ratings;
	}
	public void setRatings(Integer ratings) {
		this.ratings = ratings;
	}
	public Integer getMovieId() {
		return movieId;
	}
	@Override
	public String toString() {
		return "Ratings [ratings=" + ratings + ", movieId=" + movieId + ", userId=" + userId + "]";
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
	
}
