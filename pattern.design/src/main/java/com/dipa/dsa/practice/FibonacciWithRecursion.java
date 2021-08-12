package com.dipa.dsa.practice;

public class FibonacciWithRecursion {

	public static void main(String[] args) {
		System.out.println(fibonacci(9)); 
	}
	
	public static int fibonacci (int n) {
		int result;
		if(n<=1) {
			result = n;
		} else {
			result =  fibonacci(n-1) + fibonacci(n-2);
		}
		return result;
	}
	
	/*
	 * public static int fibonacciFromStarting(int n) {
	 * 
	 * }
	 */
}
