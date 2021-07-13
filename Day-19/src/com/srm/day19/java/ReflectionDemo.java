package com.srm.day19.java;

import java.lang.reflect.*;

class Demo
{
  public String name;
  
    public Demo() {
    	name = "Shiny Felicita"; 
    }
    public void name1()  {
        System.out.println("String: " + name);
    }
    public void name2(int n)  {
        System.out.println("Number: " + n);
    }
    public void name3() {
        System.out.println("Method : Public.");
    }
}
  
public class ReflectionDemo
{
    public static void main(String args[]) throws Exception
    {
        Demo d = new  Demo();
        Class c = d.getClass();
        System.out.println("Class Name: " +c.getName());
                            
        Constructor c1 = c.getConstructor();
        System.out.println("Constructor Name: " +c1.getName());
                            
        System.out.println("Methods: ");
        Method[] m = c.getMethods();
  
        for (Method method:m)
            System.out.println(method.getName());
 
        Method m1 = c.getDeclaredMethod("name2", int.class);
                                             
        m1.invoke(d, 21);
        Field field = c.getDeclaredField("name");
  
        field.setAccessible(true);
        field.set(d, "Sweety");
  
        Method m2 = c.getDeclaredMethod("name1");
        m2.invoke(d);
  
        Method m3 = c.getDeclaredMethod("name3");
        m3.setAccessible(true);
        m3.invoke(d);
        
    }
}