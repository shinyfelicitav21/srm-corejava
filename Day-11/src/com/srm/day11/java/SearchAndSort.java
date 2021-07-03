package com.srm.day11.java;

import java.util.Arrays;
import java.util.Scanner;

public class SearchAndSort {

	public static void main(String[] args) {
		
		int arr[] = { 21,98,7,26,94,23,9,2}; 
		 
		Arrays.sort(arr);
		System.out.println("Sorted Array: \n");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println( arr[i]);
		}
		
        System.out.println("");
        int key ;
        System.out.println("Enter the key:");
        
        Scanner sc = new Scanner(System.in);
        key=sc.nextInt();
        
        int res = Arrays.binarySearch(arr, key); 
        
        if (res >= 0) {
        	 System.out.println("");
            System.out.println("Key found at index: \n" + res); 
          
        }     
        
        else {
            System.out.println("Key Not found.."); 
            
        }
	}

}
