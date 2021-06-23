package com.srm.day01.java;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		System.out.println("CHECKING PRIME NUMBER.");
		System.out.println("----------------------");
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		boolean isprime=true;
	for(int i=2;i<=n/2;i++)
	{
			if(n% i==0)
			{
				isprime=false;
				break;
			}
	}
	
    if(isprime)
    {
    	System.out.println("The given number is a prime number. ");
    }
    else
    {
    	System.out.println("The given number is not a prime number. ");
    }
    
	}
	}


