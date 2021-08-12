package com.dipa.dsa.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.management.monitor.CounterMonitor;

public class FindOccuranceAndSort {

	
	public static void main(String[] args) {
		String str = "FindOcurance";
		
		Map<Character, Integer> countMap = new HashMap<>();
		
		
		for (int i = 0; i < str.length(); i++) {
			Character currentChar = str.charAt(i);
			int tempCount = countMap.get(currentChar)==null ? 0 : countMap.get(currentChar);
			Integer result = countMap.containsKey(currentChar) ? countMap.put(currentChar, ++tempCount) : countMap.put(currentChar, 1) ;
			
			
		}
		System.out.println(countMap);
		
		//countMap.entrySet().
		
		//List<Character> list= 
				countMap.entrySet().stream()
				.sorted((c1, c2) -> {
					int result = c2.getValue().compareTo(c1.getValue());
					if(result == 0) {
						result = c2.getKey().compareTo(c1.getKey());
					}
					return result;
				}).forEach(e -> {
					System.out.print(e.getKey() + "" + e.getValue());
				});
				//.map(c -> c.getKey())
			
		
		//System.out.println(list);
	}
}
