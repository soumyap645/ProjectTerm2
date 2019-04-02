package sqlempoyee;

import java.sql.*;

public class Jdbcdemo{

   public static void main(String[] args) throws ClassNotFoundException{
   
    String url="jdbc:sqlserver://172.23.237.11;databaseName=EmployeeProject4;user=sa;password=P@ssw0rd";
    String query="Select * from employee";
    try{
    Connection con=DriverManager.getConnection(url);
    Statement st =con.createStatement();
    ResultSet rs =st.executeQuery(query);
    System.out.println("Connected successfully");
    while(rs.next())
    {
     System.out.println(rs.getInt(1) +"  "+ rs.getString(2) +"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7)+"  "+rs.getString(8)+"  "+rs.getString(9)+"  "+rs.getString(10));
    
     
     }
    }
    catch(SQLException e) {
    e.printStackTrace();
    }
   }
}