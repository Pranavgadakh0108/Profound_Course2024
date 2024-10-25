<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
</head>
<body>
	<%!int num1,num2,add,sub,mul,div; %>
	
	<%!String opr; %>
	
	<%
		num1=Integer.parseInt(request.getParameter("num1"));
		num2=Integer.parseInt(request.getParameter("num2"));
		opr=request.getParameter("oper");
	%>
	
	<% 
		if(opr.equals("Addition"))
		{
			 add=num1+num2; 
			 out.print("<h1 style='color:blue'>Addition: "+add+"</h1>");
			 out.print("<button style='background-color:pink'><a href='index.jsp'>Home</a></button>");
		}
		else if(opr.equals("Subtraction"))
		{
			sub=num1-num2;
			out.print("<h1 style='color:blue'>Subtraction: "+sub+"</h1>");
			out.print("<button style='background-color:pink'><a href='index.jsp'>Home</a></button>");
		}
		else if(opr.equals("Multiplication"))
		{
			mul=num1*num2;
			out.print("<h1 style='color:blue'>Multiplication: "+mul+"</h1>");
			out.print("<button style='background-color:pink'><a href='index.jsp'>Home</a></button>");
		}
		else
		{
			try
			{
				div=num1/num2;
				out.print("<h1 style='color:blue'>Division: "+div+"</h1>");
				out.print("<button style='background-color:pink'><a href='index.jsp'>Home</a></button>");
			}catch(Exception e)
			{
				out.print("<h2 style='color:red'>Error!!! "+e+"</h2>");
				out.print("<button style='background-color:pink'><a href='index.jsp'>Home</a></button>");
				
			}
		}
	%>
</body>
</html>