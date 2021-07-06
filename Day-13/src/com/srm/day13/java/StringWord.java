package com.srm.day13.java;

import java.util.Scanner;

public class StringWord {

	public static void main(String[] args) {
		
		String str;
        int countWords=0;
         
        Scanner sc=new Scanner(System.in);
         
        System.out.print("Enter a string: \n");
        str=sc.nextLine();
         
        //word count
        for(int i=0; i<str.length()-1; i++)
        {
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
                countWords++;
        }
         
        System.out.println("");
        System.out.println("Total no.of.words in the string: \n"+ (countWords+1));

	}
}
