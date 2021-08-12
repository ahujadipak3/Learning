package com.java.programs;

import java.util.Arrays;

public class ArraySort {

	// [1, 3,5]
	// [2,6]

	// arr[5]
	//
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		if(s1==s2) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
		int[] first = { 1, 8 };
		int[] second = { 2, 6, 7 };
		int[] result = new ArraySort().sortArray(first, second);

		System.out.println(Arrays.toString(result));
	}

	public int[] sortArray(int[] first, int[] second) {
		int size = first.length + second.length;
		int[] result = new int[size];
		int index = 0;
		int counter = 0;
		for (int i = 0; i < first.length; i++) {
			while (counter < second.length & index < size) {
				if (first[i] < second[counter]) {
					result[index++] = first[i];
					first[i] =0;
					break;
				} else {
					result[index++] = second[counter];
					second[counter] = 0;
					counter++;
					// continue;
				}
			}
		}
		
		System.out.println("counter:: "+ counter);
		while(counter < second.length) {
			result[index++] = second[counter++];
		}
		System.out.println(Arrays.toString(first));
		System.out.println(Arrays.toString(second));
		return result;
	}

}
