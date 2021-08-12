package com.dipak.datastructure.list;

import java.util.Arrays;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst(5);
		list.addFirst(10);
		list.addFirst(15);
		list.addFirst(20);
		/*
		 * list.addFirst(10); list.addLast(15); list.addLast(25); list.addFirst(3);
		 */
		System.out.println(list.toString());
		
		System.out.println(list.indexOf(11));
		
		System.out.println(list.contains(15));
		//list.removeLast();
		
		System.out.println(list.toString());
		System.out.println(list.size());
		
		int[] array= list.toArray();
		System.out.println(Arrays.toString(array));;
		/* System.out.println(); */
		
		list.reverse2();
		System.out.println(list.toString());
		list.addLast(25);
		list.addLast(30);
		System.out.println(list.toString());
		//list.testNthFromLast();

		System.out.println(list.getNthNodeFromLast(3));
		
		list.getMiddleNode();
		list.removeLast();
		list.getMiddleNode();
	}
}
