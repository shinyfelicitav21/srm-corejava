package com.srm.day03.java;

import java.util.Scanner;

public class PersonDetails {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("");
		System.out.println("Enter Designation choice:");
		
		System.out.println("01 - Manager");
		System.out.println("02 - Employee");
		System.out.println("");
		
		int choice=sc.nextInt();
		switch(choice)
		{	
		case 1: Manager m=new Manager();
		        m.name="Sharon";
		        m.age=22;
		        m.phno="7743579801";
		        m.add="Tharamani";
		        m.salary=25000;
		        m.dept="HR";
		        m.spec="MBA";
		        m.display1();
		        m.display2();
		        m.printSalary();
		        break;
		        
		case 2: Employee03 emp=new Employee03();
		        emp.name="Sweety";
	            emp.age=26;
	            emp.phno="7768901236";
	            emp.add="Anna Nagar";
	            emp.salary=45000;
	            emp.dept="Quality";
	            emp.spec="Business Management";
	            emp.display1();
	            emp.display2();
	            emp.printSalary();
	            break;
	            
		}
	 }
	}

