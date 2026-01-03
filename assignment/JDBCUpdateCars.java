package assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUpdateCars {
	static final String db_url = "jdbc:mysql://localhost:3306/testdb";
	static final String user = "root";
	static final String pass = "QWERTY88";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection(db_url,user,pass);
			CallableStatement cst = con.prepareCall("{call update_cars(?,?)}");
			cst.setString(1, "BMW");
			cst.setDouble(2, 292929.20);
			cst.execute();
			PreparedStatement pst = con.prepareStatement("select * from cars");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("make") + " " + rs.getString("model") +
					" " + rs.getInt("year") + " " + rs.getDouble("value")
						);
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
