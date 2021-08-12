package com.dipa.dsa.practice;

import java.util.HashMap;
import java.util.Map;

public class AnagramExample3 {

	public static void main(String[] args) {
		String string1 = "Dipak";
		String string2 = "Dipii";
		boolean isAnagram = true;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < string1.length(); i++) {
			int count = map.get(string1.charAt(i)) == null ? 0 : map.get(string1.charAt(i));
			map.put(string1.charAt(i), ++count);
		}
		
		System.out.println(map);
		
		// check length too
		for (int i = 0; i < string2.length(); i++) {
			char character = string2.charAt(i);
			int count = map.get(character) != null? map.get(character) : -1;
			if(count <= 0) {
				isAnagram =false;
			} else {
				map.put(character, --count);
			}
		}
		
		System.out.println(isAnagram);
	}
}
