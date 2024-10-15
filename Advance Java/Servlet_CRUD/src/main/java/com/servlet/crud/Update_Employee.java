package com.servlet.crud;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EditServlet")
public class Update_Employee extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		try
		{
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.print("<h2 style='color:brown'>Update Employee</h2>");
			
			Employee e1=EmpDatabase.getEmployeeId(Integer.parseInt(req.getParameter("id")));
			
			out.print("<form action='EditServlet2' method='post'>");
			out.print("<table>");
			out.print("<tr><td></td><td><input type='hidden' name='id' value='"+e1.getId()+"'/></td></tr>");
			out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+e1.getName()+"'/></td></tr>");
			out.print("<tr><td>Password:</td><td><input type='email' name='email' value='"+e1.getEmail()+"'/></td></tr>");
			out.print("<tr><td>Email:</td><td><input type='password' name='password' value='"+e1.getPassword()+"'/></td></tr>");
			out.print("<tr><td>Country:</td><td>");
			out.print("<select name='country' style='width:150px'>");
			out.print("<option>India</option>");
			out.print("<option>USA</option>");
			out.print("<option>UK</option>");
			out.print("<option>Other</option>");
			out.print("</select>");
			out.print("</td></tr>");
			out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");
			out.print("</table>");
			out.print("</form>");
			
			out.close();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
