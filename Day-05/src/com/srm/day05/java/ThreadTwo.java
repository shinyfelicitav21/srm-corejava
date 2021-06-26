package com.srm.day05.java;

public class ThreadTwo  extends Thread {
	
	private static final String Lock1 = "Shiny";
	private static final String Lock2 = "Sweety";
	
    public void run() {
    	
        synchronized (Lock1) {
           System.out.println("Thread 2: Holding lock 1.");
           
           try { Thread.sleep(10); }
           
           catch (InterruptedException e) {}
           System.out.println("Thread 2: Waiting for lock 2..");
           
           synchronized (Lock2) {
              System.out.println("Thread 2: Holding lock 1 & 2.");
              
           }
        }
     }
  }
