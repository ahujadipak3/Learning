package com.dipa.dsa.practice;

public class FindSingleOccurance {

	public static void main(String[] args) {
		int[] numbers = {3,4,5,4,5};
        //int[] numbers = {2, 3, 5, 4, 5, 3, 4};
		// Find the element that appear once where every other element present thrice

		int res = numbers[0];
		for(int i=1; i<numbers.length;i++) {
			res = res ^ numbers[i];
		}
		System.out.println(res);
	}
}
