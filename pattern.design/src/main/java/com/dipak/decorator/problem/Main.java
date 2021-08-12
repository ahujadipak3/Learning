package com.dipak.decorator.problem;

public class Main {

	public static void main(String[] args) {
		//CloudStream cs = new CloudStream();
		EncryptedStream es = new EncryptedStream();
		es.write("Some Data");
	}
}
