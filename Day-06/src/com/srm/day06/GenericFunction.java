package com.srm.day06;

public class GenericFunction {
	
	public static <T extends Comparable<T>> T max(T... elements) {
		
	    T max = elements[0];
	    
	    for (T element : elements) {
	        if (element.compareTo(max) > 0) {
	            max = element;
	        }
	    }
	    
	    return max;
	}
	
	public static void main(String[] args) {
		
		 System.out.println("MAXIMUM VALUES FROM THE ELEMENTS.");
		 System.out.println("---------------------------------");
		  System.out.println("Integer: " + max(23,98, 7, 26,55));
	       System.out.println("Double: " + max(2.5, 5.5, 9.0,98.7,9.9));
	       System.out.println("String: " + max("Kala", "Sheethal", "Arjun", "Vel", "Ferose"));
	       System.out.println("Boolean: " + max(Boolean.TRUE, Boolean.FALSE));
	       System.out.println("Byte: " + max(Byte.MIN_VALUE, Byte.MAX_VALUE));
	       
	   }
	}


