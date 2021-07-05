package com.srm.day12.java;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListString {
	
	public static void main(String[] args) {
		
		//Creating arraylist
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Chennai");
		al.add("Trichy");
		al.add("Bangalore");
		al.add("Hyderabad");
		al.add("Goa");

		System.out.println("ArrayList Elements: \n"+al);
		System.out.println("");
		
		System.out.println("Removing string of even length: ");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			//String str = itr.next();
			if(itr.next().length()%2==0) {
				System.out.println(itr.next());
				itr.remove();
			}
		}
		System.out.println("");
		System.out.println("New ArrayList Elements: \n"+al);
		
		}
}
