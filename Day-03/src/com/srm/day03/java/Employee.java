package com.srm.day03.java;

import java.util.Scanner;

public class Employee  {
	
	String eid, ename,emailid,eaddress, emobno;
	
	public void  details() { 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("EMPLOYEE DETAILS.");
		System.out.println("-----------------");
		System.out.println("Enter Employee ID :"); 
		eid = sc.nextLine(); 
		System.out.println("Enter Employee Name :"); 
		ename =sc.nextLine(); 
		System.out.println("Enter E-Mail ID :"); 
		emailid = sc.nextLine();
		System.out.println("Enter Mobile Number:"); 
		emobno= sc.nextLine(); 
		System.out.println("Enter Employee Address:"); 
		eaddress = sc.nextLine(); 
		System.out.println("-----------------------------");
	}
		
	public void  display() { 
		
		System.out.println("Employee ID: "+eid); 
		System.out.println("Employee Name: "+ename); 
		System.out.println("Employee E-Mail ID: "+emailid); 
		System.out.println("Employee Mobile Number: "+emobno);
		System.out.println("Employee Address: "+eaddress);
		System.out.println("-----------------------------");
	}
	}
