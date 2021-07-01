package com.srm.day09.java;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LargestAndSmallest {

	public static void main(String[] args) {
		System.out.println("FINDING SMALLEST VALUE AND LARGEST KEY IN HASHMAP.");
		System.out.println("--------------------------------------------------");
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		Map.Entry<Integer,String> key= null;

		map.put(123,"Book");
		map.put(333,"Mobile Phone");
		map.put(220,"Remote");
		map.put(001,"Table");
		map.put(445,"Fan");

		for(Entry<Integer, String> value:map.entrySet())
			
		{
			if (key == null || key.getValue().compareTo(key.getValue()) < 0)
			{
				key = value;
			}
			
		}
		
		System.out.println("HashMap Elements: \n" +map);
		System.out.println("");
		
		System.out.println("Smallest Value: \n"+key.getValue());
		System.out.println("");
		
		System.out.println("Largest Key: \n"+ Collections.max(map.keySet()));

	}
}
