package com.srm.day11.java;

import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		
		// Creating hashtable	
		  Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		// Adding entries in hash table
		  ht.put(22, "Saranya"); 
		  ht.put(56 ,"Teena"); 
		  ht.put(36, "Thara"); 
		  ht.put(48, "Fathima"); 
		  ht.put(50, "Fazil");  
		 
		System.out.println("Displaying entries in hash table: \n" +ht);
		System.out.println("");
		int size = ht.size();
		System.out.println("Size of hash table: \n" +size);
		System.out.println("");

		// Removing last entry
		  String remove = ht.remove(50);
		  System.out.println("Removed entry: \n" +remove);
		  System.out.println("");
		  System.out.println("Updated entries in hash table: \n" +ht);
		  System.out.println("");
		  
		// Getting value of 48
		   String getValue = ht.get(48);
		   
		   System.out.println("Getting the value of key-48: \n" +getValue);
		   System.out.println("");
		   System.out.println("Getting the value of key-22: \n" +ht.get(22));
		   System.out.println("");

	}
}
