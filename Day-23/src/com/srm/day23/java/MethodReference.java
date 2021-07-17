package com.srm.day23.java;

interface Value<T> {
    void myValue(T[] arr);
}
class MyClass {
    static <T> void disValue(T[] arr) {
        for (T v : arr) {
            System.out.print("["+v+"] ");
    }
    System.out.println();
   }
}

public class MethodReference {
     static <T> void callDisValue( Value<T> val, T[] arr) {
    	 val.myValue(arr);
     }

     public static void main(String[] args) {

        Integer[] i = {55,89,34,90,34,90,45};
        String[] s = {"Shiny","Sweety","Teena","Sunny","Kiran"};
 
        callDisValue(MyClass::<Integer>disValue, i);
        callDisValue(MyClass::disValue, i);
 
        callDisValue(MyClass::<String>disValue, s);
        callDisValue(MyClass::disValue, s);
        
     }
}