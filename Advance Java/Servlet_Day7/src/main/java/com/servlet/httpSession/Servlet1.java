package com.servlet.httpSession;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String myName = req.getParameter("uname");
		String myInstitute = req.getParameter("iname");
		out.print("<h2 style='color:red'>Hello, "+myName+"</h2>");
		out.print("<h3 style='color:blue'>Office, "+myInstitute+"</h3>");
		
		//create session
		HttpSession session = req.getSession();
		//set attributes to the session
		session.setAttribute("myName", myName);
		session.setAttribute("myInstitute", myInstitute);
		
		out.print("<br>");
		//get the session id
		String id = session.getId();
		out.print("<h3 style='color:green'>Session Id: "+id+"</h3>");
		out.print("<a href='servlet2'><br>Visit</a>");
	}
}
