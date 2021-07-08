package com.srm.day15.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo implements KeyListener,ActionListener
{
    static JFrame frame;
    static JTextField output;
    static JTextField input;
    
    public static void main(String args[])
    {
        
        frame=new JFrame("Keyboard Event");
        frame.setBackground(Color.black);
        frame.setSize(500,500);
        frame.setLayout(null);
        
        output=new JTextField();
        output.setBounds(0,0,500,50);
        frame.add(output);
      
        input=new JTextField();
        input.setBounds(0,400,500,50);
        frame.add(input);
        
        JButton exit=new JButton("EXIT");
        exit.setBounds(220,200,60,30);
        frame.add(exit);
      
        KeyEventDemo ked=new KeyEventDemo ();
      
        input.addKeyListener(ked);
        
        exit.addActionListener(ked);
        frame.setVisible(true);
    }
   
    @Override
    public void actionPerformed(ActionEvent e)
    {
        frame.dispose();
    }
  
    @Override
    public void keyReleased(KeyEvent e)
    {
        output.setText("");
        output.setText("Key Released : "+e.getKeyCode());
        
        if(Character.isLetter(e.getKeyChar()))
            keyTyped(e);
        if(Character.isDigit(e.getKeyChar()))
            keyTyped(e);
    }
    
    @Override
    public void keyPressed(KeyEvent e)
    {
        output.setText("");
        output.setText("Key Pressed : "+e.getKeyCode());
        
        if(Character.isLetter(e.getKeyChar()))
            keyTyped(e);
        if(Character.isDigit(e.getKeyChar()))
            keyTyped(e);
    }
   
    @Override
    public void keyTyped(KeyEvent e)
    {
        output.setText("");
        output.setText("Key Typed : "+e.getKeyChar());
        
    }
}
