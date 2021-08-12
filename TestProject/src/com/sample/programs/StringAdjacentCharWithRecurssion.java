package com.sample.programs;

public class StringAdjacentCharWithRecurssion {

	public static void main(String[] args) {
		String input = "aaacbb";
		StringAdjacentCharWithRecurssion a = new StringAdjacentCharWithRecurssion();
		System.out.println(a.superStringReducer(input));
	}

	public String superStringReducer(String str) {
		StringBuilder sb = new StringBuilder(str);

		if (str.length() < 1) {
			return str;
		}

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				sb.replace(i, i + 2, "");
				return superStringReducer(sb.toString());
			}
		}

		return sb.toString();
	}

}
