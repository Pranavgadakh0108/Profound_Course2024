package com.servlet.crud;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DeleteServlet")
public class Delete_Employee extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		try
		{
//			PrintWriter out = resp.getWriter();
//			String sid = req.getParameter("id");
//			int id=Integer.parseInt(sid);
//			out.print("id"+id);
//			EmpDatabase.delete(id);
			EmpDatabase.delete(Integer.parseInt(req.getParameter("id")));
			resp.sendRedirect("ViewServlet");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
