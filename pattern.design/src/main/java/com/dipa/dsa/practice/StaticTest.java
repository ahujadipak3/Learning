package com.dipa.dsa.practice;

public class StaticTest {
	static int i =10;

	/*
	 * static { i = 60; }
	 */
	public static void main(String[] args) {
		changeValue(i);
		//i = 50;
		System.out.println(i);
		
	}
	private static void changeValue(int i) {
		// TODO Auto-generated method stub
		System.out.println(i);
		i = 50;
		System.out.println(i);
	}
}
