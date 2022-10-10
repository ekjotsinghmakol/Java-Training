<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>DPHONE CORPORATION</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
</head>
<body>
	<div class="container-fluid">
		<center>
			<h1>DPHONE CORP</h1>
		</center>
		<form action="display">
			<div class="form-group">
				<label for="examplename">Name</label> <input type="text"
					class="form-control" id="examplename" aria-describedby="emailHelp"
					placeholder="Enter name" name="name">
			</div>
			<div class="form-group">
				<label for="examplemobile">Mobile</label> <input type="text"
					class="form-control" id="examplemobile"
					aria-describedby="emailHelp" placeholder="Enter mobile no"
					name="mobile">
			</div>
			<div class="form-group">
				<label for="exampleage">Age</label> <input type="number"
					class="form-control" id="exampleage" aria-describedby="emailHelp"
					placeholder="Enter Age" name="age">
			</div>
			<div class="form-group">
				<label for="exampleref">Referral Code</label> <input type="text"
					class="form-control" id="exampleref" aria-describedby="emailHelp"
					placeholder="Enter Referral Code" name="referralCode">
			</div>

			<div class="form-group form-check">
				<input type="checkbox" class="form-check-input" id="exampleCheck1">
			</div>
			<button type="submit" class="btn btn-dark">Register</button>
		</form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
		crossorigin="anonymous"></script>
</body>
</html>