package com.dipak.jan;

public class ArrayExample {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5};
		arr[2] = 0;
		
		Array array = new Array(3);
		System.out.println(array.toString());
		array.insert(5);
		array.insert(10);
		array.insert(51);
		System.out.println(array.toString());
		array.insert(52);
		System.out.println(array.toString());
		System.out.println(array.indexOf(51));

		System.out.println(array.max());
		
		Array anotherArray = new Array(6);
		
		anotherArray.insert(51);
		
		System.out.println(array.commonItems(anotherArray));
		
		array.reverse();
		
		array.insertAt(2, 98);
		System.out.println(array.toString());
		
		array.insertAt(1, 13);
		System.out.println(array.toString());
		
		array.insertAt(8, 67);
		System.out.println(array.toString());
	}
}
