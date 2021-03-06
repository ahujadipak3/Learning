package com.dipa.dsa.practice;

import java.io.*;
//Java program to print largest contiguous array sum
import java.util.*;

class MSHackerRank {
	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
		
		
		NullableBook n = new NullableBook(Optional.ofNullable(null));
		Optional<String> s = n.getOptional();
		s.ifPresent((s1) -> {
			System.out.println("ifpresent");
		});
		//s.ifPresent(System.out::println).orElse("Empty");
		 
		// @formatter:on

		Thread r = new Thread(() -> {
			System.out.println("run");
			throw new RuntimeException("exception");
		});
		r.start();
		
		System.out.println("EOD");
		 
		// @formatter:on

		
	}

	static int maxSubArraySum(int a[]) {
		int size = a.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + a[i];
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;
	}
	
	
	
	
}

class NullableBook {
	Optional<String> optionalS;
	
	NullableBook(Optional<String> optionalS) {
		this.optionalS =optionalS;
	}
	
	public Optional<String> getOptional() {
		return this.optionalS;
	}
}