package com.dipak.datastructure.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
	//int[] arr = {56,85,48,69,87};
		int[] arr = {3,5};
		boolean isSorted = true;
		for(int i =0;i<arr.length-1;i++) {
			isSorted =true;
			for(int j=0;j<arr.length-1-i;j++)
			if(arr[j] > arr[j+1]) {
				arr[j] = arr[j] + arr[j+1];
				arr[j+1] = arr[j] - arr[j+1];
				arr[j] = arr[j] - arr[j+1];
				isSorted = false;
			}
			if(isSorted) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	/* 				
	 * Passes		  O(1)	O(n)
	 * Comparisons   O(n)	O(n)
	 * 
	 * 
	 */
}
