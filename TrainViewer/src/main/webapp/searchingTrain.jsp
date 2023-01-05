<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

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
<script src="handlerLogin.js"></script>
<!-- CSS only -->
<link rel="stylesheet" href="css/style.css">
<title>TrainViewer</title>
</head>
<body class="bg-white">

	<%@include file="/menu.jsp"%>
<h1 class="py-4 text-center">Cerca i treni disponibili</h1>
	<section class="ms-container">
		<div class="row justify-content-around">

			<div class="card">
				<form id="login-form" onsubmit="return handleSubmit()"
					action="SearchTrainServlet" method="GET">
					<label for="train">Treno: </label>
					<select id="train" name="train">
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="fiat">Fiat</option>
  <option value="audi">Audi</option>
</select>
					<label for="departure">Partenza: </label> <input type="text"
						id="departure" name="departure" required> <label
						for="arrival">Destinazione: </label> <input
						type="text" id="arrival" name="arrival" required><br />
					<input class="btn-user" type="submit" value="Cerca">
				</form>
			</div>
		</div>
		<div class="container">
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">Codice treno</th>
						<th scope="col">Partenza</th>
						<th scope="col">Destinazione</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<%
						/*if (countries != null && countries.size() != 0) {
							Iterator<?> it = countries.iterator();
							while (it.hasNext()) {
								Country c = (Country) it.next();*/
						%>
						<td><%/*=c.getCountryName()*/%></td>
						<td><%/*=c.getAlpha2code()*/%></td>
					</tr>
					<%
					/*}

					} */
					%>

				</tbody>
			</table>

		</div>

		<jsp:include page="/fragments/footer.jsp"></jsp:include>
	</section>




</body>
</html>


