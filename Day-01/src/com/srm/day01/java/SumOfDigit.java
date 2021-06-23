package com.srm.day01.java;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("FINDING SUM OF DIGITS.");
		System.out.println("---------------------");
		int num, rem, sum= 0;
		
		System.out.println("Enter the digits:");
		num = sc.nextInt();
		
		while(num > 0) {
			rem = num % 10;
			sum = sum+ rem;
			num = num / 10;
		}
		
		System.out.format("Sum of the digits :%d", sum);
	}
}


