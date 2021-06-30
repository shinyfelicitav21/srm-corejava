package com.srm.day08.java;

import java.util.ArrayList;

public class MinMaxArrayList {

	public static void main(String[] args) {
		System.out.println("MAX AND MIN OF ARRAYLIST.");
		System.out.println("--------------------------");
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		al.add(22);
		al.add(2);
		al.add(66);
		al.add(177);
		al.add(567);
    
        int min = al.get(0);
        int max = al.get(0);

        int n = al.size();
  
        // min
        for (int i = 1; i < n; i++) {
            if (al.get(i) < min) {
                min = al.get(i);
            }
        }
  
        // max
        for (int i = 1; i < n; i++) {
            if (al.get(i) > max) {
                max = al.get(i);
            }
        }
  
        // result
        System.out.println("ArrayList Elements: \n"+al);
        System.out.println("");
        
        System.out.println("Max value: \n" + max);
        System.out.println("");
        
        System.out.println("Min value: \n" + min);
        System.out.println("");
        
	}
}
