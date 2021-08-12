package com.sample.programs;

public class StringAdjacentCharacterRemoval {

	public static void main(String[] args) {
		String str = "aa"; // baab
		StringBuilder sb = new StringBuilder();
		char previous = Character.MIN_VALUE;
		int prevIndex = -1;
		for (int i=0; i< str.length(); i++) {
			char current = str.charAt(i);
			char next = i!=str.length()-1 ? str.charAt(i+1) : Character.MIN_VALUE;
			if(current == next) {
				i = i+1;
			} else if(previous == current) {
				sb.replace(prevIndex, prevIndex+1, "");
			}
			else {
				previous = current;
				prevIndex = i;
				sb.append(current);
				
			}
		}
		
		System.out.println(sb.toString());
	}
	
	public String checkForRepetativeChar(String input) {
		
		
		return null;
	}
}
