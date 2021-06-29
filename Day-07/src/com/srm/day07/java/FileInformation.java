package com.srm.day07.java;

import java.io.*;

public class FileInformation {

	public static void main(String[] args) {
		
		System.out.println("FILE INFORMATION.");
		System.out.println("-----------------");
		//Scanner sc = new Scanner(System.in);
        
       // String fname= sc.nextLine();
		
		try {
			
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name of the file:");
        String fname=br.readLine();
        FileDetails f = new FileDetails();
        f.getFileDetails(fname);
        f.typeOfFile(fname);
        
		}catch(IOException e) {
			System.out.println(e);
			
		}
	}
}
