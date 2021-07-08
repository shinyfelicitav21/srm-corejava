package com.srm.day15.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdapterClassExample {

	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	
	public AdapterClassExample(){
	prepareGUI();
	
	}
	
	public static void main(String[] args){
		
		AdapterClassExample  ac = new AdapterClassExample();        
	ac.showWindowAdapterDemo();
	}
	
	private void prepareGUI(){
		
	mainFrame = new JFrame("Adapter Class Example");
	mainFrame.setSize(400,400);
	mainFrame.setLayout(new GridLayout(3, 1));
	headerLabel = new JLabel("",JLabel.CENTER );
	statusLabel = new JLabel("",JLabel.CENTER);        
	statusLabel.setSize(350,100);
	
	mainFrame.addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent windowEvent){
	System.exit(0);
	}        
	});  
	
	controlPanel = new JPanel();
	controlPanel.setLayout(new FlowLayout());
	mainFrame.add(headerLabel);
	mainFrame.add(controlPanel);
	mainFrame.add(statusLabel);
	mainFrame.setVisible(true);  
	}
	
	private void showWindowAdapterDemo(){
		
	headerLabel.setText("Listener in action: WindowAdapter");      
	JButton okButton = new JButton("OK");
	final JFrame aboutFrame = new JFrame();
	aboutFrame.setSize(300,200);;
	aboutFrame.setTitle("WindowAdapter Sample");
	
	aboutFrame.addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent windowEvent){
	aboutFrame.dispose();
	}        
	});    
	
	JLabel msglabel 
	= new JLabel("My Window Adapter Class.",JLabel.CENTER);
	aboutFrame.add(msglabel);
	aboutFrame.setVisible(true);
	
	}
	}
