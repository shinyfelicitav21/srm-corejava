package com.srm.day03.java;

public class TV implements SmartTVRemote{
	
	public void example()
	{
		System.out.println("TV class consists of many methods.");
		System.out.println("");
	}
@Override

	public void design() {
		System.out.println("Many designs are available in current !!");
		System.out.println("");
		
	}
@Override

public void color() {
     
     System.out.println("People mostly prefer dark remote colors.");
     System.out.println("");
	}
@Override
	
	public void features() {
	
		System.out.println("Features of smart remote fits for many tech uses...");
		System.out.println("");
		
	}
@Override

public void model() {
	
	System.out.println("Brand of SAMSUNG suits best for its features!!!");
	System.out.println("");
}

	public static void main(String args[]) {
		
		System.out.println("TV REMOTE AND SMART TV REMOTE DETAILS.");
		System.out.println("--------------------------------------");
		TV t = new TV();
		t.example();
		t.design();
		t.color();
		t.features();
		t.model();
		
	}
}



