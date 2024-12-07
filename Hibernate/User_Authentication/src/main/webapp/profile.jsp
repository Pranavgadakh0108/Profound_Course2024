<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous"></script>
	
	<style>
		body{
			background-color: black;
		}
		.card-body{
			background-image: linear-gradient(to bottom right, #333399 , #FF00CC);
		}	
	</style>
</head>
<body>
	<%@ page import="com.profound.entity.User"%>
	<%
	User user = (User) session.getAttribute("user");
	if (user != null) {
	%>
	<div class="card text-center">
		<div class="card-body">
			<h1 class="card-title" style="color: white;">Welcome, <%=user.getName()%></h1>
			<br>
			<a href="login.jsp" class="btn btn-outline-info">Logout</a>
		</div>
	</div>
	<%
	} else {
	response.sendRedirect("login.jsp");
	}
	%>
</body>
</html>