package com.srm.day05.java;

public class Fibonacci {

	public static void main(String[] args) throws InterruptedException {
		
		FibonacciMultithread ft = new FibonacciMultithread();
		ft.start();
		
		if(ft.isAlive())
   		 System.out.println("Thread 1 is running");
   	 
		ft.join();
		
   	 if(ft.isAlive())
   		 System.out.println("Thread 1 is running...");
   	 
   	 else
   		 System.out.println("Thread 1  is terminated!");

	}
}
