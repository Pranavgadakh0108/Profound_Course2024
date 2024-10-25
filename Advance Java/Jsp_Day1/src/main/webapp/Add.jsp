<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add</title>
</head>
<body>
 <%! public int  add(int a, int b){
	 
	 	return a+b;
	 
 }%>
 
 <h1>
 <%= 
    "addition= "+add(Integer.parseInt(request.getParameter("num1")),Integer.parseInt(request.getParameter("num2")))
 %>
 </h1>
</body>
</html>