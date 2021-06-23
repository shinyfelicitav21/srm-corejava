package com.srm.day01.java;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		System.out.println("COUNTING NO.OF.EVEN AND ODD.");
		System.out.println("-----------------------------");
		 Scanner sc=new Scanner(System.in);
		    int num;
		    System.out.println("Enter the number:");
		    num=sc.nextInt();
		    int odd=0,even=0;
		    while(num!=0)
		    {
		        int rem=num%10;
		        if(rem%2==1)
		            odd++;
		        else
		            even++;
		        num/=10;
		    }
		    
		    System.out.println("No.of.even digits = "+even);
		    System.out.println("No.of.odd digits = "+odd);
		    sc.close();
	}

}
