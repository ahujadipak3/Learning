package com.dipak.decorator.solution;

public class CompressedStream implements Stream {

	private Stream stream;
	public CompressedStream(Stream stream) {
		System.out.println("Compressed Stream");
		this.stream = stream;
	}
	
	@Override
	public void write(String data) {
		this.stream.write(compressedString(data));
	}
	
	private String compressedString(String data) {
		System.out.println("compressed string");
		return "Compressed String";
	}

}
