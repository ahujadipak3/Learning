package com.dipak.datastructure.list;

public class SBTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Dipak");
		
		System.out.println(sb.replace(sb.length()-1, sb.length(), "L").toString());
		System.out.println(sb.replace(sb.length()-1, sb.length()-1, "L").toString());
	}
}
