package com.srm.day01.java;

import java.util.Scanner;

public class MatrixOperations {

	public static void main(String[] args) {
		System.out.println("MATRIX OPERATIONS.");
		System.out.println("------------------");
          int i, j, rows, columns;
		
          Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Matrix Rows and Columns :");
		rows = sc.nextInt();
		columns = sc.nextInt();
		
		int[][] arr1 = new int[rows][columns];
		int[][] arr2 = new int[rows][columns];
		
		int[][] add = new int[rows][columns];
		int[][] mul = new int[rows][columns];
		
		
		System.out.println("Enter the First Matrix: ");
		for(i = 0; i < rows; i++) {
			for(j = 0; j < columns; j++) {
				arr1[i][j] = sc.nextInt();
			}		
		}
		
		System.out.println("Enter the Second Matrix Items:");
		for(i = 0; i < rows; i++) {
			for(j = 0; j < columns; j++) {
				arr2[i][j] = sc.nextInt();
			}		
		}
		
		for(i = 0; i < rows; i++) {
			
			for(j = 0; j < columns; j++) {
				add[i][j] = arr1[i][j] + arr2[i][j];
				mul[i][j] = arr1[i][j] * arr2[i][j];
			}		
		}
		
		System.out.println("Addition and Multiplication:");
	
		for(i = 0; i < rows; i++) {
			
			for(j = 0; j < columns; j++) {
				
				System.out.format(" %d ", add[i][j]);
				
				System.out.format("%d ", mul[i][j]);
				
				System.out.println("");
			}
			
			System.out.println(" ");
		}
	}
}
