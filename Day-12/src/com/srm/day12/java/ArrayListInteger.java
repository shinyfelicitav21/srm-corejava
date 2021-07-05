package com.srm.day12.java;

import java.util.ArrayList;

public class ArrayListInteger {

	public static void main(String[] args) {
		
		//Adding elements to arraylist
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(23);
		al.add(45);
		al.add(67);
		al.add(12);
		al.add(78);
		
		System.out.println("ArrayList Elements: \n" +al);
		System.out.println("");
		
		//Getting min value
		int min = al.get(0);
		int n = al.size();
		
		 for (int i = 1; i < n; i++) {
	            if (al.get(i) < min) {
	                min = al.get(i);
	            }
	        }
		 
		 System.out.println("Min value: \n" + min);
	        System.out.println("");
		
	     //Removing min value
		int num = al.indexOf(min);
		al.remove(num);
		
		System.out.println("After removing min value: \n"+al);
		System.out.println("");
		
		//Adding min value in the index position '0'
		al.add(0,min);
		System.out.println("New ArrayList Elements: \n" +al);
		
	}
}
