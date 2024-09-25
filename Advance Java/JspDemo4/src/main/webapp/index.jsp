<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setAttribute("request_name", "pranav gadakh");
		out.println(request.getAttribute("request_name"));
	%>
	<h3 style="color: red;">Hello: ${requestScope.request_name}</h3>
	
	<%
		session.setAttribute("session_name", "Java Programming");
		out.println(session.getAttribute("session_name"));	
	%>
	<h3 style="color: blue;">Programming: ${session_name}</h3>
</body>
</html>