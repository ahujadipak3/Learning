package com.dipak.factory;

public class FactoryPatternClient {

	public static void main(String[] args) {
		Car car = CarFactory.getCar(CarBrand.FERRARI);
		car.start();
	}
}
