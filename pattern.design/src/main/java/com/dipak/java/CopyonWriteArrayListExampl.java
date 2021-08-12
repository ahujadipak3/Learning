package com.dipak.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CopyonWriteArrayListExampl {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		Iterator<Integer> iterator = list.iterator();
		System.out.println(list);
		/*
		 * for (Integer i : list) { System.out.println(i); list.remove(0); }
		 */

		while (iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		System.out.println(list);
	}
}
