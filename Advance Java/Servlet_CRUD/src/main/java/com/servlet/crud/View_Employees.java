package com.servlet.crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ViewServlet")
public class View_Employees extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<button style='background-color:pink'><a href='index.html'>Add Employees</a></button>");
		out.println("<h2 style='color:red'>Employee List</h2>");
		
		List<Employee> list = EmpDatabase.getAllEmployees();
		
		out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Id</th><th>Name</th><th>Email</th><th>Password</th><th>Country</th><th>Edit</th><th>Delete</th></tr>");  
        for(Employee e:list){  
         out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getEmail()+"</td>"
         		+ "<td>"+e.getPassword()+"</td><td>"+e.getCountry()+"</td>"
         				+ "<td><a href='EditServlet?id="+e.getId()+"'>edit</a></td>"
         						+ "<td><a href='DeleteServlet?id="+e.getId()+"'>delete</a></td></tr>");  
        }  
        out.print("</table>");  
		out.close();
	}

}
