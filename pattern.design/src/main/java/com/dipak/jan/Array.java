package com.dipak.jan;

public class Array {

	private int[] arr;
	private int counter = 0;
	Array(int length) {
		this.arr = new int[length];
	}
	
	public void insert(int item) {
		if(counter == arr.length) {
			int[] arrNew = new int[counter*2];
			for (int i = 0; i < counter; i++) {
				arrNew[i] = arr[i];
			}
			arr = arrNew;
		}
		this.arr[counter++] = item;
	}
	
	private int size() {
		return this.arr.length;
	}
	
	public String toString() {
		return java.util.Arrays.toString(arr);
		
	}
	
	public void removeAt(int index) {
		if(index >= 0 && index < counter) {
			for (int i = index; i < arr.length -1; i++) {
				arr[i] = arr[i+1];
			}
			counter--;
		}
		
	}
	
	public int indexOf(int element) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == element) {
				return i;
			}
		}
		return -1;
		
	}
	
	public int max() {
		int max = arr[0];
		for(int i=1; i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public int getElement(int index) {
		return this.arr[index];
	}
	
	public Array commonItems(Array anotherArray) {
		
		if(counter == 0 ) {
			return null;
		}
		Array commonElementsArray = new Array(counter);
		int count= 0;
		for(int i=0; i< counter; i++) {
			for(int j=0; j< anotherArray.size(); j++) {
				if(this.arr[i] == anotherArray.getElement(j)) {
					commonElementsArray.insert(arr[i]);
					continue;
				}
			}
		}
		return commonElementsArray;
	}
	
	public Array reverse() {
		System.out.println("Reversing an array" + counter);
		Array reversedArray = new Array(counter);
		for (int i = counter-1; i >=0 ; i--) {
			System.out.println(arr[i]);
			reversedArray.insert(arr[i]);
		}
		return reversedArray;
	}
	
	public void insertAt(int index, int element) {
		
		if(index >arr.length) {
			int[] arrNew = new int[this.counter*2];
			for (int i = 0; i < arr.length; i++) {
				arrNew[i] = arr[i];
			}
			arr = arrNew;
		}
		
		if(index >=counter) {
			arr[index] = element;
			counter = index +1;
			return;
		}
		
		// 5, 51, 15, 86
		
		System.out.println("counter at:"+ counter);
		for(int i=counter-1; i>= index; i--) {
			arr[i+1] = arr[i];
		}
		arr[index] = element;
		counter++;
	}
 }
