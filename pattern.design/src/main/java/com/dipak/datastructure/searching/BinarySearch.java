package com.dipak.datastructure.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1, 5, 7, 9, 12, 56, 89, 98};
		int number = 51;
		System.out.println(binarySearch(number, arr, 0, arr.length));
		
	}
	
	
	public static int binarySearch(int number, int[] arr, int left, int right) {
		int index = -1;
		int middle = (left + right)/2;
		if(left == right) {
			return -1;
		}
		if(arr[middle] == number) {
			 return middle;
		} else if(arr[middle] < number) {
			return binarySearch(number, arr, middle, right);
		} else {
			return binarySearch(number, arr, left, middle);
		}
	}
}
