package com.dipak.factory.abs;

public class FactoryProducer {

	public static final AbstractFactory getFactory(boolean imported) {
		if(imported) {
			return new ImportedCarFactory();
		} 
		return new IndianCarFactory();
	}
	
}
