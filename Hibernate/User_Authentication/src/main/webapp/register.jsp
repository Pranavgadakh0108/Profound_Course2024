<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
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
body {
	background-color: black;
}

#mycard {
	background-image: linear-gradient(to bottom right, #f9d423, #e14fad);
	margin-top: 10%;
	margin-left: 25%;
	box-shadow: lightgreen 0px 0px 0px 4px;
}
</style>
</head>
<body>

	<div class="container-fluid">

		<div class="card w-50" id="mycard">
			<div class="card-body">
				<h1 class="card-title">User Registration</h1>
				<form action="RegisterServlet" method="post">
					<div class="mb-3">
						<label for="exampleInputEmail2" class="form-label">Name</label>
						<input type="text" class="form-control" id="exampleInputEmail2"
							aria-describedby="emailHelp" name="name" required>
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Username</label>
						<input type="text" class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp" name="username" required>
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail3" class="form-label">Email</label> <input
							type="email" class="form-control" id="exampleInputEmail3"
							aria-describedby="emailHelp" name="email" required>
					</div>
					<div class="mb-3">
						<label for="exampleInputPassword1" class="form-label">Password</label>
						<input type="password" class="form-control"
							id="exampleInputPassword1" name="password" required>
					</div>
					<div class="d-grid gap-2 col-6 mx-auto">
						<button type="submit" class="btn btn-success" onclick="alert('User Registered!!!')">Register</button>

					</div>
				</form>
			</div>
		</div>

	</div>
</body>
</html>