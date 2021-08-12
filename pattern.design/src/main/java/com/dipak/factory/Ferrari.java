package com.dipak.factory;

public class Ferrari implements Car {

	@Override
	public void start() {
		System.out.println("Starting " + Ferrari.class);
	}

}
