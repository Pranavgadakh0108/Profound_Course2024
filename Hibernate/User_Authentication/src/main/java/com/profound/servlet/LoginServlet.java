package com.profound.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.profound.entity.User;
import com.profound.test.Test_UserAuth;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Test_UserAuth t = new Test_UserAuth();
		User user = t.validateUser(username, password);

		System.out.println("---------------------------------------");
		System.out.println("user= " + user);
		System.out.println("---------------------------------------");
		
		if (user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("profile.jsp");
		} else {

			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			out.print("<h2 style='color:red; text-align: center;'> Login Failed..!!!</h2>");
			rd.include(request, response);
		}
	}
}
