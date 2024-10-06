package com.forward.method;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/validateServlet")
public class Validate_Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		RequestDispatcher rd = req.getRequestDispatcher("index.html");
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		if(uname.equals("pranav"))
		{
			if(pass.equals("1234"))
			{
				RequestDispatcher rd1 = req.getRequestDispatcher("/welcome");
				rd1.forward(req, resp);
			}
			else
			{
				out.print("<h2 style='color:red'>Password Incorrect !!!</h2>");
				rd.include(req, resp);
			}
		}
		else
		{
			out.print("<h2 style='color:red'>Username Incorrect !!!</h2>");
			rd.include(req, resp);
		}
		
	}

}
