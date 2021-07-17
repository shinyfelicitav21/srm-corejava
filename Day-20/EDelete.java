import java.sql.*;  
    class EDelete{  
    public static void main(String args[]){  
    try{  
    Class.forName("com.mysql.cj.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","ShinyFelicita21");  
    
    Statement stmt=con.createStatement(); 
     stmt.executeUpdate("delete from employee where EID=105");
  
            
     System.out.println("Deleted successfully"); 
    con.close();  
    }catch(Exception e){ System.out.println(e);
System.out.println("Database not connected");}  
    }  
    }