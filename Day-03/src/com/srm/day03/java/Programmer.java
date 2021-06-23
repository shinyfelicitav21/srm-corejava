package com.srm.day03.java;

import java.util.Scanner;

public class Programmer  extends Employee{
	
	Programmer(){
		System.out.println("You have chosen programmer.");
		System.out.println("");
	}
	
	double BP,GP,NP,DA,HRA,PF,SCF;
	
	Scanner sc = new Scanner(System.in);
	
		public void Calc() {
			System.out.println("Enter Basic pay of the Programmer:"); 
			
			BP = sc.nextFloat(); 
			DA=BP*0.95; 
			HRA=BP*0.15; 
			PF=BP*0.13; 
			SCF=BP*0.05; 
			
			GP=BP+DA+HRA; 
			NP=GP-PF-SCF; 
			
			System.out.println("");
			System.out.println("PROGRAMMER PAY SLIP.");
			System.out.println("--------------------");
			System.out.println("Basic Pay :"+BP); 
			System.out.println("Dearness Allowance : "+DA); 
		System.out.println("House Rent Allowance :"+HRA);
		System.out.println("Provident Fund :"+PF);
		System.out.println("Staff Club Fund :"+SCF);
		System.out.println("Gross Pay :"+GP); 
		System.out.println("Net Pay :"+NP);
			
		} 		
	}
	
