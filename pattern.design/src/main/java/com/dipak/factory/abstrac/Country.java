package com.dipak.factory.abstrac;

public enum Country {
	INDIA("India"), CHINA("China");

	private String name;
	Country(String name) {
		this.name = name;
	}
	
	public String value() {
		return this.name;
	}
}
