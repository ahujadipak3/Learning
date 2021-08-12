package com.entitymapping0419.listeners;

import java.io.IOException;
import java.util.LinkedList;

public class ExceptionExample {
	
	public static void main(String[] args) throws IOException {
		
		try {
			
			LinkedList<Integer> list = new LinkedList<>();
			list.add(1);
			list.add(2);
			list.add(3);
			throw new IOException("Custom IO Exception");
		}catch(IOException ie) {
			System.out.println("In catch block");
			throw ie;
		} finally {
			throw new ArithmeticException("Finally block");
		}
		
		
		
	}
	
	// 1   00000001
	//65   000 O(n)
	// LinkedList - 
	
	
}
