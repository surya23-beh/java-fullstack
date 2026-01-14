package com.url;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;



public class WelcomeServletURL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public WelcomeServletURL() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		out.println("<html> <body>");
		if(session != null) {
			String user = (String) session.getAttribute("username");
			out.println("<h2> welcome " + user + "</h2>");
		}
		else {
			out.println("<h2> Session expired </h2>");
		}
		
		out.println("</html> </body>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
