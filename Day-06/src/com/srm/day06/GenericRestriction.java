package com.srm.day06;

class Res<T extends Number> {
	
	  T ob;
	  T val[];

	Res(T o, T[] num) {
	    ob = o;
	    val = num;
	    
	  }
	}

public class GenericRestriction {

	public static void main(String[] args) {
		
		Integer n[] = { 1 };
	    Res<Integer> i = new Res<Integer>(50, n);
	   
	}
}
