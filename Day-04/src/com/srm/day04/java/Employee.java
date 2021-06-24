package com.srm.day04.java;

import java.util.Scanner;

public class Employee {
	
  String eid,ename;
  int bpay;
  
  public void details() {
	  
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter Employee ID:");
	  eid=sc.next();
	  System.out.println("Enter Employee Name:");
	  ename=sc.next();
	  System.out.println("Enter Employee Basic Pay:");
	  bpay=sc.nextInt();
	  System.out.println("");
  }
  
	  public void display() {
		  
		  System.out.println("EMPLOYEE DETAILS.");
		  System.out.println("------------------");
		   System.out.println("EMPLOYEE ID:" + eid);
		   System.out.println("EMPLOYEE NAME:" + ename);
		   
		   try{
			   if(bpay>10000 || bpay<5000) {
			
				   throw new PayOutOfBoundException(bpay);
			   }
				   else {
					   System.out.println("EMPLOYEE BASIC PAY:" + bpay); 
			   }
			   
		   }catch(PayOutOfBoundException e) {
			   System.out.println(e);
			   
		   }   
	  }
  
	public static void main(String[] args) {
		System.out.println("VALIDATING EMPLOYEE BASIC PAY.");
		System.out.println("------------------------------");
       Employee emp = new Employee();
        emp.details();
        emp.display();
        
	}
}
