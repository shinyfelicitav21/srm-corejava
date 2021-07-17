package com.srm.day22.java;
 
public class LambdaDemo {  
	
	interface values
    {
        int calculate(int x, int y);
    }
   public int calculate(int x, int y, values val)
    {
        return val.calculate(x, y);
    }
  
    public static void main(String args[]) {
    	
    	values add = (int x, int y) -> x + y;
    	values sub = (int x, int y) -> x - y;
    	values mul = (int x, int y) -> x * y;
    	values div = (int x, int y) -> x / y;
    	values mod = (int x, int y) -> x % y;
    	
        LambdaDemo  ld = new LambdaDemo ();
 
        System.out.println("ARITHMETIC OPERATIONS.");
        System.out.println("");
        System.out.println("Add:" + ld.calculate(2,5, add));           
        System.out.println("Sub:" + ld.calculate(5,4, sub));
        System.out.println("Mul:" + ld.calculate(8,5, mul));
        System.out.println("Div:" + ld.calculate(15,3, div));
        System.out.println("Mod:" + ld.calculate(20,3, mod));
        
    }
}