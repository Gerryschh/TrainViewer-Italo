<script src="handlerLogin.js"></script>

<form id="login-form" onsubmit="return handleSubmit()" action="LoginServlet" method="GET">
	<label for="email">Email:</label><br/>
	<input type="text" id="email" name="email" required><br/>
	<label for="password">Password:</label><br/>
	<input type="password" id="password" name="password" required><br/>
	
	<input type="submit" value="Accedi">
</form>

	<button>Registrati</button>
	
	
