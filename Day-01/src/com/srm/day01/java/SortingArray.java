package com.srm.day01.java;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		System.out.println("ARRANGE NUMBERS IN ASCENDING ORDER.");
		System.out.println("-----------------------------------");
     int count, temp;
    	
    	//User inputs the array size.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no.of.elements:");
        count = scan.nextInt();
    
        int num[] = new int[count];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < count; i++) 
        {
            num[i] = scan.nextInt();
        }
        
        scan.close();
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (num[i] > num[j]) 
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        
        System.out.print("Sorted Array Elements: ");
        for (int i = 0; i < count - 1; i++) 
        {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[count - 1]);
	}
}
