package com.srm.day05.java;

public class ThreadOne extends Thread {
	
	private static final String Lock1 = "XYZ";
	private static final String Lock2 = "YYY";
	
    public void run() {
       
		synchronized (Lock1) {
           System.out.println("Thread 1: Holding lock 1.");
           
           try { Thread.sleep(10); }
           
           catch (InterruptedException e) {}
           System.out.println("Thread 1: Waiting for lock 2..");
           
           synchronized (Lock2) {
              System.out.println("Thread 1: Holding lock 1 and 2.");
              
           }

		}
    }
}