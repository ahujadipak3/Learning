package com.dipak.datastructure.binarytree;

public class FactorialExample {

	public static void main(String[] args) {
		//System.out.println(new FactorialExample().factorial(5));
		int number=5;
		FactorialExample f = new FactorialExample();
		for (int i = 1; i <= number; i++) {
			System.out.println(f.factorial(i));;
		}
		
	}
	
	public int factorial(int n) {
		//4!.. 3 *2*1
		if(n==1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
}
