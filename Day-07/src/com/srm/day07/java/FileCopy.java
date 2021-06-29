package com.srm.day07.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {
		
		byte[] b = new byte[500];
		
	    try {
	    	
	      FileInputStream fin = new FileInputStream("C:\\Users\\Admin\\Documents\\Java\\Input.txt");
	      FileOutputStream fout = new FileOutputStream("C:\\Users\\Admin\\Documents\\Java\\Output.txt");

	      // reads data from a input file.
	    fin.read(b);

	      // writes data to a new file. 
	     fout.write(b);
	      System.out.println("Data in the input file is copied to a new file!!");

	      // closes the stream.
	      fin.close();
	      fout.close();
	    }
	    catch (Exception e) {
	      e.getStackTrace();

	}
	}
}


