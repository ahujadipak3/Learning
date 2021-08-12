package com.entitymapping0419.listeners;

import java.math.BigDecimal;

public class binToDec {

	public static void main(String[] args) {
		long decimal = 0;

		StringBuilder str = new StringBuilder("");
		for (int i = 0; i < 40000; i++) {
			str.append("1");
		}

		// 7 111
		// 6 110
		// 3 011
		// 2 010
		// 1 001
		//

		
		//       11111
		// System.out.println(str.toString());
		// String binary = "101010111100110111101111101010111100";
		// String binary = "1111010101111";
		// String binary = str.toString();
		String binary = "0011100".toString();
		
		// 28 14 7 6 3 2 1 0
		// 31 11111
		// 30 11110
		// 15 01111
		// 14 01110
		// 7  00111

		
		// 28  11100
		// 14  01110
		int counter = 0;
		StringBuilder sb = new StringBuilder(binary);
		//System.out.println(sb.indexOf("1"));
		//System.out.println(sb.replace(0, 1, "").toString());
		int length = sb.length();
		//System.out.println(sb.replace(length-1, length, "0").toString());
		System.out.println("CAtual string"+ sb.toString());

		while(sb.indexOf("1")!=-1) {
			sb = removeLeadingZeroes(sb.toString());
			length = sb.length();
			System.out.println(sb.toString() +"leng ::" + length);
			counter++;
			//System.out.println("while:" +sb.toString());
			if(sb.charAt(length-1) == '0') {
				/* binary.replace 
				
				 * */
				sb.replace(length-1, length, "1");
				sb.replace(0, 1, "");
				
				
				//System.out.println("inside if budder");
			}
			else {
				//System.out.println("inside else budder");
				sb.replace(length-1, length, "0");
			}
			
		}
		
		
		
		System.out.println("counter" +counter);
		// String binary = str.toString();
//		for (int pow = (binary.length() - 1); pow > -1; pow--) {
//			if (binary.charAt(pow) == '1') {
//				decimal += (Math.pow(2, (binary.length() - pow - 1)));
//			}
//		}

		System.out.print(decimal);
//
//		int number = 799999;
//		long count = 0;
//		while (decimal != 0) {
//			System.out.println("decimal :" + decimal + "count : " + count);
//			count++;
//			if (decimal % 2 == 0) {
//				decimal = decimal / 2;
//			} else {
//				decimal--;
//			}
//		}
//		System.out.println("hii");
//		System.out.println(count);
//	}
	}
	
	public static StringBuilder removeLeadingZeroes(String str) {
	      String strPattern = "^0+(?!$)";
	      str = str.replaceAll(strPattern, "");
	      return new StringBuilder(str);
	   }
}