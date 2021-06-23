package com.srm.day01.java;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		System.out.println("CHECKING ARMSTRONG NUMBER.");
		System.out.println("--------------------------");
		int a, sum = 0, t, rem, dig = 0;
		
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number:");    
	    a = sc.nextInt();
	    t = a;
	    
	    while (t != 0) {
	      dig++;
	      t = t/10;
	    }
	    
	    t = a;
	    while (t != 0) {
	      rem = t%10;
	      sum = sum + power(rem, dig);
	      t = t/10;
	    }
	    
	    if (a == sum)
	      System.out.println(a + " is an armstrong number.");
	    else
	      System.out.println(a + " is not an armstrong number.");
	  }
	
	  static int power(int n, int r) {
	    int c, p = 1;
	    for (c = 1; c <= r; c++)
	      p = p*n;
	    return p;
	  }
	}

