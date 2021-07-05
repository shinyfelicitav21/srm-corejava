package com.srm.day12.java;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableIterator {

	public static void main(String[] args) {
	
		int i;
		 
	    // Creating a Hashtable 
	    Hashtable<Integer, String> ht = new Hashtable<Integer,String>();
	    
	    ht.put(44, "Aircraft");
	    ht.put(36, "Oak");
	    ht.put(72, "Mat");
	    ht.put(85, "Ball");
	    ht.put(38, "Gun");
	 
	    System.out.println("Hashtable Elements: \n");
	 
	    Set<Integer> keys = ht.keySet();
	 
	    Iterator<Integer> itr = keys.iterator();
	 
	    while (itr.hasNext()) { 
	      
	       i = itr.next();

	       System.out.println("Key: "+i+"  Value: "+ht.get(i));
	       
	    } 
	}
}
