package com.srm.day04.java;

import java.util.Scanner;

public class Distance {
	
	double km,meter,miles;
	Scanner sc = new Scanner(System.in);
	
	public void kmToMeter()
	{
	System.out.print("Enter in KM:");
	km=sc.nextDouble();
	meter=(km*1000);
	System.out.println(km+"KM " +"equal to"+meter+"Metres.");
	}
	
	public void meterToKm()
	{
	System.out.print("Enter in Meter:");
	meter=sc.nextDouble();
	km=(meter/1000);
	System.out.println(meter+"Miles" +"equal to"+km+"Kilometres.");
	}
	
	public void milesToKm()
	{ 
	System.out.print("Enter in Miles:");
	miles=sc.nextDouble();
	km=(miles*1.60934);
	System.out.println(miles+"Miles" +"equal to"+km+"Kilometres.");
	}
	
	public void kmToMiles()
	{
	System.out.print("Enter in KM:");
	km=sc.nextDouble();
	miles=(km*0.621371);
	System.out.println(km+"KM" +"equal to"+miles+"Miles.");
	
	}
	}


