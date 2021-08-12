package com.dipa.dsa.practice;

import java.util.HashMap;
import java.util.Map;

public class CamelCaseString {

	public static void main(String[] args) {
		System.out.println(camelCaseString("this_is_var"));
        Map<Character, Integer> countMap = new HashMap<>();
        //countMap.contai
	}
	
	public static String camelCaseString(String string) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while(i < string.length()) {
			Character character = string.charAt(i);
			if(character == '_') {
				sb.append(Character.toUpperCase(string.charAt(i+1)));
				i++;
			}else {
				sb.append(character);
			}
			i++;
		}
		
		return sb.toString();
	}
}
