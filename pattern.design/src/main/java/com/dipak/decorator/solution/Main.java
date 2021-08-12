package com.dipak.decorator.solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import interviews.BaseClass;
import interviews.ChildClass;

public class Main {

	public static void main(String[] args) {
		//CloudStream cs = new CloudStream();
		Stream es = new CompressedStream(new EncryptedStream(new CloudStream()));
		
		// 
		
		/*
		 * new BufferedReader(FileReader(new File())); es.write("Some Data");
		 */
		
		/* new FileWr */
		
		//List<BaseClass> list =new ArrayList<ChildClass>();
	}
}
