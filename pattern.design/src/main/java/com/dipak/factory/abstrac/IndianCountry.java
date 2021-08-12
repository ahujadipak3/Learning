package com.dipak.factory.abstrac;

public class IndianCountry extends CountryFactory {

	@Override
	public Castle getCastle() {
		// TODO Auto-generated method stub
		return new IndianCastle();
	}

	@Override
	public Army getArmy() {
		// TODO Auto-generated method stub
		return new IndianArmy();
	}

}
