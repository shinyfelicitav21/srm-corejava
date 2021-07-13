package com.srm.day19.java;

import java.util.*;

public class EmailValidation {
	
	public static void main(String[] args) {
		
	      Scanner sc = new Scanner(System.in);
	      System.out.println("VALIDATIONG EMAIL USING REGEX.");
	      System.out.println("------------------------------");
	      System.out.println("Enter your email: ");
	      String email = sc.next();
	      String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	     
	      boolean b = email.matches(regex);
	      if(b) {
	         System.out.println("Given Email is Valid.");
	      } else {
	         System.out.println("Invalid Email Address!");
	         
	      }
	   }
	}