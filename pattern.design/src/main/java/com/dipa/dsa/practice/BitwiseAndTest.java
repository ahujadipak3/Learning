package com.dipa.dsa.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BitwiseAndTest {

	public static void main(String[] args) {

		int number1 = 6;
		int number2 = 8;
		
		int result = number1 & number2;
		
		System.out.println("And Operation:" +result);

		
		List<String> list = Arrays.asList("Dipak", "test");
		Stream<String> stream  = list.stream();
		
		Stream<List<String>> Stream1 = Stream.of(list);
		stream.filter((p) -> p.equals("test") ).forEach(System.out::println);
	}

}
