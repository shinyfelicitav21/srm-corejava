package com.srm.day16.java;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class SwingCalculator extends JFrame implements ActionListener {
   
    static JFrame f;
    static JTextField tf;
    String s0, s1, s2;

    SwingCalculator()
    {
        s0 = s1 = s2 = "";
    }
 
    public static void main(String args[])
    {
        f = new JFrame("Swing Calculator");
 
        try {
           
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
 
        SwingCalculator sc = new SwingCalculator();
 
        tf = new JTextField(16);
        tf.setEditable(false);
 
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, add, sub, div, mul, dot, clr, eq;
 
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
 
        eq = new JButton("=");
 
        add= new JButton("+");
        sub = new JButton("-");
        div = new JButton("/");
        mul= new JButton("*");
        clr = new JButton("C");
 
        dot = new JButton(".");
 
        JPanel p = new JPanel();
 
        mul.addActionListener(sc);
        div.addActionListener(sc);
        sub.addActionListener(sc);
        add.addActionListener(sc);
        b9.addActionListener(sc);
        b8.addActionListener(sc);
        b7.addActionListener(sc);
        b6.addActionListener(sc);
        b5.addActionListener(sc);
        b4.addActionListener(sc);
        b3.addActionListener(sc);
        b2.addActionListener(sc);
        b1.addActionListener(sc);
        b0.addActionListener(sc);
        dot.addActionListener(sc);
        eq.addActionListener(sc);
        clr.addActionListener(sc);
 
        p.add(tf);
        p.add(add);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(sub);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(mul);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(div);
        p.add(dot);
        p.add(b0);
        p.add(eq);
        p.add(clr);
        
        p.setBackground(Color.black);
        f.add(p);
        f.setSize(500,500);
        f.show();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
 
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
         
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;
            tf.setText(s0 + s1 + s2);
        }
        
        else if (s.charAt(0) == 'C') {
           
            s0 = s1 = s2 = "";
            tf.setText(s0 + s1 + s2);
        }
        
        else if (s.charAt(0) == '=') {
 
            double te;
 
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
 
            tf.setText(s0 + s1 + s2 + "=" + te);
            s0 = Double.toString(te);
            s1 = s2 = "";
        }
       
        else {
           
            if (s1.equals("") || s2.equals(""))
                s1 = s;
          
            else {
                double te;
                
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
 
                s0 = Double.toString(te);
                s1 = s;
                s2 = "";
            }
            
            tf.setText(s0 + s1 + s2);
            
        }
    }
}