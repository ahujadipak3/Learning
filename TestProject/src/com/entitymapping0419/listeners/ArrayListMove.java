package com.entitymapping0419.listeners;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMove {
	public static void main(String[] args) {

		List<Integer> array = new ArrayList<Integer>(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2));
		
		// 2 1 2 2 2 3 4 2
		// 1 2 2 2 2 3 4 2  -- 2nd index =2  , index = 5..
		// 1 3 4 2 2 2 6 2  -- 2nd index =3  , index = 6..
		int toMove = 2;
		int indexOfMovedItem = 0;
		
		for (int i = 0; i < array.size(); i++) {
			if(!(array.get(i) == toMove)) {
				
			}
		}
		
		
		char char1 = 'a';
		//Arrays.toString(a)
		System.out.println(char1);
		
		// 100
		//  256 128 64 32 16 8 4 2 1
		//   1   0  0   1  0  0 0 1 0
		
		double a = 290.05;
		int b = 100;
		byte c = (byte)a;
		byte d = (byte)b;
		
		System.out.println(c + "  " + d);
	}

}
