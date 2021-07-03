package com.srm.day11.java;

public class ScalarMultiplication {
	
	static final int n= 3;
	
	static void scalarProductMat(int arr[][],
	                                  int k)
	{
	     
	    for (int i = 0; i < n; i++)
	        for (int j = 0; j < n; j++)
	           arr[i][j] = arr[i][j] * k;
	}
	 
	public static void main (String[] args)
	{
	    int arr[][] = { { 1, 2, 3 },
	                    { 4, 5, 6 },
	                    { 7, 8, 9 } };
	    int k = 4;
	 
	    scalarProductMat(arr, k);
	 
	  //displaying result
	    System.out.println("Scalar Product Matrix is: ");
	     
	    for (int i = 0; i < n; i++)
	    {
	        for (int j = 0; j < n; j++)
	            System.out.print(arr[i][j] + " ");
	        System.out.println();
	        
	    }
	}
	}
