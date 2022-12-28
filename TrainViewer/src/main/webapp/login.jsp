<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.*,com.beans.*,com.strategy.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<!-- CSS only -->
<link rel="stylesheet" href="css/styles.css">
<title>Login</title>
</head>
<body class="bg-dark">
	<script src="handlerLogin.js"></script>
	<jsp:include page="menu.jsp"></jsp:include>
	
	<form id="login-form" onsubmit="return handleSubmit()">
		<label for="email">Email:</label><br/>
		<input type="text" id="email" name="email" required><br/>
		<label for="password">Password:</label><br/>
		<input type="password" id="password" name="password" required><br/>
		<input type="submit" value="Accedi">
		<!-- <input type="submit" value="Registrati">  -->
		
	</form>
	
	
	
	
</body>
</html>