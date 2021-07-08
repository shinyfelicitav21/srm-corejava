package com.srm.day15.java;

import java.awt.*;
import java.awt.event.*;

public class InnerClassExample {

		public static void main(String[] args) {
			
			TFrame3 f=new TFrame3();
			f.launchFrame();
		}
	}

	class TFrame3 extends Frame{
		
		TextField t1,t2,t3;
		public TFrame3(){
			
			this.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					System.out.println("Done.");
					setVisible(false);
					System.exit (0); 
					
				}
			});
		}
		
		public void launchFrame(){

			t1 = new TextField (10); 
			t2=new TextField(10);
			t3=new TextField(15);
			Label l=new Label("+");
			Button bt=new Button("=");
	                                      
			bt.addActionListener(new MyMonitor());
			setLayout (new FlowLayout ()); 
			add(t1);
			add(l);
			add(t2);
			add(bt);
			add(t3);
			pack();

			this.setVisible(true);
		}

		private class MyMonitor implements ActionListener{
			
			public void actionPerformed(ActionEvent e){
				
				int num1=Integer.parseInt(t1.getText());
				int num2=Integer.parseInt(t2.getText());
				t3.setText(""+(num1+num2));
				
			}
		}
	}


