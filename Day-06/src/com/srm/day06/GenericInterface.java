package com.srm.day06;

interface MinMax<T extends Comparable<T>> {
	
    T min();
    T max();
    
}

class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {
	
    T[] val;
    MinMaxImpl(T[] o) {
        val = o;
    }

    public T min() {
    	
        T v = val[0];

        for (int i = 1; i < val.length; i++) {
        	
            if (val[i].compareTo(v) < 0) {
                 v = val[i];
            }
        }
         return v;
    }

    public T max() {
    	
         T v = val[0];

         for (int i = 1; i < val.length; i++) {
        	 
            if (val[i].compareTo(v) > 0) {
                 v = val[i];
            }
         }
         return v;
    }
}
public class GenericInterface {

	public static void main(String[] args) {
		
		System.out.println("IMPLEMENTATION OF GENERIC INTERFACE.");
		System.out.println("------------------------------------");
		Integer intArr[] = { 22,7,98,26,94,2 };
        Character charArr[] = { 'S','F','h','j','V','i'};
        String strArr[] = {"Sharon", "Chennai", "Ball"};
 
        MinMaxImpl<Integer> intMinMax= new MinMaxImpl<Integer>(intArr);
        MinMaxImpl<Character> charMinMax = new MinMaxImpl<Character>(charArr);
        MinMaxImpl<String> strMinMax = new MinMaxImpl<String>(strArr);

        System.out.println("Max value in Integer Array: " + intMinMax.max());
        System.out.println("Max value in Char Array: " + charMinMax.max());
        System.out.println("Max value in String Array: " + strMinMax.max());
        System.out.println("");
        
        
        System.out.println("Min value in Integer Array: " + intMinMax.min());
        System.out.println("Min value in Char Array: " + charMinMax.min());
        System.out.println("Min value in String Array: " + strMinMax.min());
        
    }
}


	

