package com.srm.day23.java;

import javax.swing.*;

public class LambdaEventHandling extends JFrame{
 public JButton btn;
 
 public  LambdaEventHandling()
 {
  this.setSize(300,150);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setTitle("Lambda Event Handling");
  JPanel p = new JPanel();
  
 btn = new JButton("Click Me");
  btn.addActionListener(e -> buttonClick() );
  p.add(btn);
  this.add(p);
  this.setVisible(true);
 }
 
 public int count = 0;
 public void buttonClick()
 {
  count++;
  if (count == 1)
   btn.setText("Button Count!!");
  else
   btn.setText("Count: " + count + " times");
 }

public static void main(String [] args)
{
 new  LambdaEventHandling();
}
}