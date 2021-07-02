package com.srm.day10.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Random;

public class CollectionAlgorithms {

	public static void main(String[] args) {
		System.out.println("USE OF COLLECTION ALGORITHMS.");
		System.out.println("-----------------------------");
		ArrayList list = new ArrayList();
		PriorityQueue queue = new PriorityQueue();
		HashSet set = new HashSet();
		HashMap map = new HashMap();
		
		Random num = new Random();
		
		for(int i = 0; i < 5; i++) {
			list.add(num.nextInt(150));
			queue.add(num.nextInt(150));
			set.add(num.nextInt(150));
			map.put(i,num.nextInt(150));
		}
		
		System.out.println("ArrayList Elements: \n" + list);
		System.out.println("");
		System.out.println("PriorityQueue Elements: \n" + queue);
		System.out.println("");
		System.out.println("HashSet Elements: \n" + set);
		System.out.println("");
		System.out.println("HashMap Elements:\n" + map);
		System.out.println("---------------------------------------");
		
		Collections.sort(list);
		System.out.println("ArrayList in ascending order: \n" + list);
		System.out.println("");
		
		System.out.println("Largest element in HashSet: \n" + Collections.max(set));
		System.out.println("");
		
		System.out.println("Smallest element in PriorityQueue: \n" + Collections.min(queue));
		System.out.println("");
		
		Collections.reverse(list);
		System.out.println("ArrayList in reverse order: \n" + list);
		System.out.println("");
		
		Collections.shuffle(list);
		System.out.println("ArrayList after shuffle: \n" + list);
		System.out.println("");

	}
}
