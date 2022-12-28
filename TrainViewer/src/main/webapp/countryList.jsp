<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.*,com.beans.*,com.strategy.*"%>

<%

Strategy db = new StrategyDB();
Collection<?> countries = (Collection<?>) db.getAllCountries();

%>

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
<title>TrainViewer</title>
</head>
<body class="bg-dark">

	<jsp:include page="menu.jsp"></jsp:include>

	<!-- Table of countries -->

	<div class="container">

		<h1 class="py-4 text-center text-white bg-dark">Country Table</h1>

		<table class="table table-dark table-striped">
			<thead>
				<tr>
					<th scope="col">Country</th>
					<th scope="col">Alpha Code</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<% 
			if(countries != null && countries.size() != 0) {
				Iterator<?> it = countries.iterator();
				while(it.hasNext()) {
					Country c = (Country) it.next();
		%>
					<td><%=c.getCountryName()%></td>
					<td><%=c.getAlpha2code()%></td>
				</tr>
				<%
			}
	
		}
		%>

			</tbody>
		</table>



	</div>
</body>
</html>