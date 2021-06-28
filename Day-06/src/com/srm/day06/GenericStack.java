package com.srm.day06;

class Stack<E> {
	
	  private final int size;
	  private int top;
	  private E[] elements;
	  
	  public Stack() {
	    this(10);
	  }
	  
	  public Stack(int s) {
	    size = s > 0 ? s : 10;
	    top = -1;
	    elements = (E[]) new Object[size]; 
	  }

	  public void push(E pushValue) {
	    if (top == size - 1) 
	      throw new FullStackException(String.format("Stack is full, cannot push %s!", pushValue));

	    elements[++top] = pushValue; 
	  }

	  public E pop() {
	    if (top == -1)
	      throw new EmptyStackException("Stack is empty, cannot pop..");
	    return elements[top--]; 
	    
	  }
	}

	class EmptyStackException extends RuntimeException {
	  public EmptyStackException() {
	    this("Stack is empty.");
	  }

	  public EmptyStackException(String exception) {
	    super(exception);
	  }
	}

	class FullStackException extends RuntimeException {
	  public FullStackException() {
	    this("Stack is full.");
	  }

	  public FullStackException(String exception) {
	    super(exception);
	  }
	}
	
public class GenericStack {

	public static void main(String[] args) {
		
		 double[] d = { 2.5,4.8,8.9 };
		    int[] i = { 98,7,21,61,3,26,9,23,2,58,63 };

		    Stack<Double> stack1 = new Stack<Double>(5);
		    Stack<Integer> stack2 = new Stack<Integer>(10);

		    try {
		    	System.out.println("Double Values.");
		    	System.out.println("--------------");
		      System.out.println("Pushing elements into Stack:");

		      for (double element : d) {
		        System.out.printf("%.1f ", element);
		        stack1.push(element);
		      }
		      
		    } catch (FullStackException fullStackException) {
		      System.err.println();
		      fullStackException.printStackTrace();
		    }

		    try {
		      System.out.println("\nPopping elements from Stack:");
		      double popValue;

		      while (true) {
		        popValue = stack1.pop(); 
		        System.out.printf("%.1f ", popValue);
		      }
		    } catch (EmptyStackException emptyStackException) {
		      System.err.println();
		      emptyStackException.printStackTrace();
		    }

		    try {
		    	System.out.println("Integer Values.");
		    	System.out.println("--------------");
		      System.out.println("Pushing elements into Stack:");

		      for (int element : i) {
		        System.out.printf("%d ", element);
		        stack2.push(element);
		      }
		      
		    } catch (FullStackException fullStackException) {
		      System.err.println();
		      fullStackException.printStackTrace();
		    }
		   
		    try {
		      System.out.println("\nPopping elements from Stack:");
		      int popValue; 

		      while (true) {
		        popValue =  stack2.pop();
		        System.out.printf("%d ", popValue);
		      }
		      
		    } catch (EmptyStackException emptyStackException) {
		      System.err.println();
		      emptyStackException.printStackTrace();
		      
		    }
	}
}
