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


public class updateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/simpledb",
	            "root",
	            "QWERTY88"
	        );
	        PreparedStatement pst = con.prepareStatement("update from simpletable3 set name=?,email=? where id=?");
	        pst.setString(1, name);
	        pst.setString(2, email);
	        pst.setInt(3, id);
	        
	        int rows = pst.executeUpdate();
	        pst.close();
	        
	        if(rows>0) {
	        	res.sendRedirect("success.jsp");
	        }
	        else {
	        	res.sendRedirect("error.jsp");
	        }
	       
	        con.close();
	        res.sendRedirect("listUser");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
