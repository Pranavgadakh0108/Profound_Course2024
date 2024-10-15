package com.servlet.crud;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EditServlet2")
public class Update_Employee2 extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		try
		{
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			
			String sid = req.getParameter("id");
			int id = Integer.parseInt(sid);
			
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			String country = req.getParameter("country");
			
			Employee e1 = new Employee();
			e1.setId(id);
			e1.setName(name);
			e1.setEmail(email);
			e1.setPassword(password);
			e1.setCountry(country);
			
			int status = EmpDatabase.update(e1);
			
			if(status>0)
			{
				resp.sendRedirect("ViewServlet");
			}
			else
			{
				out.print("<h2 style='color:red'>Sorry!!, Unable to Update</h2>");
				RequestDispatcher rd = req.getRequestDispatcher("EditServlet");
				rd.include(req, resp);
			}
					
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
