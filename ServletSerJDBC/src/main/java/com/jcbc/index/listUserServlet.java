package com.jcbc.index;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class listUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/simpledb",
	            "root",
	            "QWERTY88"
	        );
	        PreparedStatement pst = con.prepareStatement("select * from simpletable3");
	        ResultSet rst = pst.executeQuery();
	        req.setAttribute("data", rst);
	        req.getRequestDispatcher("listUser.jsp").forward(req, res);
	        
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	

}
