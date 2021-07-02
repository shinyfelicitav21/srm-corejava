package com.srm.day10.java;

import java.util.Map;
import java.util.TreeMap;

public class Employee1 {
	public String name,desgn;
	public int eno;

	public Employee1(int eno, String name, String desgn) {
		super();
		this.eno = eno;
		this.name = name;
		this.desgn = desgn;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + ", desgn=" + desgn + "]";
	}
	public static void main(String[] args) {
		System.out.println("STORE AND RETRIEVE OPERATIONS USING TREEMAP.");
		System.out.println("--------------------------------------------");
		
   TreeMap <Integer,Employee1> map = new TreeMap <Integer,Employee1>();
   
   Employee1 emp1 = new Employee1(100,"Kavya","Marketing Executive");
   Employee1 emp2 = new Employee1(223,"Swathi","Graphic Desginer");
   Employee1 emp3 = new Employee1(334,"Sharon","Sales Consultant");
   Employee1 emp4 = new Employee1(334,"Sharon","Sales Consultant");
   Employee1 emp5 = new Employee1(224,"Teena","Analyst Trainee");
   
   map.put(1, emp1);
   map.put(2, emp2);
   map.put(3, emp3);
   map.put(4, emp4);
   map.put(5, emp5);
	
	System.out.println("Initial Map Elements: \n"+map);
	System.out.println("");
	
	System.out.println("Initial Employee Details:");
	for (Map.Entry<Integer,Employee1>
           entry : map.entrySet())
          System.out.println("[" + entry.getKey()+ ", " + entry.getValue() + "]");
		
	map.remove(4);
	System.out.println("");
	System.out.println("New Map Elements: \n" +map);
	System.out.println("");
	
	System.out.println("New Employee Details:");
	for (Map.Entry<Integer,Employee1>
    entry : map.entrySet())
   System.out.println("[" + entry.getKey()+ ", " + entry.getValue() + "]");
		
	}
	}

