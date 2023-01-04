<nav class="navbar navbar-expand-lg bg-body-tertiary mb-4">
	<div class="container-fluid">
		<a class="navbar-brand" href="/TrainViewer"><span>TrainViewer</span></a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavDropdown">
			<%
			String username = (String) session.getAttribute("username");
			
			if(username != null){
			%>
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" aria-current="page"
					href="countryList.jsp"><span>CountryList</span></a></li>
				<li class="nav-item"><a class="nav-link" aria-current="page"
					href="admin.jsp"><span>ApproveAliases Admin</span></a>
				</li>
				<li class="nav-item"><a class="nav-link" aria-current="page"
					href="insert.jsp"><span>InsertTrain Admin</span></a></li>
				<li class="nav-item"><a class="nav-link" aria-current="page"
					href="/trainGame/trainGame.jsp"><span>TrainGame</span></a>
				</li>
			</ul>
			<ul class="navbar-nav flex-row flex-wrap ms-md-auto">
				
					<li class="nav-item nav-link"><span>Benvenuto, <%= username %></span></li>
					<li class="nav-item nav-link"><div class="vr d-none d-lg-flex h-100 mx-lg-2 text-white"></div><hr class="d-lg-none my-2 text-black-50"></li>
					<li class="nav-item">
						<form id="logout-form" action="LogoutServlet" method="POST">
						<input type="submit" value="Logout"></form></li>
				<%
				} else {
				%>
				
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" aria-current="page"
					href="login.jsp"><span>CountryList</span></a></li>
				<li class="nav-item"><a class="nav-link" aria-current="page"
					href="login.jsp"><span>ApproveAliases Admin</span></a>
				</li>
				<li class="nav-item"><a class="nav-link" aria-current="page"
					href="login.jsp"><span>InsertTrain Admin</span></a></li>
				<li class="nav-item"><a class="nav-link" aria-current="page"
					href="login.jsp"><span>TrainGame</span></a>
				</li>
			</ul>
			<ul class="navbar-nav flex-row flex-wrap ms-md-auto">
			
				<li class="nav-item"><a class="nav-link" aria-current="page"
					href="login.jsp"><span>Accedi/Registrati</span></a>
				</li>
			</ul>
				<%
				}
				%>
			</ul>
		</div>
	</div>
</nav>
