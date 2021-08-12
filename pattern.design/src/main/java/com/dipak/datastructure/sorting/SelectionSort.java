package com.dipak.datastructure.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int arr[] = {};
		int min = Integer.MIN_VALUE;
		int min_index = -1;
		for (int i = 0; i < arr.length; i++) {
			min =arr[i];
			min_index = i;
			for(int j = i+1;j < arr.length;j++) {
				if(arr[j] < min) {
					min = arr[j];
					min_index = j;
				}
			}
			if(min_index!=-1 && min_index !=i) {
				arr[min_index] = arr[min_index] + arr[i];
				arr[i] = arr[min_index] - arr[i];
				arr[min_index] = arr[min_index] - arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	/* 				
	 * Passes		  O(n)	O(n)
	 * Comparisons   O(n)	O(n)
	 * 
	 * 				o(n2)  o(n2)
	 */
	
}
