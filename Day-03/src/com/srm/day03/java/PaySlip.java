package com.srm.day03.java;

import java.util.Scanner;

public class PaySlip {

	public static void main(String[] args) {
		System.out.println("EMPLOYEE PAY SLIP.");
		System.out.println("------------------");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("01 - Programmer.");
		System.out.println("02 - Assistant Programmer.");
		System.out.println("03 - Associate Programmer.");
		System.out.println("04 - Programmer.");
		System.out.println("");
		System.out.println("Enter designation choice:");
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1: Programmer pgmr = new Programmer();
			pgmr.details();
			pgmr.display();
			pgmr.Calc();
			break;
		
	   case 2: AssistantProfessor ap = new AssistantProfessor();
		ap.details();
		ap.display();
		ap.Calc();
		break;
	
	case 3: AssociateProfessor asp = new AssociateProfessor();
		asp.details();
		asp.display();
		asp.Calc();
		break;
	
	case 4: Professor prof = new Professor ();
		prof.details();
		prof.display();
		prof.Calc();
		break;
		
	}	
	}
	}

