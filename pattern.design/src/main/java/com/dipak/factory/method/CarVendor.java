package com.dipak.factory.method;

import java.util.function.Supplier;

public enum CarVendor {

	FORD(Ford::new), FERRARI(Ferrari::new);
	
	private Supplier<Car> construtor;
	
	
	private String carBrandName;
	CarVendor(Supplier<Car> constructor) {
		this.construtor = constructor;
	}
	
	public Supplier<Car> getConstructor() {
		return this.construtor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.carBrandName;
	}

	public static void getBrandNames() {
		CarVendor[] brands = CarVendor.values();
		for (int i = 0; i < brands.length; i++) {
			System.out.println(brands[i]);
		}
		return;
	}
	
	public static void main(String[] args) {
		CarVendor.getBrandNames();
	}
}
