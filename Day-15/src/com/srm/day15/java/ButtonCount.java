package com.srm.day15.java;

import java.awt.*;
import java.awt.event.*;

public class ButtonCount  extends Frame implements ActionListener {

		Button b1;
		Label l1;
		int count=0;
		
		ButtonCount()
		{
			b1=new Button("Click Me");
			 b1.addActionListener(this);
			 
			 l1=new Label();
			 
			 setLayout(new FlowLayout());
			
			 add(b1);
			 add(l1);
			 
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
	 
			count++;
			l1.setText(String.valueOf("Button Clicked: "+count + "times"));
		}
		
		public static void main(String args[])
		{
			ButtonCount ex=new ButtonCount();
			ex.setSize(200,200);
			ex.setVisible(true);
			ex.addWindowListener(new WindowAdapter() {
				
	            @Override
	            public void windowClosing(WindowEvent we) 
	            {
	                System.exit(0);
	            }
	        });
		}
		
	}


