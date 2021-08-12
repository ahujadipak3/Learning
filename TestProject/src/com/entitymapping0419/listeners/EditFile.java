package com.entitymapping0419.listeners;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EditFile {

	public static void main(String[] args)  {
		
		PrintWriter writer=null;
		BufferedReader br = null;
		try {
			writer = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Nividous\\RPACC51_2103\\context.xml",true)));
			br = new BufferedReader(new FileReader(new File("C:\\Nividous\\RPACC51_2103\\context.xml")));
			// ... then inside your loop ...
			String line;
			while ((line = br.readLine()) != null) {
			    if ("/>".equals(line.trim())) {
			    	System.out.println(line);
			        line = line.replace("/>",
			                " ");
			        writer.println(line);
			    }
			    // Always write the line, whether you changed it or not.
			    
			}
	
		} catch(IOException ie) {
			ie.printStackTrace();
		}finally {
			writer.close();
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// ... and finally ...

		/*
		 * File realName = new File("d:\\book.txt"); realName.delete(); // remove the
		 * old file new File("d:\\book.temp").renameTo(realName); // Rename tem
		 */	}

}
