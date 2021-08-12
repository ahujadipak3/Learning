package com.entitymapping0419.listeners;

public class SampleClass {

	static String str;
	
	public void SampleClass() {
		System.out.println("In constructor");
		str ="helloword";
	}
	
	public static void main(String[] args) {
		SampleClass s = new SampleClass();
		System.out.println(str);
	}
}
