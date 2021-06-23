package com.srm.day03.java;

public class Person {
	
	int age,salary;
	String name,phno,add;
	
public void display1() {
	
	       System.out.println("You have chosen Employee!!");
	      System.out.println("");
	     System.out.println("EMPLOYEE DETAILS.");
	     System.out.println("-----------------");
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Age:"+age);
		System.out.println("Employee Phone Number:"+phno);
		System.out.println("Employee Address:"+add);
		System.out.println("-------------------------");
		
	}

	public void printSalary() {
		
		System.out.println("Salary:" + salary);
		
	}
}
