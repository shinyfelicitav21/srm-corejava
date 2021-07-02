package com.srm.day10.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeExample   {

	public static void main(String[] args) {
		System.out.println("USE OF COMPARATOR INTERFACE.");
		System.out.println("----------------------------");
		 String name="",desgn="";
		   int eno=0;
		   
		ArrayList<EmployeeDetails> list = new ArrayList<EmployeeDetails>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the arraylist:");
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter Employee ID:");
			eno=sc.nextInt();
			System.out.println("Enter Employee Name:");
			name=sc.next();
			System.out.println("Enter Employee Designation:");
			desgn=sc.next();
			System.out.println("");
			
		list.add(new EmployeeDetails(desgn,name,eno));
	}
		for(int i=0;i<list.size();i++) {
			
			System.out.println("Employee Details:"+list.get(i));
			
		}
		System.out.println("");
		
		 System.out.println("Unsorted List:");
	      
		for (int i = 0; i < list.size(); i++)
	          System.out.println(list.get(i));
	
	      Collections.sort(list, new SortEmpID());

	      System.out.println("\nSorted List using ID:");
	      for (int i = 0; i < list.size(); i++)
	          System.out.println(list.get(i));

	      Collections.sort(list, new SortEmpName());
	      System.out.println("\nSorted List using Name:");
	      for (int i = 0; i < list.size(); i++)
	          System.out.println(list.get(i));
	      
}
}
