package com.srm.day08.java;

import java.util.ArrayList;

public class ReplaceElementArrayList {

	public static void main(String[] args) {
		System.out.println("REPLACING AN ELEMENT IN ARRAYLIST.");
		System.out.println("----------------------------------");
		 ArrayList<String> list = new ArrayList<String>();
		 
	      list.add("Shiny");
	      list.add("Jancy");
	      list.add("Vasu");
	      list.add("Parvathi");
	      
	      System.out.println("Initial ArrayList Elements:"+list);
	      System.out.println("");
	      
	      list.set(2, "Keerthi");
	      
	      System.out.println("Replaced ArrayList Elements:"+list);
	      
	}
}
