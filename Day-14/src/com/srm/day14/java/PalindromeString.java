package com.srm.day14.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PalindromeString extends JFrame{
	
	public static void main(String[] args) {
		
		Frame f = new Frame("Palindrome String");
		int width = 150;
		int height = 150;
		f.setSize(width, height);
		f.setVisible(true);
	PalindromeString frame = new PalindromeString();
    frame.setVisible(true);
    
}
    public PalindromeString()
    {
        setLayout(new GridLayout(4,1,10,20));

        JLabel inputLabel = new JLabel("Enter a string: ");
        JTextField inputTextField = new JTextField(20);
        add(inputLabel);
        add(inputTextField);

        JLabel outputLabel = new JLabel("Output: ");
        JTextField outputTextField = new JTextField(20);
        add(outputLabel);
        add(outputTextField);
        outputTextField.setEditable(false);

        JButton checkPalindromeButton = new JButton("Check");
        checkPalindromeButton.setBounds(100, 80, 100, 100);
        add(checkPalindromeButton);

        
        checkPalindromeButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String copyUserInput="";
                String userInput = inputTextField.getText();
                int length = userInput.length();

                for (int i = length-1; i>=0; i-- )
                {
                    copyUserInput = copyUserInput + userInput.charAt(i);
                }
                if (copyUserInput.equalsIgnoreCase(userInput))
                {
                    outputTextField.setText(userInput+" is a palindrome string.");
                }
                else
                {
                    outputTextField.setText(userInput+" is not a palindrome string!!");
                }
            }
            
        });
       
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}