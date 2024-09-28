package com.servlet.httpSession;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		HttpSession session = req.getSession(false); //false=don't create new session
		String name = session.getAttribute("myName").toString();
		String institute = session.getAttribute("myInstitute").toString();
		
		out.print("<h2 style='color:red'>Welcome, "+name+"</h2>");
		out.print("<h3 style='color:blue'>Class, "+institute+"</h3>");
		
	}

}
