package com.dipa.dsa.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class FindLongestEvenWord {

	public static void main(String[] args) {
		String string = "The magic of String";
		
		String str[] = string.split(" ");
		int maxEvenLenght = 0;
		String maxEventstring = "";
		for (int i = 0; i < str.length; i++) {
			if(str[i].length() %2 ==0 && str[i].length() > maxEvenLenght) {
				maxEvenLenght = str[i].length();
				maxEventstring = str[i];
			}
		}
		
		
		String string1 = Arrays.stream(string.split(" ")).filter(s->s.length()%2==0).max(Comparator.comparingInt(String::length)).get();


		System.out.println(string1);
		System.out.println(maxEvenLenght);
		System.out.println(maxEventstring);
	}
}
