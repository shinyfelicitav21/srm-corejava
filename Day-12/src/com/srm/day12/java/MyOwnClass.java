package com.srm.day12.java;

public class MyOwnClass {
	
     String name;
     int age;
     
	public MyOwnClass(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "MyOwnClass [name=" + name + ", age=" + age + "]";
		
	}  
}
