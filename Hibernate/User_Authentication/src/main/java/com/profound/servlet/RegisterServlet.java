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

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		User user = new User();
		user.setName(name);
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);

		Test_UserAuth t = new Test_UserAuth();

		if (t.registerUser(user)) {
			response.sendRedirect("login.jsp");
		} else {

			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			out.print("<h2 style='color:red; text-align: center;'> Registration Failed..!!!</h2>");
			rd.include(request, response);

		}
	}
}
