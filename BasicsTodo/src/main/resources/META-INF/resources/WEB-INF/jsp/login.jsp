<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Login Page</title>
	</head>
	<body>
	
		<div class="container">
			<h1>Login</h1>
			<pre>${errorMsg}</pre>
			<form method="post">
				Name: <input type="text" name="name">
				Password: <input type="password" name="pass">
				<input type="submit">
			</form>
		</div>
		 
	</body>
</html>