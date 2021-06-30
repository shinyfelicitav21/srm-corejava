package com.srm.day08.java;

import java.util.LinkedList;

public class ElementOccursLinkedList {

	public static void main(String[] args) {
		System.out.println("TO CHECK AN ELEMENT OCCURS IN LINKEDLIST.");
		System.out.println("-----------------------------------------");
       LinkedList<String> list = new LinkedList<String>();

		//adding list
		 list.add("Chennai");
	      list.add("Hyderabad");
	      list.add("Bangalore");
	      list.add("Brazil");
	      list.add("Dubai");
	      
	      System.out.println("Element - Chennai in list:");
	      System.out.println(list.contains("Chennai")); 
	      System.out.println("");
	      
	      System.out.println("Element - Trichy in list:");
	        System.out.println(list.contains("Trichy"));
	        System.out.println("");
	        
	}
}
