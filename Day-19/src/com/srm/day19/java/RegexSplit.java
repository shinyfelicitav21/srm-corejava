package com.srm.day19.java;

import java.util.Scanner;

public class RegexSplit {

	public static void main(String args[]) 
    { 
        String str="Hello,Welcome to our new portal!."; 
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string: ");
//        str=sc.next();
        //System.out.println("");
        String[] arr = str.split("[, .!]+"); 
         System.out.println("Number of substrings: "+arr.length);
         System.out.println("");
         
         for(int i=0; i< arr.length; i++)
         {
             System.out.println(arr[i]);
         }
 
    } 
}