package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;



public class JDBCCallableStatements2 {
	
	static final String db_url = "jdbc:mysql://localhost:3306/testdb";
	static final String user = "root";
	static final String pass = "QWERTY88";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Connection con = DriverManager.getConnection(db_url,user,pass);
		CallableStatement cs = con.prepareCall("{call get_car_sats_by_year(?,?,?,?,?)}");
		cs.setInt(1, 2019);
		cs.registerOutParameter(2, Types.INTEGER);
		cs.registerOutParameter(3, Types.DECIMAL);
		cs.registerOutParameter(3, Types.DECIMAL);
		cs.registerOutParameter(3, Types.DECIMAL);
		cs.execute();
		int make = cs.getInt(2);
		double min = cs.getDouble(3);
		double avg = cs.getDouble(4);
		double max = cs.getDouble(5);
		System.out.println("make name is : " + make );
		System.out.println("min value is : " + min );
		System.out.println("avg value is : " + avg );
		System.out.println("max value is : " + max );
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}


