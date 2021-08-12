package com.dipak.stringmanipulation;

import java.util.Arrays;
import java.util.List;

public class CountVowels {

	public static void main(String[] args) {
		String str = "Dipak";
		List<Character> setOfVowels = Arrays.asList('A','a','E','e','I','i','O','o','U','u');
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(setOfVowels.contains(str.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
	}
}
