package com.srm.day16.java;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.event.*;

public class TemperatureConversion extends JFrame {

private JPanel panel;
private final ButtonGroup bg = new ButtonGroup();

public static void main(String[] args) 
{
    EventQueue.invokeLater(new Runnable() 
    {
        public void run()
        {
            try {
            	TemperatureConversion  frame = new TemperatureConversion ();
                frame.setVisible(true);
            } 
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    });
}

public TemperatureConversion () {

    setTitle("Temperature Converter");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(0, -33, 385, 272);
    
   panel = new JPanel();
   panel.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane( panel);
    panel.setLayout(null);

    JTextPane txt = new JTextPane();
    
    txt.setBounds(12, 46, 124, 26);
    panel.add(txt);

    JRadioButton rbtn1 = new JRadioButton("Celcius ");
    bg.add(rbtn1);
    rbtn1.setBounds(212, 34, 67, 24);
    
    panel.add(rbtn1);

    JRadioButton rbtn2 = new JRadioButton("Fahrenheit");
    bg.add(rbtn2);
    rbtn2.setBounds(212, 62, 85, 24);
    panel.add(rbtn2);

    JLabel lbl = new JLabel("Degree: ");
    lbl.setBounds(154, 49, 78, 16);
    panel.add(lbl);

    JTextPane txtoutput = new JTextPane();
    txtoutput .setBackground(UIManager.getColor("Button.background"));
    
    txtoutput .setEditable(false);
    txtoutput .setBounds(12, 138, 267, 22);
    panel.add(txtoutput );

    JButton mbtn = new JButton("CONVERT");
    mbtn.setBounds(100, 110, 98, 26);
    panel.add(mbtn);
    
    mbtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {

            if(rbtn1.isSelected()){
                try{
                    double temp=Double.parseDouble(txt.getText());
                    temp = temp * 1.8 + 32;
                    txtoutput .setText(Double.toString(temp));
                }catch(Exception e){
                	txtoutput .setText("Enter valid temperature.");
                }
                
            }else{
                try{
                    double temp=Double.parseDouble(txt.getText());
                    temp = (temp - 32) * (5.0/9.0);
                    txtoutput .setText(Double.toString(temp));
                    
                }catch(Exception e){
                	txtoutput .setText(" Enter valid temperature.");
                }
            }
        }
    });
}

}
