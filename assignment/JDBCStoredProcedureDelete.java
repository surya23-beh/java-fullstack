package assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCStoredProcedureDelete {
	static final String db_url = "jdbc:mysql://localhost:3306/testdb";
	static final String user = "root";
	static final String pass = "QWERTY88";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection(db_url,user,pass);
			CallableStatement cst = con.prepareCall("{call delete_employee(?)}");
			cst.setInt(1, 2);
			cst.execute();
			System.out.println("employee deleted");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
