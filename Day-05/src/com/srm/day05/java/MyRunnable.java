package com.srm.day05.java;

public class MyRunnable implements Runnable {
	
	public void run() {
		
	try {
		for(int i=0;i<10;i++) {
			Thread.sleep(500);
		}
	}		
		
	catch(InterruptedException e) 
	{ 
		System.out.println(e);
	}
   	
	}
}
