package com.dipak.factory.abstrac;

public class AbstractFactoryClient {

	public static void main(String[] args) {
		CountryFactory c=CountryFactory.getCountry(Country.INDIA);
		c.getArmy().getDescription();
		c.getCastle();
	}
}
