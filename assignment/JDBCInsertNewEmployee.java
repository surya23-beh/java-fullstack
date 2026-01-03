package assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCInsertNewEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb",
					"root",
					"QWERTY88");
			PreparedStatement pst = con.prepareStatement("select * from employees2");
			ResultSet rs = pst.executeQuery();
			String str = "insert into employees2 values(?,?,?,?)";
			CallableStatement cst = con.prepareCall(str);
			cst.setInt(1,6);
			cst.setString(2, "ravi");
			cst.setString(3, "Pattinampakam");
			cst.setInt(4, 12000);
			cst.execute();
			System.out.println("uploaded sucessfully");
			System.out.println("after uploading");
			while(rs.next()) {
				System.out.println(rs.getInt("Emp_id") + " " 
						+ rs.getString("Emp_name") + " " + rs.getString("Emp_loc") + " " + rs.getString("Emp_salary") );
						
			}
			cst.close();
			rs.close();
			pst.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
