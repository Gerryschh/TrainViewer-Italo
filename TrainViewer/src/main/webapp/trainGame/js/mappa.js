// posizione iniziale dell'omino
var ominoX = 0;
var ominoY = 0;

// valore iniziale dell'energia
var energia = 0;

// costanti e parametri per la configurazioen del gioco
var PILLOLA = -10;
var NEMICO = -15
var SFONDO = 0;
var MURO = -20;

var omino = "testa";
var testa = 1;
var direzione = "E";

var pathImg = "img1/";

// dichiarazione variabili di lavoro
var i = 0;
var j = 0;
var countPillole = 0;

// numero di righe e numero di colonne
var R = 10;
var C = 20;

// definizione id matrice, come array di array
var piano = new Array();


function mostraMatriceHTML() {
	var s = '<table border="1" width="50%" heigth="50%">';

	for (var i = 0; i < R; i++) {
		s = s + "<tr>";
		for (var j = 0; j < C; j++) {
			s = s + '<td width="5%" align="center">' + piano[i][j] + '</td>';
		}
		s = s + "</tr>";
	}
	s = s + "</table>";
	document.getElementById("messaggioDebug").innerHTML = s;
}


function play() {
	var audio = document.getElementById("myAudio");
	audio.play();
	const pianoDiGioco = document.getElementById("pianoGioco");
	pianoDiGioco.innerHTML = "";
	for (var i = 0; i < R; i++) {
		piano[i] = new Array(); // ogni riga contiene un array: si ha così una matrice
		for (var j = 0; j < C; j++) {
			piano[i][j] = SFONDO; // si assegna un valore di default a tutte le celle
			console.log(piano[i][j]);
		}
	}
	ominoX = 0;
	ominoY = 0;
	testa = 1;
	piano[0][2] = PILLOLA;
	piano[0][4] = PILLOLA;
	piano[0][6] = PILLOLA;
	piano[0][0] = 1;
	piano[8][8] = MURO;
	disegnaPiano();
}

function disegnaPiano() {
	for (var i = 0; i < R; i++) {
		for (var j = 0; j < C; j++) {
			disegnaCella(i, j);
		}
		const pianoDiGioco = document.getElementById("pianoGioco");
		const br = document.createElement("br");
		pianoDiGioco.append(br);
	}
	// disegna l'omino in una data posizione
	 disegnaCellaSpeciale(ominoX, ominoY, omino);
}

function generaOggetto(valOggetto) {
	// si genera un indice di riga casuale tra 0 e R
	var r = Math.random();
	rx = Math.floor(r * R);
	// si genera un indice di colonna casuale tra 0 e C
	var c = Math.random();
	ry = Math.floor(c * C);
	// utilizzando rx e rc si ha una posizione casuale nel piano di gioco
	if (piano[rx][ry] == SFONDO) {
		piano[rx][ry] = valOggetto; //posiziona oggetto nella matrice
	}
	else {
		//alert("generazione sopra il serpente!");
		generaOggetto(valOggetto);
	}
	// in rx, ry c'è un nuovo valore quindi meglio ridisegnare la cella
	disegnaCella(rx, ry);
}

function disegnaCella(i, j) {
	var id = "c" + i + "_" + j;
	var src = "";
	if (piano[i][j] > 0) {
		src = pathImg + 1 + ".jpg";
	} else if (piano[i][j] == PILLOLA) {
		src = pathImg + "biglietto" + ".jpg";
	} else if (piano[i][j] == -20) {
		src = pathImg + 3 + ".jpg";
	}
	else if(piano[i][j] ==NEMICO){
		src = pathImg + 2 + ".jpg";
	}
	else {
		src = pathImg + 0 + ".jpg";
	}
	const pianoDiGioco = document.getElementById("pianoGioco");
	if (document.getElementById(id)==null) {
		let cella = document.createElement("img");
		cella.src = src;
		cella.id = id;
		pianoDiGioco.append(cella);
	} else {
		let cellaMod = document.getElementById(id);
		cellaMod.src = src;
	}

}

function disegnaCellaSpeciale(i, j, valore) {
	const id = "c" + i + "_" + j;
	const src = pathImg + valore + direzione + ".jpg";
	console.log(id + " " + src);
	document.getElementById(id).src = src;
} 