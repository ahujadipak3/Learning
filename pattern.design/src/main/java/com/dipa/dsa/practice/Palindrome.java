package com.dipa.dsa.practice;

public class Palindrome {

	public static void main(String[] args) {
		String str = "aabbccc";
		System.out.println(isPalindrome(str));
		int maxLength = 1;
		String palindromeStr = str.substring(0,1);
		for (int i = 0; i < str.length()-1; i++) {
			for (int j = i+1; j < str.length(); j++) {
				if(isPalindrome(str.substring(i, j+1))) {
					if(maxLength < (j+1-i)) {
						//System.out.println("maxLength " + j + i);
						maxLength = j-i +1;
						palindromeStr = str.substring(i, j+1);
					}
				}
			}
		}
		
		System.out.println(maxLength+ " "+ palindromeStr);
	}
	
	public static boolean isPalindrome(String string) {
		//System.out.println(string);
		int n = string.length();
		for (int i = 0; i < string.length()/2; i++) {
			if(string.charAt(i) != string.charAt(n - i -1)) {
				return false;
			}
		}
		return true;
	}
}
