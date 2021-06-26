package com.srm.day05.java;

import java.util.Random;

public class RandomInteger extends Thread {
	
	Random r= new Random();
	
	public void run() {
		
		for(int i=0;i<10;i++) {
			
			int random = r.nextInt(50);
			System.out.println("Random Integer:"+random);
			
			if(random % 2==0) {
				Square s= new Square(random);
				s.start();
			}
			
			else {
				Cube c = new Cube(random);
				c.start();
			}
			
			try {
				sleep(1000);
				
			}
			
			catch(InterruptedException e) 
	    	{ 
	    		
				System.out.println(e);
	    	}
		}
	}
}
