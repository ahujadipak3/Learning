package com.dipa.dsa.practice;

//you can also use imports, for example:
import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
	public static void main(String[] args) {
		int[] arr = {1,5,6};
		int[] a = new Solution().solution(arr, 4, 3);
		System.out.println(Arrays.toString(a));
	}

	public int[] solution(int[] A, int F, int M) {
		// write your code in Java SE 8
		int[] missingArr = new int[F];
		int total = (A.length + F) * M;
		int currentTotal = Arrays.stream(A).sum();
		int missingTotal = total - currentTotal;

		if (missingTotal > F * 6 || missingTotal < F * 1) {
			int[] noMeanArr = { 0 };
			return noMeanArr;
		}
		int dice = 6;
		int remainingTotal = missingTotal;
		int remainingNumbers = F;
		int counter = 0;
		while (counter < remainingNumbers && dice >= 1) {
			System.out.println(remainingTotal + " " +remainingNumbers + " dice "+ dice);
			if (remainingTotal / dice >= 1) {
				int divisor = remainingTotal / dice;
				if((remainingTotal - (divisor*dice)) < remainingNumbers-divisor) {
					dice--;
					continue;
				}
				while (divisor > 0) {
					missingArr[counter++] = dice;
					remainingTotal = remainingTotal - dice;
					divisor--;
					remainingNumbers--;
				}
			}

			dice--;
		}

		return missingArr;
	}
}
