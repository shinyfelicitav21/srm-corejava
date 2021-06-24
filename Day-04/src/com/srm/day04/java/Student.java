package com.srm.day04.java;

import java.util.Scanner;

public class Student {
	
	 String rollno,name;
	  int mark;
	  
	  public void details() {
		  
		  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter Student Roll-No:");
		  rollno=sc.next();
		  System.out.println("Enter Student Name:");
		  name=sc.next();
		  System.out.println("Enter Student Mark:");
		  mark=sc.nextInt();
		  System.out.println("");
	  }
	  
		  public void display() {
			  
			  System.out.println("STUDENT DETAILS.");
			  System.out.println("-----------------");
			   System.out.println("STUDENT ROLL-NO:" + rollno);
			   System.out.println("STUDENT NAME:" + name);
			   
			   try {
				   if( mark>600) {
					   
					   throw new MarkOutOfBoundException(mark);
				   }
					   else {
						   System.out.println("STUDENT MARK:" +  mark);
				   }
				   
			   }catch(MarkOutOfBoundException e) {
				   System.out.println(e);
				   
			   }
		  }
	  
	public static void main(String[] args) {
		System.out.println("VALIDATING STUDENT MARK.");
		System.out.println("------------------------");
		Student s  = new Student ();
		 s.details();
		 s.display();

	}
}
