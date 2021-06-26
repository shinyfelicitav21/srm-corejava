package com.srm.day05.java;

public class MyThread extends Thread {

			public void run()
			{
				Thread t1 = Thread.currentThread();
				t1.setName("MyThread");
				System.out.println("Current Thread:" + t1);
				
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




