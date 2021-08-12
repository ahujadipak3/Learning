package com.dipak.datastructure.sorting;

import java.util.Arrays;

public class InsertionSortPractice {

	/*
	 * Keep the pointer at 1 and check for previous items if they are greater than shift
	 */
	
	public static void main(String[] args) {
		int[] arr = { 8,2, 4,1,3};
		
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i-1;
			while(j >= 0 && current<arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
