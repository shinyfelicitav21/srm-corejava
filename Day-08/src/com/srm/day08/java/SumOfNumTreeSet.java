package com.srm.day08.java;

import java.util.Iterator;
import java.util.TreeSet;

public class SumOfNumTreeSet {

	public static void main(String[] args) 
	{
		System.out.println("SUM OF NUMBERS USING TREESET.");
		System.out.println("-----------------------------");
		TreeSet<Integer> ts = new TreeSet<Integer>(); 
		
        ts.add(5);
          ts.add(22);
          ts.add(1);
          ts.add(6);
          
   System.out.println("TreeSet Elements: \n"+ts);
   System.out.println("");

  int sum=0;
 
  //------using for loop
   for (Integer value : ts)
    {
   	sum=sum+value;
      
    }
    System.out.println("For loop sum: \n"+sum);
    System.out.println("");
    
    //------using while loop
    int count=0;
    int sum1=0;
   Iterator<Integer> itr = ts.iterator();
   
   while(itr.hasNext())
   {
   	int i=itr.next();
   	sum1=sum1+i;
   }
    System.out.println("While loop sum: \n"+sum1);
    System.out.println("");
   
    //--------using recursion
    int n = ts.size(); 
    int arr[] = new int[n];
    int i=0;
    
    for (int ele : ts) 
        arr[i++] = ele; 

   int sum2=cal(arr,arr.length);
    System.out.println("Recursion sum: \n"+sum2);
    System.out.println("");
	}

	private static int cal(int[] arr, int n) {
		if(n<=0) {
		return 0;
	}
		
return cal(arr,n-1)+arr[n-1];

	}
}
