package com.srm.day09.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorListIterator {

	public static void main(String[] args) {
		System.out.println("USE OF ITERATOR AND LIST ITERATOR.");
		System.out.println("-----------------------------------");
		
		// Creating array list
	      ArrayList al = new ArrayList();
	      
	      // adding elements 
	      al.add("Violin");
	      al.add("Cello");
	      al.add("Piano");
	      al.add("Guitar");
	      al.add("Flute");
	      
	      Iterator itr = al.iterator();
	     
	      ListIterator litr = al.listIterator();
	      
	      while(litr.hasNext()) {
		         Object element = litr.next();
		         litr.set(element + " ");
		      }
		      
		      System.out.println("ArrayList Elements: \n");
		      itr = al.iterator();
		      
		      while(itr.hasNext()) {
		         Object element = itr.next();
		         System.out.println(element + " ");
		      }
		      
		      System.out.println();
		      
	      // Display the list backwards
	      System.out.println("Updated ArrayList Elements - BACKWARD: \n");
	      
	      while(litr.hasPrevious()) {
	         Object element = litr.previous();
	         System.out.println(element + " ");
	      }
	      
	      System.out.println();

	}
}
