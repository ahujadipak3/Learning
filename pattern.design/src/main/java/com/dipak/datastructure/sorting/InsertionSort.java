package com.dipak.datastructure.sorting;

import java.util.Arrays;

public class InsertionSort {

	
	public static void main(String[] args) {
	
		int arr[] = {6 , 8 , 4 , 3, 1};
		
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			/*
			 * for (int j = 0; j < i; j++) { if(arr[j] > current) { swap(arr, i ,j); } }
			 */
			int j= i-1;
			while(j>=0 && arr[j] > current) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(int[] arr, int index1, int index2) {
		arr[index1] = arr[index1] + arr[index2];
		arr[index2] = arr[index1] - arr[index2];
		arr[index1] = arr[index1] - arr[index2];
	}
}
