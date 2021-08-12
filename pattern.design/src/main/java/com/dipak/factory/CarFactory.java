package com.dipak.factory;

public class CarFactory {

	public static Car getCar(CarBrand brand) {
		return brand.getConstructor().get();
	}
}
