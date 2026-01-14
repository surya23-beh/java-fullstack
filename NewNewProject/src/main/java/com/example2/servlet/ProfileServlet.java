package com.example2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Cookie[] cookies = request.getCookies();
		String user = null;
		if(cookies != null) {
			for(Cookie c : cookies) {
				if(c.getName().equals("user")) {
					user = c.getValue();
				}
			}
		}
		if(user != null) {
			out.println("<h2> welcome ," + user + "</h2>");
			out.println("<a href='LogoutServlet'>Logout</a>");
		}
		else {
			out.println("<h3> Please Login first <h3>");
			out.println(" <a href='" + request.getContextPath() + "/Login.html'>Login</a>");
		}
		
	}
}
