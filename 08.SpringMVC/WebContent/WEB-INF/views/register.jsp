<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>
	<div class="container mt-10">
    	<h2 class="text-center">${headerName}</h2>
		<h5 class="text-center">${desc}</h5>
		<form action="registerForm" method="post">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Enter Mobile</label> 
				<input 
					type="text" 
					class="form-control"
					id="exampleInputEmail1" 
					aria-describedby="emailHelp"
					name="mobile">
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Enter Password</label>
				<input 
					type="password" 
					class="form-control"
					id="exampleInputPassword1"
					name="password">
			</div>
				<div class="mb-3">
				<label for="mPin" class="form-label">Enter mPin</label>
				<input 
					type="text" 
					class="form-control"
					id="mPin"
					name="mPin">
			</div>
			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Register</button>
			</div>
		</form>
	</div>












	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT" crossorigin="anonymous"></script>
    -->
</body>
</html>