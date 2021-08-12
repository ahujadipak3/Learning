package com.dipak.factory.abs;

public class CarFactory {

	public static Car getCar(CarVendor brand) {
		return brand.getConstructor().get();
	}
}
