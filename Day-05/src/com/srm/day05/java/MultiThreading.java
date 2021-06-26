package com.srm.day05.java;

public class MultiThreading {

	public static void main(String[] args) {
		System.out.println("MULTI THREADED APPLICATION.");
		System.out.println("---------------------------");
		RandomInteger ri = new RandomInteger();
		ri.start();
		
	}
}
