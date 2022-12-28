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
<title>TrainGame</title>
</head>
<body id="b01" onkeydown="checkKeyDown(event);"
	onkeypress="checkKeyPress(event)">
	<jsp:include page="../menu.jsp"></jsp:include>
	<div class="container">
		<input type="button" onclick="play()" value="Play" class="btnPlay"></input>
		<input type="button" onclick="mostraMatriceHTML()"
			value="mostra matrice"></input> <input id="id01" type="button"
			onclick="om.muovi()" value="muovi oggetto"></input>
		<audio id="myAudio" src="audio1/videoplayback.mp3" loop></audio>
		<br>
		<br>
		<div id="pianoGioco"></div>
	</div>
	<br>
	<br>
	<p id="posizioneOmino"></p>
	<p id="messaggioDebug"></p>

	<script type="text/javascript" src="js/mappa.js"></script>
	<script type="text/javascript" src="js/movimento.js"></script>
</body>
</html>