package com.profound.auth_filter;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class LoginFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)throws IOException, ServletException 
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		if(uname.equals("pranav"))
		{
			if(pass.equals("1234"))
			{
				chain.doFilter(req, resp);
			}
			else
			{
				out.print("<h3 style='color:orange'>Password is incorrect !!!</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("index.html");
				rd.include(req, resp);
			}
		}
		else
		{
			out.print("<h3 style='color:orange'>Username is incorrect !!!</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);
		}
		
	}

}
