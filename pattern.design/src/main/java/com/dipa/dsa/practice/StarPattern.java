package com.dipa.dsa.practice;

public class StarPattern {

	public static void main(String[] args) {
		
		int line = 8;
		printStars(line);
		
	}

	public static void printStars(int line) {
		
		
		for (int i = 1; i <= line; i++) {
			boolean initialSpaceDone = false;
			
			for (int j = line -i; (j > 0) && !initialSpaceDone ; j--) {
				System.out.print(" ");
			}
			initialSpaceDone = true;
			
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}
