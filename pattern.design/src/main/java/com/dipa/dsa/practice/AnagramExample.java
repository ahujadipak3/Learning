package com.dipa.dsa.practice;

import java.util.Arrays;
import java.util.Collections;

public class AnagramExample {
	public static void main(String[] args) {
		String s1 = "geeksforgeeks";
		String s2 = "forgeeksgeeks";
		boolean isAnagram = true;
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(c1.length != c2.length) {
			isAnagram = false;
			System.out.println("false");
			return;
		}
		
		for (int i = 0; i < c2.length; i++) {
			if(c1[i] != c2[i])
				isAnagram = false;
 		}
		
		System.out.println(isAnagram);
	}

}
