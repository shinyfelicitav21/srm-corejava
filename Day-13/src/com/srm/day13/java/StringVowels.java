package com.srm.day13.java;

import java.util.Scanner;

public class StringVowels {

	public static void main(String[] args) {
		
		int count = 0;
	      System.out.println("Enter a string: ");
	      
	      Scanner sc = new Scanner(System.in);
	      String str = sc.nextLine();
	      
	      for (int i=0 ; i<str.length(); i++){
	         char ch = str.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
	            count ++;
	         }
	      }
	      
	      System.out.println("");
	      System.out.println("No.of.vowels in the given string: \n"+count);

	}
}
