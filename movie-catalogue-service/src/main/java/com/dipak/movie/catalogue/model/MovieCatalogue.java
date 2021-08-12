package com.dipak.movie.catalogue.model;

public class MovieCatalogue {

	private String moviename;
	private String description;
	private Integer ratings;

	public MovieCatalogue() {
		super();
	}
	
	public MovieCatalogue(String moviename, String description, Integer ratings) {
		super();
		this.moviename = moviename;
		this.description = description;
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "MovieCatalogue [moviename=" + moviename + ", description=" + description + ", ratings=" + ratings + "]";
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getRatings() {
		return ratings;
	}

	public void setRatings(Integer ratings) {
		this.ratings = ratings;
	}

}
