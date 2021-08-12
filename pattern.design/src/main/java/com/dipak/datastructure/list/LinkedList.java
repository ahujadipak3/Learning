package com.dipak.datastructure.list;

import java.util.NoSuchElementException;

public class LinkedList {

	private Node first;
	private Node last;
	private int size;

	// 12 2 5 8 10 50
	public void addFirst(int value) {
		Node node = null;
		if (isEmpty()) {
			node = new Node(value, null);
			last = node;
		} else {
			node = new Node(value, first);
		}
		first = node;
		size++;
	}

	public void removeFirst() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		size--;
		if (first == last) {
			first = last = null;
			return;
		}
		Node newFirstNode = first.getNext();
		first.setNext(null);
		first = newFirstNode;

	}

	public void removeLast() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		size--;
		if (first == last) {
			first = last = null;
			return;
		}

		Node lastNode = first;
		while (lastNode.getNext() != last) {
			lastNode = lastNode.getNext();
		}
		lastNode.setNext(null);
		last = lastNode;

	}

	public void addLast(int value) {
		Node node = new Node(value, null);
		if (isEmpty()) {
			first = node;
			last = node;
		} else {
			node = new Node(value, null);
			last.setNext(node);
		}
		last = node;
		size++;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder("[");
		if (isEmpty()) {
			return builder.append("]").toString();
		} else {
			Node node = first;
			do {
				builder.append(node.getValue());
				builder.append(",");
				node = node.getNext();
			} while (node != null);
		}
		// return builder.replace(start, end, str)
		return builder.replace(builder.length() - 1, builder.length(), "]").toString();
	}

	public int indexOf(int item) {
		Node node = first;
		int index = 0;
		do {
			if (node.getValue() == item) {
				return index;
			}
			index++;
			node = node.getNext();
		} while (node != null);
		return -1;
	}

	public boolean contains(int item) {
		return indexOf(item) != -1;
	}

	public int size() {
		return size;
	}

	public int[] toArray() {
		int[] array = new int[size];
		Node current = first;
		int index = 0;
		while (current != null) {
			array[index++] = current.getValue();
			current = current.getNext();
		}
		return array;
	}

// 
	public void reverse() {
		// 10 -> 20 -> 30
		int firstTemp = first.getValue();
		Node current = first;
		Node newFirst = null;
		Node prevNode = null;
		while (current.getNext() != null) {
			prevNode = new Node(current.getValue(), prevNode);
			newFirst = new Node(current.getNext().getValue(), prevNode);
			current = current.getNext();
			System.out.println(current);
		}
		Node node = new Node(firstTemp, null);
		last = node;
		first = newFirst;
	}

	public void reverse2() {
		// 20 15 10 5
		// p c n

		Node previous = null;
		Node current = first;
		while (current != null) {
			Node next = current.getNext();
			System.out.println(previous);
			current.setNext(previous);
			previous = current;
			current = next;
		}
		last = first;
		last.setNext(null);
		first = previous;
	}

	void testNthFromLast() {
		printNthFromLast(first, 3);
	}
	int i1 = 0;
	void printNthFromLast(Node head, int n) {
		System.out.println(" IN API1: "+head + "i: "+i1);
		if (head == null)
			return;
		printNthFromLast(head.getNext(), n);
		System.out.println(" IN API2: "+head.getValue() + "i: "+i1);
		if (++i1 == n)
			System.out.print(head.getValue());
	}
	
	// 5-> 15 -> 26-> 85 -> 98 -> 78
	public int getNthNodeFromLast(int n) {
		Node current = first;
		Node second = first;
		
		for (int i = 0; i < n-1; i++) {
			current = current.getNext();
		}
		
		while(current!=last) {
			second = second.getNext();
			current = current.getNext();
		}
		return second.getValue();
	}
	
	public void getMiddleNode() {
		Node middle1 = first; 
		Node middle2 = first;
		Node current = first.getNext();
		
		int counter =2;
		while(current != null) {
			if(counter%2 ==0) {
				middle2 = middle1.getNext();
			}else {
				middle1 = middle1.getNext();
			}
			counter++;
			current = current.getNext();
		}
		System.out.println(middle1.getValue() + " Second Node: "+ middle2.getValue());
	}
}
