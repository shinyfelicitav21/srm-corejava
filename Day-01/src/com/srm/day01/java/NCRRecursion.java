package com.srm.day01.java;

import java.util.Scanner;

 class NCRRecursion {
	 
		double fact(double n)
		{	    	     	      
		  if (n == 0)    
	   	     return 1;    
	  	  else    
	    	     return(n * fact(n-1));    
		}

	public static void main(String[] args) {
		
		System.out.println("NCR USING RECURSIVE.");
		System.out.println("--------------------");
		NCRRecursion ncr = new NCRRecursion();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n:");
	               int n=sc.nextInt();
		System.out.println("Enter value of r:");
	               int r=sc.nextInt();
	               
		if(n>=r)
		{
			double d=ncr.fact(n)/(ncr.fact(n-r)*ncr.fact(r))	;
			
		System.out.println("Value of "+n+"c"+r+": "+d);
		}
		
		else
			System.out.println("Please enter the value of n>=r!!");
	}
}

