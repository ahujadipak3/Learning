package com.dipak.factory.abstrac;

public abstract class CountryFactory {

	public abstract Castle getCastle();
	public abstract Army getArmy();
	
	public static CountryFactory getCountry(Country country) {
		if(country.value().equals(Country.INDIA.value())) {
			return new IndianCountry();
		}
		return null;
		
	}
	
}
