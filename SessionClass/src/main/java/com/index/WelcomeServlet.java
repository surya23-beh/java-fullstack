package com.index;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		// creating a session
		HttpSession session = request.getSession();
		String username = (session!=null) ? (String) session.getAttribute("username"): null;
		
		if(username != null) {
			response.getWriter().println("<h1> welcome ," + username + "! </h1>");
		}
		else {
			response.getWriter().println("<h1> Please login first </h1>");
			response.setHeader("Refresh", "2; URL=index.html");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
