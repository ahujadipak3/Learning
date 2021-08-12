package com.dipa.dsa.practice;

public class Fibonacci {

	public static void main(String[] args) {
		int number = 9;
		// 0 1 1 2 3 5 8 

		int a = 0;
		int b = 1;
		
		//System.out.print(a+ " "+ b);
		int c = 0;
		for (int i = 2; i <= number; i++) {
			c = a + b;
			
			a = b;
			b = c;
		}
		System.out.print(" "+c);
	}
}
