package com.srm.day03.java;

public abstract class Pen {
	
	    abstract void write();
	    abstract void refill();
	}

	 class FountainPen extends Pen{
		 
	    void write(){
	        System.out.println("This is method Write.");
	    }
	    
	    void refill(){
	        System.out.println("This is method Refill.");
	    }
	    
	    void changeNib(){
	        System.out.println("Change the nib!!");
	    }
	
	 }

