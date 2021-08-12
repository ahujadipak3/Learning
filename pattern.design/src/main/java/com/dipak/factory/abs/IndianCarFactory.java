package com.dipak.factory.abs;

public class IndianCarFactory extends AbstractFactory {

	@Override
	public Car getCar(String carVendor) {
		if("Ford".equalsIgnoreCase(carVendor)) {
			return new Ford();
		} 
		throw new RuntimeException("Invalid argument for Car Vendor");
	}

	
}
