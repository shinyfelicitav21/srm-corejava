package com.srm.day03.java;

public abstract class Pen {
	
	    abstract void write();
	    abstract void refill();
	}

	class FountainPen extends Pen{
	    void write(){
	        System.out.println("Write");
	    }
	    void refill(){
	        System.out.println("Refill");
	    }
	    void changeNib(){
	        System.out.println("Changing the nib");
	    }
	}

