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


public class EditUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		int id = Integer.parseInt(req.getParameter("id"));
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
		        Connection con = DriverManager.getConnection(
		            "jdbc:mysql://localhost:3306/simpledb",
		            "root",
		            "QWERTY88"
		        );
		        PreparedStatement pst = con.prepareStatement("select * from simpletable3 where id=?");
		        pst.setInt(1, id);
		        ResultSet rs = pst.executeQuery();
		        
		        req.setAttribute("user", rs);
		        req.getRequestDispatcher("EditUser.jsp").forward(req,res);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


}
