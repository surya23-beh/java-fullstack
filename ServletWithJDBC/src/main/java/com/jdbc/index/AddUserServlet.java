package com.jdbc.index;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simpledb",
				"root",
				"QWERTY88");
			PreparedStatement pst = con.prepareStatement("insert into simpletable3(user,email) values(?,?)");
			pst.setString(1, name);
			pst.setString(2, email);
			pst.executeUpdate();
			con.close();
			response.sendRedirect("view.jsp");
		}
		catch(Exception  e) {
			e.printStackTrace();
		}
	}

}
