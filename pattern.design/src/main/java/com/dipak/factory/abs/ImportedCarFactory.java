package com.dipak.factory.abs;

public class ImportedCarFactory extends AbstractFactory {

	@Override
	public Car getCar(String carVendor) {
		if("MG".equalsIgnoreCase(carVendor)) {
			return new MG();
		} 
		throw new RuntimeException("Invalid argument for Car Vendor");
	}

	
}
