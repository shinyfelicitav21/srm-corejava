package com.srm.day04.java;

import java.util.Scanner;

public class Currecncy {

		double inr,dollar;
		double euro,yen;
		Scanner in=new Scanner(System.in);
		
		public void dollarToInr()
		{
		System.out.println("Enter Dollar to convert into INR:");
		
		dollar=in.nextInt();
		inr=dollar*67;
		System.out.println("Dollar ="+dollar+"equal to INR="+inr);
		}
		
		public void inrToDollar()
		{
		System.out.println("Enter INR to convert into Dollars:");
		inr=in.nextInt();
		dollar=inr/67;
		System.out.println("Rupee ="+inr+"equal to Dollars="+dollar);
		}
		
		public void euroToInr()
		{
		System.out.println("Enter EURO to convert into INR:");
		euro=in.nextInt();
		inr=euro*79.50;
		System.out.println("EURO ="+euro +"equal to INR="+inr);
		}
		
		public void inrToEuro()
		{
		System.out.println("Enter INR to convert into EURO:");
		inr=in.nextInt();
		euro=(inr/79.50);
		System.out.println("INR ="+inr +"equal to EURO="+euro);
		}
		
		public void yenToInr()
		{
		System.out.println("Enter Yen to convert into INR:");
		yen=in.nextInt();
		inr=yen*0.61;
		System.out.println("YEN="+yen +"equal to INR="+inr);
		}
		
		public void inrToYen()
		{
		System.out.println("Enter INR to convert into Yen:");
		inr=in.nextInt();
		yen=(inr/0.61);
		System.out.println("INR="+inr +"equal to YEN="+yen);
		
		}

}
