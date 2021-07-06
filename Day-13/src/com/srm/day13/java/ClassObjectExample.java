package com.srm.day13.java;

public class ClassObjectExample {

	int id;
	String name;

	public ClassObjectExample(int id, String name) {
		
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		
		ClassObjectExample ex = new ClassObjectExample(1,"Sweety");
		
		System.out.println("Hashcode: \n"+ex.hashCode());
		System.out.println();
		System.out.println("ClassName: \n"+ex.getClass());
		
	}
}
