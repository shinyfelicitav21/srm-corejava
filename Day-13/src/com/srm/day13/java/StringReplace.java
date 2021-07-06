package com.srm.day13.java;

import java.util.Scanner;

public class StringReplace {
	
private void replaceStringMethod(String str, String str1, String str2) {
		
		System.out.println("Original String: \n"+str);
		System.out.println();
		String rstr=str.replaceAll(str1,str2);
		System.out.println("New String: \n"+rstr);
	}

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		System.out.println("");
		System.out.println("Search string: ");
	
		String str1=sc.nextLine();
		System.out.println("");
		System.out.println("Replace string: ");
		String str2=sc.nextLine();
		System.out.println("");
		
		StringReplace sr=new StringReplace();
		sr.replaceStringMethod(str,str1,str2);
		
    }
}
