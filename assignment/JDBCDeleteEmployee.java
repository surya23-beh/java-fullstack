package assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCDeleteEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb",
					"root",
					"QWERTY88");
			String str = "delete from employees2 where Emp_id=2";
			CallableStatement cst = con.prepareCall(str);
			cst.executeUpdate();
			
			PreparedStatement pst = con.prepareStatement("select * from employees2");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("Emp_id") + " " 
						+ rs.getString("Emp_name") + " " + rs.getString("Emp_loc") + " " + rs.getString("Emp_salary") 
						+ " " + rs.getString("Emp_dept"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
