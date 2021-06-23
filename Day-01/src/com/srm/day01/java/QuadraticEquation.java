package com.srm.day01.java;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		System.out.println("FINDING ROOTS OF QUADRATIC EQUATION.");
		System.out.println("------------------------------------");
		// value a, b, and c
		double a = 3.2, b = 2, c = 5.5;
	    double root1, root2;

	    double determinant = b * b - 4 * a * c;

	    if (determinant > 0) {

	      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
	      root2 = (-b - Math.sqrt(determinant)) / (2 * a);

	      System.out.format("root1 = %.2f \n root2 = %.2f", root1, root2);
	    }
	    
	    else if (determinant == 0) {
	    	
	      root1 = root2 = -b / (2 * a);
	      System.out.format("root1 = root2 = %.2f;", root1);
	    }

	   
	    else {

	      double real = -b / (2 * a);
	      double imaginary = Math.sqrt(-determinant) / (2 * a);
	      
	      System.out.format("Root1 = %.2f + %.2fi\n", real, imaginary);
	      System.out.format("Root2 = %.2f - %.2fi", real, imaginary);
	      
	    }
	}
}
