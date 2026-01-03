package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCwithCallableStatements {
	
	static final String db_url = "jdbc:mysql://localhost:3306/testdb";
	static final String user = "root";
	static final String pass = "QWERTY88";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Connection con = DriverManager.getConnection(db_url,user,pass);
		String stmt = "insert into employees values(?,?,?,?)";
		CallableStatement cs = con.prepareCall(stmt);
		cs.setInt(1, 199);
		cs.setString(2, "suripoori2");
		cs.setString(3, "koomapatti");
		cs.setInt(4, 20000)   ;
		cs.execute();
		System.out.println("Uploaded successfully");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}

