package com.srm.day10.java;

import java.util.Scanner;
import java.util.TreeMap;

public class PhoneDirectory {

	public static void main(String[] args) {
		System.out.println("USE OF TREEMAP IN PHONE DIRECTORY.");
		System.out.println("----------------------------------");
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>(); 
		
	      map.put(983460987,"Seeta");    
	      map.put(789012345,"Deepa");    
	      map.put(894578230,"Sheetal");  
	      map.put(670983457,"Suguna"); 
	      map.put(781234567,"Saranya"); 
	
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Phone Number: ");
	       
	       int pno=sc.nextInt();
	        System.out.println(""); 
	        
		       if(map.containsKey(pno)) {
		    	   String value = map.get(pno);
		    	   System.out.println("Name associated with the given ph.no: \n"+value);
		    	   
		       }
	     }
	}


