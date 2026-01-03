package assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUpdateDept {
	static final String db_url = "jdbc:mysql://localhost:3306/testdb";
	static final String user = "root";
	static final String pass = "QWERTY88";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection(db_url,user,pass);
			CallableStatement cst = con.prepareCall("{call update_dept(?,?)}");
			cst.setInt(1, 1);
			cst.setString(2, "kitchen");
			cst.execute();
			PreparedStatement pst = con.prepareStatement("select * from employees2");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("Emp_id") + " " 
			+ rs.getString("Emp_name") + " " + rs.getString("Emp_loc") + " " 
						+ rs.getString("Emp_salary") + " "
			+ rs.getString("Emp_dept"));
			}
			cst.close();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
