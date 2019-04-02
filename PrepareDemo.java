package sqlempoyee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareDemo {
	public static void main(String[] args)  {
		String query = "Select * from employee where  empid=? ";
		Connection con = DataBaseCon.getDatBaseConnection();
		PreparedStatement st;
		try {
			
			
			con.setAutoCommit(false);
			st = con.prepareStatement(query);
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the employee details");
			int empid=sc.nextInt();
			st.setInt(1, empid);
			ResultSet rs=st.executeQuery();
		
			while(rs.next())
			{
			
				System.out.print(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				System.out.println(rs.getString(5));
				System.out.println(rs.getString(7));
				System.out.println(rs.getString(8));
				System.out.println(rs.getString(9));
				System.out.println(rs.getString(10));
				
			}
			
		
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
			System.out.println(e.getNextException());
		}

	}

}
