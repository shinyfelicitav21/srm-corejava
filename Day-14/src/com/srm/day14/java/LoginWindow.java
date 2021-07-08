package com.srm.day14.java;

import java.awt.event.*;
import javax.swing.*;

public class LoginWindow {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Login Window");
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private static void placeComponents(JPanel panel) {

		panel.setLayout(null);

		JLabel userLabel = new JLabel("User Name: ");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);

		JLabel passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		panel.add(passwordText);

		JButton loginButton = new JButton("LOGIN");
		loginButton.setBounds(80, 80, 80, 25);
		panel.add(loginButton);
		
		ActionListener loginButtonListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JButton source = (JButton) e.getSource();
				JOptionPane.showMessageDialog(source, source.getText()
						+ " was done..");
			}
		};
		
		loginButton.addActionListener(loginButtonListener);
		
		}
	}


