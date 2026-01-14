package com.example2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(userName.equals("admin") && password.equals("1234")) {
			Cookie ck = new  Cookie("user",  userName);
			ck.setMaxAge(60*60); // 1 hour
			response.addCookie(ck);
			
			out.println("<h3> Login Successfull <h3>");
			out.println(" <a href='" + request.getContextPath() + "/ProfileServlet'> Go to Profile </a>");
		}
		else {
			out.println("<h3> INvalid Login <h3>");
			out.println(" <a href='" + request.getContextPath() + "/Login.html'> Try Again </a>");
		}
	}
}
