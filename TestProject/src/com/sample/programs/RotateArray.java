package com.sample.programs;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		rotateLeft(arr, 2);
	}
	
	public static void rotateLeft(int[] arr, int offset) {
		int[] temp = new int[offset];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[i];
		}
		for (int i = offset; i < arr.length; i++) {
			arr[i-offset] = arr[i];
		}
		for (int i = 0; i < temp.length; i++) {
			arr[arr.length - offset+i] = temp[i];
		}
		System.out.println(Arrays.toString(arr));
	}
}
