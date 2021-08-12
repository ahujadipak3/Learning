package com.dipak.factory.abs;

public class FactoryPatternClient {

	public static void main(String[] args) {
//		Car car = CarFactory.getCar(CarVendor.FERRARI);
//		car.start();
		AbstractFactory factory = FactoryProducer.getFactory(false);
		Car car = factory.getCar("Ford");
		car.start();
		
		AbstractFactory factory1 = FactoryProducer.getFactory(true);
		Car car1 = factory1.getCar("MG");
		car1.start();
	}
}
