package com.srm.day16.java;

import javax.swing.*;

public class NewFrame extends JFrame {

public static void main(String[] args) {
	NewFrame nf = new NewFrame();
}

JLabel lbl = new JLabel("Welcome Shiny!");
JPanel panel = new JPanel();

NewFrame(){
super("Login Done");
setSize(300,200);
setLocation(500,280);
panel.setLayout (null);

lbl.setBounds(70,50,150,60);

panel.add(lbl);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

}