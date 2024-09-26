package com.servlet.session.hiddenFormField;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String myname = req.getParameter("uname");
		
		out.print("<form action='servlet2'>");
		out.print("<h2 style='color:red'>Welcome, "+myname+"<h2>");
		out.print("<input type='hidden' name='uname' value="+myname+"");
		out.print("<br><button type='submit' value='submit' style='color:green'>Call Servlet2</button>");
		out.print("</form>");
	}

}
