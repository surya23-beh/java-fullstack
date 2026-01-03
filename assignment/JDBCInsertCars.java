package assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCInsertCars {
	static final String db_url = "jdbc:mysql://localhost:3306/testdb";
	static final String user = "root";
	static final String pass = "QWERTY88";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection(db_url,user,pass);
			CallableStatement cst = con.prepareCall("{call Create_Cars(?,?,?,?)}");
			cst.setString(1, "BMW");
			cst.setString(2, "GTR");
			cst.setInt(3, 2007);
			cst.setDouble(4, 124532.87);
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
