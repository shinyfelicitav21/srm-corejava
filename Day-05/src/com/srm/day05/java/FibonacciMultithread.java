package com.srm.day05.java;

public class FibonacciMultithread extends Thread{

	int n1=0,n2=1,n3,i,count=10;
	
	public void run() {
		
		Thread t1 = Thread.currentThread();
		System.out.println(n1+""+n2);
		t1.setName("Fibonacci Thread.");
		
		System.out.println("Current Thread:" + t1);
		System.out.println("FIBONACCI SERIES.");
		
		try {
			
		for(int i=0;i<count;++i) {
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
			
		}
		}	
		catch(Exception e) {
			System.out.println(e);
			
		}
	}
}

