package com.srm.day16.java;

import javax.swing.*;
import java.awt.event.*;

public class LoginExample extends JFrame {

public static void main(String[] args) {
	LoginExample  le = new LoginExample ();
}

JButton blogin = new JButton("LOGIN");
JPanel panel = new JPanel();
JTextField txt = new JTextField(15);
JPasswordField pwd = new JPasswordField(15);

LoginExample (){
super("Login Authentication");
setSize(300,200);
setLocation(500,280);
panel.setLayout (null);

JLabel userLabel = new JLabel("User Name: ");
userLabel.setBounds(10, 10, 80, 25);
panel.add(userLabel);
txt.setBounds(70,30,150,20);

JLabel passwordLabel = new JLabel("Password: ");
passwordLabel.setBounds(10, 40, 80, 25);
panel.add(passwordLabel);
pwd.setBounds(70,65,150,20);
blogin.setBounds(110,100,80,20);

panel.add(blogin);
panel.add(txt);
panel.add(pwd);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
actionlogin();
}

public void actionlogin(){

blogin.addActionListener(new ActionListener() {
	
public void actionPerformed(ActionEvent ae) {
String puname = txt.getText();
String ppaswd = pwd.getText();

if(puname.equals("Shiny") && ppaswd.equals("*****")) {
	NewFrame nf =new NewFrame();
nf.setVisible(true);
dispose();
} else {

JOptionPane.showMessageDialog(null,"Incorrect Username/ Password.");
txt.setText("");
pwd.setText("");
txt.requestFocus();
}
}
});

}
}