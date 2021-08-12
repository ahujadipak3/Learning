package com.dipak.datastructure.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 4, 8, 3, 1, 2 };
		new MergeSort().sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public int[] mergeSort(int[] arr) {

		return arr;
	}

	public void sort(int[] arr) {

		if (arr.length < 2) {
			return ;
		}
		int middle = arr.length / 2;
		int[] left = new int[middle];
		int[] right = new int[arr.length - middle];

		for (int i = 0, j = 0; i < arr.length; i++) {
			if (i < middle) {
				left[i] = arr[i];
			} else {
				right[j++] = arr[i];
			}
		}

		sort(left);
		sort(right);

		int size = left.length + right.length;
		int[] result = new int[size];
		merge(left, right, arr);
	}

	public void merge(int[] left, int[] right, int[] result) {
		// 1 5 4 8
		// i =0.. j 0 k ==0
		// i = 1, k=1 j=0
		// i=1, k=2, j=1
		// i=2, k=3, j =1
		// 1 4
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] >= right[j]) {
				result[k++] = right[j++];
			} else {
				result[k++] = left[i++];
			}
		}

		while (i < left.length) {
			result[k++] = left[i++];
		}

		while (j < right.length) {
			result[k++] = right[j++];
		}
	}
}
