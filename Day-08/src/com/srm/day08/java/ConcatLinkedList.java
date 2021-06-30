package com.srm.day08.java;

import java.util.LinkedList;

public class ConcatLinkedList {

	public static void main(String[] args) {
		System.out.println("CONCATING TWO LINKEDLIST.");
		System.out.println("-------------------------");
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		
		//list1
		 list1.add(5);
	      list1.add(12);
	      list1.add(67);
	      list1.add(89);
	      list1.add(7);
	      
	      LinkedList<Integer> list2 = new LinkedList<Integer>();
	      
	      //list2
	      list2.add(56);
	      list2.add(100);
	      list2.add(678);
	      list2.add(234);
	      list2.add(34);
	      
	     
	      LinkedList<Integer> ll = new LinkedList<Integer>();

           //concating two lists using addAll()
	      ll.addAll(list1);
	      ll.addAll(list2);

      System.out.println("List - 1 Elements: \n" + list1);
      System.out.println("");
      
      System.out.println("List - 2 Elements: \n" + list2);
      System.out.println("");
      
      System.out.println("Concatenated Elements: \n"+ll);
      System.out.println("");
                      
	}
}
