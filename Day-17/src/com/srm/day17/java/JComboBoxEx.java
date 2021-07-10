package com.srm.day17.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class JComboBoxEx {
	
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public JComboBoxEx (){
      prepareGUI();
   }
   
   public static void main(String[] args){
	   JComboBoxEx  cb = new JComboBoxEx ();      
     cb.showComboboxDemo();
   }
   
   private void prepareGUI(){
      mainFrame = new JFrame("JComboBox Example");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent we){
            System.exit(0);
         }        
      });    
      
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JLabel("",JLabel.CENTER);    
      statusLabel.setSize(250,80);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }
   
   private void showComboboxDemo(){                                    
      headerLabel.setText("JComboBox Demo"); 
      final DefaultComboBoxModel cb = new DefaultComboBoxModel();

      cb.addElement("Doctor");
      cb.addElement("Engineer");
      cb.addElement("Teacher");
      cb.addElement("Pilot");
      cb.addElement("Police");
      
      final JComboBox cb1 = new JComboBox(cb);    
      cb1.setSelectedIndex(0);

      JScrollPane scroll = new JScrollPane(cb1);    
      JButton btn = new JButton("SHOW");

     btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) { 
            String data = "";
            if (cb1.getSelectedIndex() != -1) {                     
               data = "Selected Item: " 
                  + cb1.getItemAt
                  (cb1.getSelectedIndex());             
            }              
            statusLabel.setText(data);
            
         }
      }); 
     
      controlPanel.add(scroll);          
      controlPanel.add(btn);    
      mainFrame.setVisible(true);
      
   }
}