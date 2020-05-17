package com.waleed.training.model;

public class BookCatalogueItem {

	private String name;

	public BookCatalogueItem(String name, String description, Integer rating) {

		this.name = name;
		this.description = description;
		this.rating = rating;
	}

	private String description;
	private Integer rating;

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

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}
}
