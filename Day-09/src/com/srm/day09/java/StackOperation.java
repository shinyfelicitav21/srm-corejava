package com.srm.day09.java;

import java.util.ArrayDeque;

public class StackOperation {

	public static void main(String[] args) {
		System.out.println("STACK OPERATIONS USING ARRAYDEQUE.");
		System.out.println("----------------------------------");
		
		//Creates a stack of integers
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();

        //Pushes integer value into the stack
        stack.push(2);
        stack.push(55);
        stack.push(6);
        stack.push(88);
        stack.push(132);

        //Peeks into the stack
        System.out.println("Current element at the top of the stack: \n" + stack.peek());
        System.out.println("");

        //Pops one integer from the stack
        System.out.println("Element popped from the stack: \n" + stack.pop());
        System.out.println("");

        //Iterates through the stack
        System.out.print("Current elements in the stack: ");
        System.out.println("");
        
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
            
        } 
	}
}
