package com.sample.programs;

public class AuthenticationFactory {

	public static Authentication getAuthentication(String customerType) {
		if("Fradulent".equals(customerType)) {
			return new A1Authentication();
		} else if("High Risk".equals(customerType)) {
			return new A2Authentication();
		}
		return null;
	}
}
