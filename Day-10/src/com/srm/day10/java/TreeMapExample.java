package com.srm.day10.java;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		System.out.println("DISPLAYING THE BALANCE OF ACC.NO USING TREEMAP.");
		System.out.println("-----------------------------------------------");
		TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>(); 
		
	      map.put(1123456786,67000);    
	      map.put(1123456786,66500);    
	      map.put(1234454567,56000);  
	      map.put(1276345907,34666); 
	      map.put(1456232189,99870); 
	
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Account Number: ");
	       
	        int ac=sc.nextInt();
	        System.out.println(""); 
	        
		       if(map.containsKey(ac)) {
		    	   int value = map.get(ac);
		    	   System.out.println("Balance Amount in the given acc.no: \n"+value);
		    	   
		       }
	      }    
	}

