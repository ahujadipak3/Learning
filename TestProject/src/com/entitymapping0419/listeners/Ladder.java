package com.entitymapping0419.listeners;

import java.util.Arrays;
import java.util.Comparator;

public class Ladder {

	public static void main(String[] args) {
		
		try {
			//doStuff("X");
			
			String[] cities = {"Bang", "Pun", "San F","New Yo"};
			
			/*
			 * Arrays.sort(cities, (String s1, String s2) -> { return s2.compareTo(s1); });
			 */
			System.out.println(Arrays.toString(cities));
			System.out.println(Arrays.binarySearch(cities, "New Yo"));
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("exec");
		}
		//00000doStuff("X");
	}
	
	static int doStuff(String ar) {
		return Integer.parseInt(ar);
	}
}
