package com.srm.day22.java;

import java.io.*;
import java.sql.*;

public class JDBCMenuDriven{
public static void main(String args[]) throws ClassNotFoundException, NumberFormatException, IOException, SQLException{
System.out.println("MENU OPTIONS");
System.out.println("------------");

while(true)
{
System.out.println("01 - Insert");
System.out.println("02 - Update");
System.out.println("03 - Display ");
System.out.println("04 - Delete ");
System.out.println("");
System.out.println("Enter Your choice:");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","ShinyFelicita21");
Statement stmt = con.createStatement();

int choice;
choice = Integer.parseInt(br.readLine());
switch(choice)
{
case 1:
System.out.println("Inserting Records.");
System.out.println("------------------");
System.out.println("Enter Employee ID:");
int id=Integer.parseInt(br.readLine());
System.out.println("Enter Employee Name:");
String name =(br.readLine());
System.out.println("Enter Designation:.");
String desgn = (br.readLine());

stmt.executeUpdate("INSERT INTO employee VALUES ('"+id+"','"+name+"','"+desgn+"')");
System.out.println("Data is Inserted Sucessfully ..");
break;

case 2:
	System.out.println("Updating Records.");
	System.out.println("------------------");
System.out.println("Enter Employee ID:");
int id1=Integer.parseInt(br.readLine());
System.out.println("Enter Employee Name:");
String name1 =(br.readLine());
System.out.println("Enter Designation:");
String desgn1 = (br.readLine());

stmt.executeUpdate("update employee set ename='"+name1+"', edesgn='"+desgn1+"' where eid= "+id1);
System.out.println("Data is Updated Sucessfully..");
break;

case 3:
	System.out.println("Displaying Records.");
	System.out.println("-------------------");
ResultSet rs = stmt.executeQuery("select * from employee");
while(rs.next())
{

System.out.println( id =rs.getInt(1));
System.out.println(name = rs.getString(2));
System.out.println(desgn= rs.getString(3));

}
rs.close();
stmt.close();
con.close();
break;

case 4:
	System.out.println("Deleting Records.");
	System.out.println("-----------------");
System.out.println("Enter the employee ID to be deleted:");
 int id2=Integer.parseInt(br.readLine());

stmt.executeUpdate("delete from employee where eid='"+id2+"'");
System.out.println("Data is Deleted Sucessfully.. ");
break;

}
}
}
}

