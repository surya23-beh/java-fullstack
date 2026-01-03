package assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUpdateSalary {
	static final String db_url = "jdbc:mysql://localhost:3306/testdb";
	static final String user = "root";
	static final String pass = "QWERTY88";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(db_url,user,pass);
			String str = "update employees2 set Emp_salary=15000 where Emp_id=5";
			CallableStatement cst = con.prepareCall(str);
			cst.executeUpdate();
			PreparedStatement pst = con.prepareStatement("select * from employees2");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("Emp_id") + " " 
						+ rs.getString("Emp_name") + " " + rs.getString("Emp_loc") + " " + rs.getString("Emp_salary") );			
			}
			rs.close();
			pst.close();
			cst.close();
			con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
