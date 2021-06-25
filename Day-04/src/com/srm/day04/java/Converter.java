package com.srm.day04.java;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) 
		{
		System.out.println("CURRENCY CONVERTER CALCULATION.");
		System.out.println("-------------------------------");
		Scanner s=new Scanner(System.in);
		int choice,ch;
		
		Currecncy c=new Currecncy();
		Distance d=new Distance();
		Timer t=new Timer();
		
		do
		{
			
		System.out.println("01 - Dollar to INR");
		System.out.println("02 - INR to Dollar ");
		System.out.println("03 - EURO to INR ");
		System.out.println("04 - INR to EURO");
		System.out.println("05 - Yen to INR ");
		System.out.println("06 - INR to Yen ");
		System.out.println("07 - Meter to Kilometer ");
		System.out.println("08 - Kilometer to Meter ");
		System.out.println("09 - Miles  to Kilometer ");
		System.out.println("10 - Kilometer to Miles");
		System.out.println("11 - Hours to Minutes");
		System.out.println("12 - Hours to Seconds");
		System.out.println("13 - Seconds to Hours");
		System.out.println("14 - Minutes to Hours");
		System.out.println("----------------------------");
		System.out.println("Enter your choice:");
		
		choice=s.nextInt();
		
		switch(choice)
		{
		case 1:
		{
		c.euroToInr();
		break;
		}
		case 2:
		{
		c.inrToDollar();
		break;
		}
		case 3:
		{
		c.euroToInr();
		break;
		}
		case 4:
		{
		c.inrToEuro();
		break;
		}
		case 5:
		{c.yenToInr();
		break;}
		case 6 :
		{
		c.inrToYen();
		break;
		}
		case 7  :
		{
		d.meterToKm();
		break;
		}
		case 8  :
		{
		d.kmToMeter();
		break;
		}
		case 9  :
		{
		d.milesToKm();
		break;
		}
		case 10  :
		{
		d.kmToMiles();
		break;
		}
		case 11 :
		{
		t.hoursToMinutes();
		break;
		}
		case 12 :
		{
		t.hoursToSeconds();
		break;
		}
		case 13 :
		{
		t.secondsToHours();
		break;
		}
		case 14 :
		{
		t.minutesToHours();
		break;
		}}
		
		System.out.println("---------------------------------");
		System.out.println("Enter 0 to  quit and 1 to continue..");
		ch=s.nextInt();
		}while(ch==1);
		}
	
	}


