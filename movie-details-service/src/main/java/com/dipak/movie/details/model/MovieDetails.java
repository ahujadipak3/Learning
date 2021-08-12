package com.dipak.movie.details.model;

public class MovieDetails {

	private Integer id;
	private String name;
	private String description;
	
	public MovieDetails() {
		
	}
	
	public MovieDetails(Integer id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	@Override
	public String toString() {
		return "MovieDetails [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
