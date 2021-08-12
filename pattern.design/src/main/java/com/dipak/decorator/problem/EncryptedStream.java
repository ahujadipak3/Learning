package com.dipak.decorator.problem;

public class EncryptedStream extends CloudStream{

	@Override
	public void write(String data) {
		String newData = encrypt(data);
		super.write(newData);
	}
	
	private String encrypt(String data) {
		return "encrypted string";
	}
}
