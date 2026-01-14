package com.jcbc.index;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();

	    String name = request.getParameter("name");
	    String email = request.getParameter("email");

	  

	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/simpledb",
	            "root",
	            "QWERTY88"
	        );

	        PreparedStatement pst = con.prepareStatement(
	            "insert into simpletable3(name, email) values (?, ?)"
	        );

	        pst.setString(1, name);
	        pst.setString(2, email);
	        pst.executeUpdate();

	        out.println("<h3>Data inserted successfully</h3>");

	        con.close();

	        // TEMPORARILY comment redirect
	        // response.sendRedirect("view.jsp");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}


}
