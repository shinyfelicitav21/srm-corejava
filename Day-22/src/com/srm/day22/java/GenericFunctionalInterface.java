package com.srm.day22.java;

@FunctionalInterface
interface Square<Integer> 
{
    Integer calculate(Integer i1);
}
interface Cube<Integer>{
	Integer calc(Integer i2);
}
public class GenericFunctionalInterface {
    public static void main(String[] args)
    {
    	System.out.println("SQUARE AND CUBE VALUES:");
    	Square<Integer> s = (i1) -> i1 * i1;
    	Cube<Integer> c = (i2) -> i2 * i2 * i2;
        System.out.println(s.calculate(4)); 
        System.out.println(c.calc(2)); 
        
    }
}