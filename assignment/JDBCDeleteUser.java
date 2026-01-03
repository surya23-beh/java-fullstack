package assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDeleteUser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb",
					"root",
					"QWERTY88");
			String str = "delete from employees2 where Emp_salary<20000";
			PreparedStatement pst = con.prepareStatement(str);
			int rows = pst.executeUpdate();
			if(rows == 1) {
				System.out.println(rows +" deleted");
			}
			else {
				System.out.println("every employee above 20000");
			}
		    
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
