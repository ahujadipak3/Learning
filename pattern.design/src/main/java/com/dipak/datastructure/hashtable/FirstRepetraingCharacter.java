package com.dipak.datastructure.hashtable;

import java.util.HashSet;

public class FirstRepetraingCharacter {

	public static void main(String[] args) {
		String testString = "mahadev";
		HashSet<Character> charSet = new HashSet<>();
		char repeatedChar = Character.MIN_VALUE;
		for (int i = 0; i < testString.length(); i++) {
			if(!charSet.add(testString.charAt(i))) {
				repeatedChar = testString.charAt(i);
				break;
			}
		}
		
		System.out.println(repeatedChar);
	} 
}
