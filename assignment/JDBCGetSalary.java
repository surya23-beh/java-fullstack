package assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class JDBCGetSalary {
	static final String db_url = "jdbc:mysql://localhost:3306/testdb";
	static final String user = "root";
	static final String pass = "QWERTY88";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection(db_url,user,pass);
			CallableStatement cst = con.prepareCall("{call get_salary(?,?)}");
			cst.setInt(1, 1);
			cst.registerOutParameter(2, Types.INTEGER);
			cst.execute();
			long sal = cst.getInt(2);
			System.out.println("The selected employees's salary is : " + sal);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
