package com.dipak.stringmanipulation;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Dipak";
		char[] charArray = new char[str.length()];
		for (int i = str.length()-1, j=0; i >=0 ; i--,j++) {
			charArray[j] = str.charAt(i);
		}
		String newStr = Arrays.toString(charArray);
		System.out.println(newStr);
		
	}
}
