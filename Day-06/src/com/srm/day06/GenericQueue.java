package com.srm.day06;

import java.util.LinkedList;

class Queue<E> {
	
	  public LinkedList<E> ll = new LinkedList<E>();

	  public void enqueue(E item) {
	    ll.addLast(item);
	  }

	  public E dequeue() {
	    return ll.poll();
	  }

	  public boolean hasItems() {
	    return !ll.isEmpty();
	  }

	  public int size() {
	    return ll.size();
	  }

	  public void addItems(Queue<? extends E> q) {
	    while (q.hasItems())
	      ll.addLast(q.dequeue());
	  }
	}

public class GenericQueue {

	public static void main(String[] args) {
		System.out.println("Employee Fname and Lname.");
		System.out.println("-------------------------");
		Queue<Employee> emp;
	    emp = new Queue<Employee>();

	    Queue<HourlyEmployee> hemp ;
	    
	    hemp = new Queue<HourlyEmployee>();
	    hemp .enqueue(new HourlyEmployee("Felicita", "Sharon"));
	    hemp .enqueue(new HourlyEmployee("Ferrora", "Sheila"));
	    hemp .enqueue(new HourlyEmployee("Kumar", "Raj"));

	    emp.addItems(hemp );

	    while (emp.hasItems()) {
	      Employee emp1 = emp.dequeue();
	      System.out.println(emp1.fname + " " + emp1.lname);
	    }
	  }
	}

	class Employee {
		
	  public String lname;
	  public String fname;

	  public Employee() {
	  }

	  public Employee(String last, String first) {
		  
	    this.lname = last;
	    this.fname = first;
	  }

	  public String toString() {
	    return fname + " " + lname;
	  }
	}

	class HourlyEmployee extends Employee {
		
	  public double hourlyRate;
	  public HourlyEmployee(String last, String first) {
	    super(last, first);
	    
	}
}
