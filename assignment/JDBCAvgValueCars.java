package assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class JDBCAvgValueCars {
	static final String db_url = "jdbc:mysql://localhost:3306/testdb";
	static final String user = "root";
	static final String pass = "QWERTY88";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection(db_url,user,pass);
			CallableStatement cst = con.prepareCall("{call avg_value_cars(?)}");
			cst.registerOutParameter(1, Types.DECIMAL);
			cst.execute();
			double d = cst.getDouble(1);
			System.out.println("average value is : " + d);
		}
		catch(Exception e) {
			
		}}
}
