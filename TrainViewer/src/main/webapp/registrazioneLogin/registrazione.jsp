<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- CSS only -->
<link rel="stylesheet" href="css/styles.css">

<!-- Bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<body>
	<script src="handlerRegistrazione.js"></script>
	<jsp:include page="../menu.jsp"></jsp:include>
	<form id="registration-form" onsubmit="return handleSubmit()">
		<label for="name">NomeUtente:</label><br> <input type="text"
			id="name" name="name" required><br> <label for="email"
			required>Indirizzo email:</label><br> <input type="email"
			id="email" name="email"><br> <label for="password">Password:</label><br>
		<input type="password" id="password" name="password" required><br>
		<br> <input type="submit" value="Registrati">
	</form>
</body>
</html>