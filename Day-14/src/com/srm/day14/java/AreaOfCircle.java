package com.srm.day14.java;

import javax.swing.JOptionPane;

public class AreaOfCircle {
	
	public static void main(String[] args) { 
		
	   double radius,area;
	   int dialogType = JOptionPane.PLAIN_MESSAGE;
	   
	   String input= JOptionPane.showInputDialog(null, 
	         "Enter the radius: ", "Area of a circle", dialogType);
	    radius = Double.parseDouble(input);
	    area = Math.PI * Math.pow(radius, 2);
	    
	   String answer = "Area : " + area;
	   String title = "Output";
	   
	   JOptionPane.showMessageDialog(null, answer, title, dialogType);
	   
	  }
	}

