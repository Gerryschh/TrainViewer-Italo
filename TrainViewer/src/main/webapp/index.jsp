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

<!-- SCRIPT -->
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD" crossorigin="anonymous"></script>
	
<!-- CSS only -->
<link rel="stylesheet" href="css/style.css">

<title>TrainViewer</title>
</head>
<body class="bg-white">

	<jsp:include page="menu.jsp"></jsp:include>
	
	<section class="ms-carousel">
		<div id="carouselExampleAutoplaying" class="carousel slide" id="carousel" data-bs-ride="carousel">
		  <div class="carousel-indicators">
		    <button type="button" data-bs-target="#carouselExampleAutoplaying" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
		    <button type="button" data-bs-target="#carouselExampleAutoplaying" data-bs-slide-to="1" aria-label="Slide 2"></button>
		    <button type="button" data-bs-target="#carouselExampleAutoplaying" data-bs-slide-to="2" aria-label="Slide 3"></button>
		  </div>
		  <div class="carousel-inner">
		    <div class="carousel-item active">
		      <img src="img/hero_desktop_promowe_ventitre_29_12_1366x400.jpg" class="d-block w-100" alt="...">
		    </div>
		    <div class="carousel-item">
		      <img src="img/hero_mobile_offerta_extra_magic_834x550.jpg" class="d-block w-100" alt="...">
		    </div>
		    <div class="carousel-item">
		      <img src="img/hero_mobile_nuove_connessioni_toscana_834x550.jpg" class="d-block w-100" alt="...">
		    </div>
		  </div>
		  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleAutoplaying" data-bs-slide="prev">
		    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
		    <span class="visually-hidden">Previous</span>
		  </button>
		  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleAutoplaying" data-bs-slide="next">
		    <span class="carousel-control-next-icon" aria-hidden="true"></span>
		    <span class="visually-hidden">Next</span>
		  </button>
		</div>
	</section>
	
	<section class="ms-discount">
	
	<div class="ms-card-container row justify-content-between">
        <div class="ms-card col">
            <div class="face face1">
                <div class="content">
                    <img src="img/train-solid.png">
                    <h3>Italo Più</h3>
                </div>
            </div>
            <div class="face face2">
                <div class="content">
                    <p>Iscriviti a Italo Più e scopri le Gift Card, -10% di sconto per te</p>
                        <a href="#">Read More</a>
                </div>
            </div>
        </div>
        <div class="ms-card col">
            <div class="face face1">
                <div class="content">
                    <img src="img/earth-europe-solid.png">
                    <h3>Nuovi Collegamenti</h3>
                </div>
            </div>
            <div class="face face2">
                <div class="content">
                    <p>Da Milano a Firenze con Treno Italo Alta Velocità a partire da 12,90&#8364; + treno regionale di Trenitalia da Firenze a Siena a 9,80&#8364;</p>
                        <a href="#">Read More</a>
                </div>
            </div>
        </div>
        <div class="ms-card col">
            <div class="face face1">
                <div class="content">
                    <img src="img/briefcase-solid.png">
                    <h3>Italo Business Pass</h3>
                </div>
            </div>
            <div class="face face2">
                <div class="content">
                    <p>Fino al -40% per la tua impresa : 1.000 &#8364; di biglietti Italo al costo di soli 600 &#8364;, per viaggiare dove vuoi.</p>
                        <a href="#">Read More</a>
                </div>
            </div>
        </div>
    </div>
	
	
	</section>
	

</body>
</html>