package com.example2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Remove the "user" cookie
        Cookie ck = new Cookie("user", "");
        ck.setMaxAge(0); // Delete cookie
        response.addCookie(ck);

        out.println("<h3>You are logged out</h3>");
        out.println("<a href='" + request.getContextPath() + "/Login.html'>Login again</a>");
    }
}
