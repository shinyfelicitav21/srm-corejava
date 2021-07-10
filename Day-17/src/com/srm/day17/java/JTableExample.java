package com.srm.day17.java;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class JTableExample {

    public static void main(String[] args) {
    	SwingUtilities.invokeLater(new Runnable() {
    		public void run()
    		{
    		new Table();
    		}
    		});

    		}
    		}

    		class Table
    		{
    		String [] index;
    		JFrame f;
    		JTable table1, table2; 
    		JLabel label1, label2;

    		Table()
    		{
    		index= new String[]{"ID", "NAME", "DEPARTMENT","PLACE"};

    		f= new JFrame("JTable");
    		label1 = new JLabel("Employee Details.");


    		Object[][] ob = new Object[] [] {
    				{"1", "Sharon", "Sales","Adyar"},
    				{"2", "Chinnu","Mrketing","Tharamani"},
    				{"3", "Jagan", "Production","Mint"},
    				{"4", "Geetha", "Finance","Mount Road"},
    				{"5", "Naveen", "HR","Choolai"},
    				{"6", "Indra", "R&D","Perambur"},
    				
    				};
    			
    		table1 = new JTable(ob, index);

    		JScrollPane scroll = new JScrollPane(table1);

    		DefaultTableCellRenderer dtr = new DefaultTableCellRenderer();
    		dtr.setHorizontalAlignment(JLabel.CENTER); 
    		table1.setDefaultRenderer(Object.class, dtr);

    		scroll.setBorder(BorderFactory.createEmptyBorder()); 
    		scroll.setPreferredSize(new Dimension(380,150));		

    		label2 = new JLabel("Rows : " + table1.getRowCount() + ", Columns : "+ table1.getColumnCount() );

    		f.add(label1);
    		f.add(scroll);
    		f.add(label2);

    		f.setLayout(new FlowLayout());
    		f.setSize(500,250);
    		f.setVisible(true);
    		
    		}
    		}
    		
    

