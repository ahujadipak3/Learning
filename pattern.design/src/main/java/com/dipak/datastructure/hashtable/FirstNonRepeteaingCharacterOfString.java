package com.dipak.datastructure.hashtable;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeteaingCharacterOfString {

	public static void main(String[] args) {
		String string = "a green apple";
		Map<Character, Integer> countMap = new LinkedHashMap<>();
		for (int i=0; i< string.length();i++) {
			char currentChar = string.charAt(i);
			int count = countMap.get(currentChar)!= null ? countMap.get(currentChar) : 0;
			countMap.put(currentChar, ++count);
		}
		System.out.println(countMap);
		
		Set<Entry<Character, Integer>> entrySet = countMap.entrySet();
		char firstNonRepeatedChar = Character.MIN_VALUE;
		
		for(Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue() == 1) {
				firstNonRepeatedChar = entry.getKey();
				break;
			}
		}
		System.out.println(firstNonRepeatedChar);
	}
	

}
