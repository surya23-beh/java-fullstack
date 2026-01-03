package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC_update {

	public static void main(String[] args) {
		try {
			// 1. load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. Create connection
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb",
					"root",
					"QWERTY88");
			
			// 3. Create statement
			PreparedStatement pst = con.prepareStatement("insert into employees(Emp_id,Emp_name,Emp_loc,Emp_salary) values(?,?,?,?)");
			pst.setInt(1, 5);
			pst.setString(2,"surinari");
			pst.setString(3,"chennai");
			pst.setInt(4, 50000);
			int row = pst.executeUpdate();
			System.out.println(row  + "row inserted");
			
			
			
			// 6. close resources
		
			pst.close();
			con.close();
			
					
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
