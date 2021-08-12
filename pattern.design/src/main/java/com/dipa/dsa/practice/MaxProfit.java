package com.dipa.dsa.practice;

public class MaxProfit {

	
	public static void main(String[] args) {
	
		
		int[] arr = {100, 180, 260, 310, 40, 535, 695};
		int sum = 0;
		int max = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i+1] > arr[i]) {
				sum += arr[i+1] - arr[i];
			}else {
				sum =0;
			}
			max = Math.max(max, sum);
		}
		System.out.println("max: "+ max);
		
	}
}
