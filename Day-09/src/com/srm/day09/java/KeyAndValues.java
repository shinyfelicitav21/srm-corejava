package com.srm.day09.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class KeyAndValues {

	public static void main(String[] args) {
		System.out.println("PRINTING ALL ELEMENTS IN HASHMAP.");
		System.out.println("---------------------------------");
		
	      HashMap<Integer,String> hm = new HashMap<Integer,String>();
	      
	      hm.put(001,"Keerthi");
	      hm.put(221,"Deepa");
	      hm.put(665,"Leela");
	      hm.put(223,"Ajay");
	      hm.put(112,"Teena");
	      
	      System.out.println("HashMap Elements: \n"+hm);
	      System.out.println("");
	      System.out.println("HashMap Keys: ");
	      
	      Set keys = hm.keySet();
	      
	      Iterator i = keys.iterator();
	      
	      while (i.hasNext()) {
	         System.out.println(i.next());
	      }
	      
	      System.out.println("\nHashMap Values: ");
	      
	      Collection getValues = hm.values();
	      
	      i = getValues.iterator();
	      
	      while (i.hasNext()) {
	         System.out.println(i.next());
	         
	      } 
	}
}
