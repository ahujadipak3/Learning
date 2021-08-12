package com.dipak.datastructure.hashtable;

public class HashtableExample {

	public static void main(String[] args) {
		Hashtable table = new Hashtable();
		table.put(1, "Dipak");
		table.put(11, "Dipak-1");
		table.put(2, "Dipak-2");
		
		table.remove(11);
		System.out.println(table.get(1));
		System.out.println(table.get(11));
		
	}
}
