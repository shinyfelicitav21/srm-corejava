import java.sql.*;  
    class EInsertion{  
    public static void main(String args[]){  
    try{  
    Class.forName("com.mysql.cj.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","ShinyFelicita21");  
    
    Statement stmt=con.createStatement(); 
     int result = stmt.executeUpdate("insert into employee(EID,EName,EDesgn) values(106,'Suresh','Project Lead')");
  
            
            if (result > 0)
                System.out.println("Inserted successfully");
  
            else
                System.out.println(
                    "Insertion failed!");  
    con.close();  
    }catch(Exception e){ System.out.println(e);
System.out.println("Database not connected");}  
    }  
    }