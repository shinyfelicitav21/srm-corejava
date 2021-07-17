package com.srm.day21.java;

import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;  
import java.sql.*;  

public class BookExample1 extends JFrame implements ActionListener {  

    JLabel l1, l2, l3, l4,l5;  
    JTextField tf1, tf2, tf3, tf4;  
    JButton btn;  
     
    BookExample1() {  
        
        super("Fetching Book Details");  
        l5 = new JLabel("Enter Book Name:");  
        l5.setBounds(20, 20, 100, 20);  
        tf4 = new JTextField(20);  
        tf4.setBounds(130, 20, 200, 20);  
        btn = new JButton("SUBMIT");  
        btn.setBounds(50, 50, 100, 20);  
        btn.addActionListener(this);  
        l1 = new JLabel("BOOK INFORMATION");  
        l1.setBounds(30, 80, 450, 30);  
        l1.setForeground(Color.black);  
        l1.setFont(new Font("Serif", Font.BOLD, 20));  
        setVisible(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setSize(500, 500);  
        l2 = new JLabel("Book No:");  
        l2.setBounds(20, 120, 100, 20);  
        tf1 = new JTextField(50);  
        tf1.setBounds(130, 120, 200, 20);  
        l3 = new JLabel("Book Name :");  
        l3.setBounds(20, 150, 100, 20);  
        tf2 = new JTextField(100);  
        tf2.setBounds(130, 150, 200, 20);  
        l4 = new JLabel("Author Name:");  
        l4.setBounds(20, 150, 100, 20);  
        tf3 = new JTextField(100);  
        tf3.setBounds(130, 180, 200, 20);  
         
         
        add(l5);  
        add(tf4);  
        add(btn);  
        add(l1);  
        add(l2);  
        add(tf1);  
        add(l3);  
        add(tf2);  
        add(l3);  
        add(tf3);  
        add(l4);
       
    }  
    public void actionPerformed(ActionEvent e) {  
       
        try {  
            String str = tf4.getText();  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/booktable","root","ShinyFelicita21");   
            PreparedStatement ps = con.prepareStatement("select * from book where BName=?");  
            ps.setString(1, str);  
            
            ResultSet rs = ps.executeQuery();  
            if (rs.next()) {  
            	
                int s1 = rs.getInt(1);  
                String s2 = rs.getString(2);  
                String s3 = rs.getString(3);  
                //String s4 = rs.getString(4);  
                  
              //  int n1 = Integer.parseInt(tf1.getText());
                tf1.setText(String.valueOf(s1));  
              
                tf2.setText(s2);  
                tf3.setText(s3);  
                //tf4.setText(s4);  
            } else {  
                JOptionPane.showMessageDialog(null, "Invalid Book Name.");  
            }  
              
        } catch (Exception ex) {  
            System.out.println(ex);  
        }  
    }  
    
    public static void main(String args[]) {  
    	new BookExample1();  
    }
    }  
 
