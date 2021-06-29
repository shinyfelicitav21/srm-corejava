package com.srm.day07.java;

import java.io.File;

public class FileDetails {

	public void getFileDetails(String fname) {
		
	File f1 = new File(fname);
	
	if(f1.exists()) {
		
		 System.out.println("");
		System.out.println("File name:"+ f1.getName());
		System.out.println("File can read:"+ f1.canRead());
		System.out.println("File can write:"+ f1.canWrite());
		
		System.out.println("File length:"+ f1.length());
		
	}
	
	else {
		System.out.println("File does not exists...");
		
	}	
	}

	public void typeOfFile(String fname) {
		
			String extension = "";
			int i = fname.lastIndexOf('.');
		
			if (i >= 0) { 
				extension = fname.substring(i+1); 
				}
			System.out.println("File type:"+ extension);
			
		}
	}


