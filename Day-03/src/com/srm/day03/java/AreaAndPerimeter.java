package com.srm.day03.java;

class Rectangle1{

 double length;
 int breadth;
  double area,perimeter;

public Rectangle1(double  length, int breadth) {
	super();
	this.length = length;
	this.breadth = breadth;
}

public void areaRect() {
	  area=length * breadth;
	  System.out.println("Area of Rectangle:" + area);
  }

  public void perimeterRect() {
	 perimeter =2 *(length + breadth);
	  System.out.println("Perimeter of Rectangle:" + perimeter);
  }
}

  class Square1 extends Rectangle{
	  
	  float side,area,perimeter;
	public Square1(int side) {
		super();
		this.side = side;	
	}
	
		public  void areaSquare() {
			 
			area=side * side;
			 System.out.println("Area of Square:" + area);
			 
		 }
		
		 public void perimeterSquare() {
			 perimeter =4 * side;
			System.out.println("Perimeter of Square:" + perimeter);  
			 System.out.println("----------------------------------");
	}
  }
  
  public class AreaAndPerimeter {
	  
	  public static void main(String args[]) {
		 System.out.println("CALCULATION OF AREA AND PERIMETER.");
		 System.out.println("----------------------------------");
		Square1 s = new Square1(5);
		Rectangle1 r = new Rectangle1(2.5,5);
		s.areaSquare();
		s.perimeterSquare();
		 r.areaRect();
		r.perimeterRect();
		
	}
  }
		

	


