package com.srm.day05.java;

public class ThreadClass {
	
	   
	   public static void main(String args[]) { 
		   System.out.println("DEADLOCK USING SYNCHRONIZATION.");
		   System.out.println("-------------------------------");
	      ThreadOne t1 = new ThreadOne();
	      ThreadTwo t2 = new ThreadTwo();
	      t1.start();
	      t2.start();

}
}
