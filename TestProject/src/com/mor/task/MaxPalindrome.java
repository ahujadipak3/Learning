package com.mor.task;

import java.util.HashMap;
import java.util.Map;

public class MaxPalindrome {

	public static void main(String[] args) {

		String str = "a";
		// ababa
		//
		
		// aaabbb.. 4
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		int count = 0;
		boolean isSingleDigitPresent = false;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (count % 2 == 0) {
				count = count + entry.getValue();
			} else if(!isSingleDigitPresent)  {
				isSingleDigitPresent = true;
				count = count + entry.getValue();
			}
		}
		System.out.println(count);
	}
}
