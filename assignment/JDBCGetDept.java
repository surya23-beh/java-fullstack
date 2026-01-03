package assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class JDBCGetDept {
	static final String db_url = "jdbc:mysql://localhost:3306/testdb";
	static final String user = "root";
	static final String pass = "QWERTY88";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection(db_url,user,pass);
			CallableStatement cst = con.prepareCall("{call display_dept(?)}");
			cst.setString(1, "hr");
			cst.execute();
			ResultSet rs = cst.executeQuery();
			System.out.println("Employees under hr are :");
			while(rs.next()) {
				System.out.println(rs.getString("Emp_name"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
