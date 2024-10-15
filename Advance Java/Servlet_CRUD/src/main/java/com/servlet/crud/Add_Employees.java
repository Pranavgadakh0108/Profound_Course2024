package com.servlet.crud;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AddEmployee")
public class Add_Employees extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String country = req.getParameter("country");
		
		Employee e = new Employee();
		e.setName(name);
		e.setEmail(email);
		e.setPassword(pass);
		e.setCountry(country);
		
		int status = EmpDatabase.insertEmp(e);
		
		if(status>0)
		{
			out.print("<h2 style='color:green'>Recored Added Successfully!!!</h2>");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);
		}
		else
		{
			out.print("<h2 style='color:red'>Sorry!! Unable to Records...</h2>");
		}
	}
}
