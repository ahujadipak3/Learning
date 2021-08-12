package com.dipak.datastructure.hashtable;

import java.util.LinkedList;

public class Hashtable {

	private class Entry {

		private int key;
		private String value;

		public Entry(int key, String value) {
			super();
			this.key = key;
			this.value = value;
		}
	}
	
	LinkedList<Entry>[] entries = new LinkedList[10];
	
	public void put(int key, String value) {
		int index = hash(key);
		LinkedList<Entry> list;
		if(entries[index] == null) {
			list = new LinkedList<>();
			list.addLast(new Entry(key, value));;
			entries[index] = list;
			return;
		}
		list = entries[index];
		for(Entry entry : list) {
			if(entry.key == key) {
				entry.value = value;
				return;
			}
		}
		list.addLast(new Entry(key, value));
		
	}
	
	public String get(int key) {
		int index = hash(key);
		if(index < 0 || index >= entries.length) {
			return null;
		}
		LinkedList<Entry> listOfEntries = entries[index];
		for (Entry entry : listOfEntries) {
			if(entry.key == key) {
				return entry.value;
			}
		}
		return null;
	}
	
	public boolean remove(int key) {
		int index = hash(key);
		if(index < 0 || index >= entries.length) {
			return false;
		}
		LinkedList<Entry> listOfEntries = entries[index];
		for (Entry entry : listOfEntries) {
			if(entry.key == key) {
				return listOfEntries.remove(entry);
			}
		}
		return false;
	}
	
	public int hash(int key) {
		return key % entries.length;
	}
}
