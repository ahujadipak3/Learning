package com.dipak.decorator.solution;

public class EncryptedStream implements Stream{

	Stream stream;
	
	public EncryptedStream(Stream stream) {
		System.out.println("EncryptedStream Stream");
		// TODO Auto-generated constructor stub
		this.stream = stream;
	}
	
	
	@Override
	public void write(String data) {
		String newData = encrypt(data);
		stream.write(newData);
	}
	
	private String encrypt(String data) {
		return "encrypted string";
	}
}
