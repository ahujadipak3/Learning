package com.dipak.decorator.solution;

public class CloudStream implements Stream{

	public void write(String data) {
		System.out.println("Storing this information " +data);
	}
}
