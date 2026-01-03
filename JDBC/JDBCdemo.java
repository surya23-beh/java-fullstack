package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCdemo {
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
		PreparedStatement pst = con.prepareStatement("select * from employees");
		
		// 4. Execute query
		ResultSet rs = pst.executeQuery();
		
		// 5. process Result
		while(rs.next()) {
			System.out.println(rs.getInt("Emp_id") + " " 
		+ rs.getString("Emp_name") + " " + rs.getString("Emp_loc") + " " + rs.getString("Emp_salary") );
		}
		
		// 6. close resources
		rs.close();
		pst.close();
		con.close();
		
				
	}
	catch(Exception e) {
		e.printStackTrace();
	}

	}

}


