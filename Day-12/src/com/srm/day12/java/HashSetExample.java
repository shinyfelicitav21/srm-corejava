package com.srm.day12.java;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	
	public static void main(String args[]) {
		 int i;
		 String str;
		 
		 //Adding integer elements in hashset
	HashSet<Integer> set = new HashSet<Integer>();
	
	set.add(23);
	set.add(45);
	set.add(67);
	set.add(12);
	set.add(78);
	
	 System.out.println("Integer HashSet Elements: ");
	  Iterator<Integer> itr = set.iterator();
	    while (itr.hasNext()) { 
	       i = itr.next();
	       System.out.println(i);
	       
	    } 
	    System.out.println("");
	    
	  //Adding string elements in hashset
	    HashSet<String> set1 = new HashSet<String>();
		
		set1.add("Book");
		set1.add("Mat");
		set1.add("Box");
		set1.add("Pot");
		set1.add("Tab");

		System.out.println("String HashSet Elements: ");
		  Iterator<String> itr1 = set1.iterator();
		    while (itr1.hasNext()) { 
		       str = itr1.next();
		       System.out.println(str);
		    
		    }
		    System.out.println("");
		    
      //Using hashset to display the elements from MyOwnClass and passing values in constructor
		    HashSet<MyOwnClass> set2 =  new HashSet<MyOwnClass>();
		    
		    MyOwnClass moc = new MyOwnClass("Shiny",23);
		    MyOwnClass moc1 = new MyOwnClass("Sweety",34);
		    MyOwnClass moc2 = new MyOwnClass("Sharon",56);
		    MyOwnClass moc3 = new MyOwnClass("Sheila",89);
		    
		    set2.add(moc);
		    set2.add(moc1);
		    set2.add(moc2);
		    set2.add(moc3);
		    
		    System.out.println("HashSet Elements: \n"+set2);
		    
	}
}