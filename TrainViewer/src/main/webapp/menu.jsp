<nav class="navbar navbar-expand-lg">
	<div class="container-fluid">

		<a class="navbar-brand" href="/TrainViewer/"><span>TrainViewer</span></a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavDropdown">
			<ul class="navbar-nav">
				<%
				String email = (String) session.getAttribute("email");
				System.out.println(email);
				if (email == null) {
				%>
				<li class="nav-item"><a class="nav-link" aria-current="page"
					href="/TrainViewer/login.jsp"><span>Accedi</span></a></li>
				<li class="nav-item"><a class="nav-link" aria-current="page"
					href="/TrainViewer/register.jsp"><span>Registrati</span></a></li>
				<%
				} else {
				%>

				<li class="nav-item"><a class="nav-link" aria-current="page"
					href="/TrainViewer/countryList.jsp"><span>CountryList</span></a></li>
				<li class="nav-item"><a class="nav-link" aria-current="page"
					href="/TrainViewer/admin.jsp"><span>ApproveAliases Admin</span></a>
				</li>
				<li class="nav-item"><a class="nav-link" aria-current="page"
					href="/TrainViewer/insert.jsp"><span>InsertTrain Admin</span></a></li>
				<li class="nav-item"><a class="nav-link" aria-current="page"
					href="/TrainViewer/trainGame/trainGame.jsp"><span>TrainGame</span></a>
				</li>
				<%
				}
				%>
			</ul>
		</div>

	</div>
</nav>
