package com.entitymapping0419.listeners;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutablePersonImpl {

	public static void main(String[] args) {
		System.out.println(Integer.parseInt("1111", 2));
		List<String> list = new ArrayList<String>();
		list.add("dipak");
		ImmutablePerson p = new ImmutablePerson(1,"test", 12, list);
		System.out.println(p);
		list.add("test");
		System.out.println(p);
		
		
		List<String> unmodifiedList = Collections.unmodifiableList(list);
		System.out.println(unmodifiedList);
		unmodifiedList.add("test2");
		System.out.println(unmodifiedList);
		
		
	}
}
