package com.srm.day05.java;

public class Square extends Thread{
  public int number;

public Square(int number) {
	
	super();
	this.number = number;
}
  public void run() {
	  
	  System.out.println("Square:" + number* number);
	  
  }
}
