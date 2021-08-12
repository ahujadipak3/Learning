package com.dipa.dsa.practice;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CharcterFrequency {

	public static void main(String[] args) {
		String string = "aaddcbb";
		Map<Character, Integer> map = new TreeMap<>();
		for (int i = 0; i < string.length(); i++) {
			char currentChar = string.charAt(i);
			if(map.containsKey(currentChar)) {
				map.put(currentChar, map.get(currentChar)+1);	
			}else {
				map.put(currentChar, 1);
			}
		}
		
		System.out.println(map);
		StringBuilder sb = new StringBuilder();
		for(Entry entry :map.entrySet()) {
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
		
		System.out.println(sb.toString());
	}
}
