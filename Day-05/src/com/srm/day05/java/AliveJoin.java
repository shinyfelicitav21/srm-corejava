package com.srm.day05.java;

public class AliveJoin {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread t1=  new MyThread();
		t1.start();
	    	
    	 MyRunnable r=new MyRunnable();
    	 Thread t2=new Thread(r);
    	 t2.start();
     	
    	 if(t1.isAlive())
    		 System.out.println("Thread 1 is running.");
    	 
    	 t1.join();
    	 
    	 
    	 if(t1.isAlive())
    		 System.out.println("Thread 1 is running.");
    	 else
    		 System.out.println("Thread 1 is terminated...");
    	 if(t2.isAlive())
    		 System.out.println("Thread 1 is running.");
    	 t2.join();

	}
}
