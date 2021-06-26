package com.srm.day05.java;

public class Cube extends Thread{
	 public int number;

	public Cube(int number) {
		super();
		this.number = number;
	}
	
	public void run() {
		  System.out.println("Cube:" + number* number* number);
		  
	  }
}
