package com.srm.day17.java;

import javax.swing.*;
import java.awt.*;

public class TabbedPaneDemo 
{
	JTabbedPane ap;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8,l9,l10,l11,l12,l13,l14,l15;
	JPanel countries, states,districts;
	JFrame frame;
	
	public void createUI()
	{
		frame=new JFrame("JTAbbedPane Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		countries = new JPanel(new GridLayout(6,1));
		
		l1=new JLabel("India");
		l2=new JLabel("Brazil");
		l3=new JLabel("Nigeria");
		l4=new JLabel("Russia");
		l5=new JLabel("Mexico");
		
		countries.add(l1);
		countries.add(l2);
		countries.add(l3);
		countries.add(l4);
		countries.add(l5);
		
		states = new JPanel(new GridLayout(6,2));
		l6=new JLabel("Goa");
		l7=new JLabel("Kerala");
		l8=new JLabel("Assam");
		l9=new JLabel("Shimla");
		l10=new JLabel("Ranchi");
		
		states.add(l6);
		states.add(l7);
		states.add(l8);
		states.add(l9);
		states.add(l10);
		
		districts = new JPanel(new GridLayout(6,2));
		l11=new JLabel("Chennai");
		l12=new JLabel("Trichy");
		l13=new JLabel("Tanjore");
		l14=new JLabel("Bangalore");
		l15=new JLabel("Vellore");
		
		districts.add(l11);
		districts.add(l12);
		districts.add(l13);
		districts.add(l14);
		districts.add(l15);
		
		ap=new JTabbedPane();
                Container pane = frame.getContentPane();
		pane.add(ap);
		ap.addTab("Country",countries);
		ap.addTab("State",states);
		ap.addTab("District",districts);
		frame.setSize(200,200);
		frame.setVisible(true);

	}	
	public static void main(String[] args) 
	{
		TabbedPaneDemo  tpd = new TabbedPaneDemo ();
		tpd.createUI();		
	}
}
