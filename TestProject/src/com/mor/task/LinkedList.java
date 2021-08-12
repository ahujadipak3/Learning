package com.mor.task;

public class LinkedList {

	Node first;
	Node last;
	
	class Node {
		private int value;
		private Node next;
	}
	
	
	// two linkedList   1 ->  2 ->  3 -> 4 ... 5 3 4
	//                              5
	// 1 -> 2 -> 3 -> null
	public Node getCommonNode(LinkedList list1, LinkedList list2) {
		Node firstNode1 = list1.getFirst();
		Node firstNode2 = list1.getFirst();
		// Theo Si
		// 1 1
		// first LinkedList - HashMap
		// Second - 
		while(firstNode1!= null) {
			while( firstNode2 != null) {
				if(firstNode1 == firstNode2) {
					return firstNode1;
				}
				firstNode2 = firstNode2.next;
			}
			firstNode1 = firstNode1.next;	
		}
		return null;
	}


	private Node getFirst() {
		// TODO Auto-generated method stub
		return null;
	}
}
