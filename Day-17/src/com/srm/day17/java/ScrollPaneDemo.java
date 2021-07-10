package com.srm.day17.java;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

public class ScrollPaneDemo {
	
public static void main(String[]  args) {
	
String[] index = new String[] { "ID", "NAME", "DEPARTMENT","PLACE"  };
JFrame frame = new JFrame("JScrollPane with JTable");
JLabel label = new JLabel("Employee Details.", JLabel.CENTER);

Object[][] ob = new Object[] [] {
		{"1", "Sharon", "Sales","Adyar"},
		{"2", "Chinnu","Mrketing","Tharamani"},
		{"3", "Jagan", "Production","Mint"},
		{"4", "Geetha", "Finance","Mount Road"},
		{"5", "Naveen", "HR","Choolai"},
		{"6", "Indra", "R&D","Perambur"},
		{"7",  "Durga","Purchasing","Vepery"},
		{"8",  "Dev",  "Maintenance","Kolathur"},
		{"9",  "Karthick",  "Budgeting","Egmore"},
		{"10",  "Raj",  "CyberSecurity","Tambaram"},
		
		};

DefaultTableModel dtm= new DefaultTableModel(ob, index);

JTable table = new JTable(dtm);

DefaultTableCellRenderer dtr = new DefaultTableCellRenderer();

dtr.setHorizontalAlignment(JLabel.CENTER);
table.setDefaultRenderer(Object.class, dtr);


JPanel panel = new JPanel(new BorderLayout());
panel.add(table, BorderLayout.CENTER);

JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

frame.add(label, BorderLayout.NORTH);
frame.add(scroll, BorderLayout.CENTER);
frame.setSize(320, 200);
frame.setVisible(true);

}
}

