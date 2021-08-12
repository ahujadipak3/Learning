package com.dipak.datastructure.sorting;

import java.util.Arrays;

public class SelectionSortPractice {
	// Search for the minimum element in J loop and swap with i O(n2)
	public static void main(String[] args) {
		int[] arr = { 8,2, 4,1,3};
		
		for (int i = 0; i < arr.length; i++) {
			int min_val = arr[i];
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					min_val = arr[j];
				}
				if(min_val != arr[i]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];	
				}
				
			}
			/* swap(arr, i, j); */
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void swap( int item1, int item2) {
		
	}
}
