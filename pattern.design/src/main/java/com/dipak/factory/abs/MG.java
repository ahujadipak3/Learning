package com.dipak.factory.abs;

public class MG implements Car {

	@Override
	public void start() {
		System.out.println("Starting "+ this.getClass());
	}

}
