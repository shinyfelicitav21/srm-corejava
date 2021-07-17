package com.srm.day21.java;

import java.sql.*;

public class Transaction {
	static Statement stmt;
	static Connection con;
	public static void main(String args[])throws SQLException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 con =DriverManager.getConnection("jdbc:mysql://localhost:3306/transaction", "root","ShinyFelicita21");
		System.out.println("Driver is loaded");
		 stmt=con.createStatement();
		con.setAutoCommit(false);
		
}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		try
		{
		int i1=stmt.executeUpdate("insert into bank(CID,CName,CPlace,AccNo,Amt) values(105,'Sharon','Guindy',2309871234,1000)");
		int i3=stmt.executeUpdate("delete from bank where CID=102");
		con.commit();
		System.out.println("Transaction is success");
		}

		catch (Exception e)
		{
		try
		{
		con.rollback();
		System.out.println("Trasaction failed!");
		}
		catch (Exception ex)
		{
		System.out.println(ex);
		}
		}
//		stmt.close();
//		con.close();
		System.out.println("Connection is closed.");
		
		} 
		} 
