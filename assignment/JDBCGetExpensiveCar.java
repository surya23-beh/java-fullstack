package assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class JDBCGetExpensiveCar {
	static final String db_url = "jdbc:mysql://localhost:3306/testdb";
	static final String user = "root";
	static final String pass = "QWERTY88";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection(db_url,user,pass);
			CallableStatement cst = con.prepareCall("{call expensive_car_model(?,?,?)}");
			cst.setString(1, "Ferrari");
			cst.registerOutParameter(2, Types.VARCHAR);
			cst.registerOutParameter(3, Types.DECIMAL);
			cst.execute();
			String name = cst.getString(2);
			double maxValue = cst.getDouble(3);
			System.out.println("THE EXPENSIVE CAR MODEL IS : " + name);
			System.out.println("THE VALUE IS : " + maxValue);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
