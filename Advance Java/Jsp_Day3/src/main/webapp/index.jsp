<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
<style>
	form{
		background-color: purple;
		
		padding: 20px;
		border: 2px solid red;
		text-align: center;
		color: yellow;
		border-radius: 15px;
		font-weight: bolder;
	}
	h1{
		color: lime;
	}
	#btn{
		background-color: blue;
		padding:10px;
		font-family: monospace;
		font-weight: bolder;
		color: white;
		border: 2px solid yellow;
		border-radius: 15px;
	}
	option {
		background-color: orange;
		padding: 5px;
		font-family: cursive;
	}
</style>
</head>
<body>
	<form action="Calci.jsp">
		<h1>Calculator</h1>
		NUMBER 1 : <input type="text" name="num1">
		<br><br>
		NUMBER 2 : <input type="text" name="num2">
		<br><br>
		SELECT OPERATION : <select name="oper">
		 	<option  value="Addition">Addition</option>
		 	<option  value="Subtraction">Subtraction</option>
		 	<option  value="Multiplication">Multiplication</option>
		 	<option  value="Division">Division</option>
		</select>
		<br><br>
		<input type="submit" value="Calculate" id="btn"/>
	</form>	
</body>
</html>