import java.sql.*;

public class EUpdate {
   
   public static void main(String[] args) {
     
      try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","ShinyFelicita21");
         Statement stmt = conn.createStatement();
      ) {		      
         String sql = "UPDATE employee" +
            "SET EName = "Sheela" WHERE EID in (104)";
         stmt.executeUpdate(sql);
         ResultSet rs = stmt.executeQuery("select * from employee");
         while(rs.next()){
            
            System.out.print("EID: " + rs.getInt("EID"));
            System.out.print(", EName: " + rs.getString("EName"));
            System.out.print(", EDesgn: " + rs.getString("EDesgn"));
            
         }
         rs.close();
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}