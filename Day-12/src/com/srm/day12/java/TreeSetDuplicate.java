package com.srm.day12.java;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetDuplicate {

	public static void main(String[] args) {
		
		//Creating string array
		String[] arr= new String[]{
				
          "Shiny","Sweety","Deepa","Dev","Kiran","Shiny","Sweety"
		};
		
        System.out.println("Input Array: \n" + (Arrays.toString(arr)));
       System.out.println("");
        
        TreeSet<String> ts = new TreeSet<String>();
        
        //Finding duplicate entries
        System.out.println("Duplicate Entries:");
        
        for (String str : arr) {
            if (!ts.add(str)) {
                System.out.println( str);  
            }
        }
        System.out.println("");
        
        System.out.println("TreeSet Elements:  \n" + ts);
        System.out.println("");

	}
}
