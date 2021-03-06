package com.entitymapping0419.listeners;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

public class ArrayExample {

	
	public static void main(String[] args) {
		// [5, 2, [7, -1], 3, [6, [-13, 8], 4]]
		// 7       12     3    12  -39  24  4  
		List<Object> test = new ArrayList<Object>(Arrays.asList(5, 2, new ArrayList<Object>(Arrays.asList(7, -1)), 3,
				new ArrayList<Object>(Arrays.asList(6, new ArrayList<Object>(Arrays.asList(-13, 8)), 4))));

		//Integer.parseInt("");
		
		
		System.out.println(args.getClass().getSuperclass());
		System.out.println(new Object().getClass().getSuperclass());
		System.out.println(getResult(test, 1));
		
		//System.out.println(result);
	}

	public static int getResult(List list , int depth) {
		 int result = 0;
		for (Object object : list) {
			
			if (object instanceof List) {
				System.out.println("list: " + list);
				//depth = (depth+1) * depth;
				int listResult = getResult((List)object, ++depth);
				System.out.println("listresult: " + listResult + "result:" + result);
				--depth;
				result+= depth * listResult;
				System.out.println("result: " + result + "depth: "+ depth);
			} else {
				result += ((int) object * depth);
			}

		}
		return result;
	}
}
