package com.srm.day15.java;

import java.awt.event.*;
import javax.swing.JFrame;

public class AdapterClassEx {
	
  JFrame window = new JFrame("Adapter Class");
  
  public  AdapterClassEx() {
	  
    window.setBounds(30, 30, 300, 300);
    window.addWindowListener(new WindowHandler());
    window.setVisible(true);
  }
  
  class WindowHandler extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
      System.out.println("Window closed..");
      window.dispose(); 
      System.exit(0); 
    }
  }
  
  public static void main(String[] args) {
	  
    new  AdapterClassEx();
    
  }
}