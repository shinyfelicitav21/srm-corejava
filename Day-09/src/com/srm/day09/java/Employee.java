package com.srm.day09.java;

import java.util.LinkedList;

public class Employee {

	public String name,desgn;
	public int eno;

	public Employee(int eno, String name, String desgn) {
		super();
		this.eno = eno;
		this.name = name;
		this.desgn = desgn;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + ", desgn=" + desgn + "]";
	}
	
	public static void main(String args[]) {
		System.out.println("STORE AND RETRIEVE OPERATIONS IN LINKEDLIST.");
		System.out.println("--------------------------------------------");
		LinkedList <Employee> list = new LinkedList<Employee>();
		
		list.add(new Employee(101,"Keerthi","Programmer"));
		list.add(new Employee(231,"Sweety","Operations Lead"));
		list.add(new Employee(334,"Sharon","Marketing Lead"));
		list.add(new Employee(224,"Teena","Junior Executive"));
		
		System.out.println("Initial LinkedList Elements: \n"+list);
		System.out.println("");
		System.out.println("Initial Employee Details:");
		 
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			
		}	
		
		list.remove(2);
		System.out.println("");
		System.out.println("New LinkedList Elements: \n" +list);
		
		System.out.println("");
		System.out.println("New Employee Details:");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			
		}
	}
}
