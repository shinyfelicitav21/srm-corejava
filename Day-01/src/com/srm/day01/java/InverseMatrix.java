package com.srm.day01.java;

import java.util.Scanner;

public class InverseMatrix {

	public static void main(String[] args) {
		System.out.println("FINDING INVERSE OF MATRIX.");
		System.out.println("--------------------------");
		int i, j;
		float det,temp;
		float mat[][] = new float[2][2];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements of matrix row wise:");
		for(i = 0; i < 2; ++i)
			for(j = 0; j < 2; ++j)
				mat[i][j] = sc.nextFloat();
		
      det = (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);
		
		System.out.println("Determinant:\n" + det);
		
		temp = mat[0][0];
		mat[0][0] = mat[1][1];
		mat[1][1] = temp;
		
		mat[0][1] = - mat[0][1];
		mat[1][0] = - mat[1][0];
		
		System.out.println("Inverse:");
		
		for(i = 0; i < 2; ++i) {
			
			for(j = 0; j < 2; ++j)
				System.out.print((mat[i][j]/det) + " ");
			
			System.out.print("\n");
		}
	}
}
