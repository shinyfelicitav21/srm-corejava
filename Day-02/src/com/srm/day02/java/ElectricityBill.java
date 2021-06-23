package com.srm.day02.java;

import java.util.Date;
import java.util.Scanner;

public class ElectricityBill {
	
	public String cno,cname,ebtype;
	public double preread,curread,units, amt;
	Date date=new Date();
	
	Scanner sc = new Scanner(System.in);
	public void details()
	{
	
	System.out.println("Enter Consumer Number: ");
	cno = sc.next();
	System.out.println("Enter Consumer Name: ");
	cname = sc.next();
	System.out.println("Enter the EB Type:");
	ebtype = sc.next();
	System.out.println("Enter Previous Reading : ");
	preread = sc.nextInt();
	System.out.println("Enter Current Reading :");
	curread = sc.nextInt();
	}
	
	public void calc()
	{
		units=curread-preread;
    	if(ebtype.equals("Domestic"))
    	{
    		if (units<=100)
    		amt=1 * units;
    		else if (units>100 && units<=200)
    		amt=2.50*units;
    		else if(units>200 && units<=500)
    		amt= 4*units;
    		else
    		amt= 6*units;
    	}
    	
    	else if(ebtype.equals("Commercial"))
    	{
    		if (units<=100)
    		amt=2 * units;
    		else if (units>100 && units<=200)
    		amt=4.50*units;
    		else if(units>200 && units<=500)
    		amt= 6*units;
    		else
    		amt= 7*units;
    	}
    	
    	else
    	{
    	   System.out.println("Please enter the valid EB Type!!"); 
    	}
    }
	
    public void display()
    {
    	System.out.println("----------------------------------------------------------");
    	System.out.println("                  ELECTRICITY BILL.                      ");
    	System.out.println ("\t Date:"        +date);
    	System.out.println("\t Consumer Number:  "+cno);
    	System.out.println("----------------------------------------------------------");
    	System.out.println("\t Consumer Name:    "+cname);
    	System.out.println("\t EB Type:          "+ebtype);
    	System.out.println("\t Previous Reading: "+preread);
    	System.out.println("\t Current Reading:  "+curread);
    	System.out.println("\t Units:            "+units);
    	System.out.println("\t Bill amount:      "+amt);
    	System.out.println("----------------------------------------------------------");
    }
    
	public static void main(String[] args) {
		System.out.println("ELECTRICITY BILL CALCULATION.");
		System.out.println("-----------------------------");
	ElectricityBill eb=new ElectricityBill();
	eb.details();
	eb.calc();
	eb.display();
	}
}
