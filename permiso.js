$(document).ready(function() {
	var u= window.location.href;
	u=u.slice(41);
	//declaro varialbles para imprimir;
	var nombre;
	var fecha;
	var desde;
	var hasta;
	//separo por datos de permiso;
	var array= u.split("&");
	nombre=array[0].split("=")[1];
	fecha=array[1].split("=")[1];
	desde=array[2].split("=")[1];
	hasta=array[3].split("=")[1];
	var dats = $("#idPermisoL")[0];
	dats.innerHTML += `<h2>`+ nombre+`</h2>`;
	
	dats.innerHTML += `<h2>`+ fecha+`</h2>`;
	dats.innerHTML += `<h2>`+ desde+`</h2>`;
	dats.innerHTML += `<h2>`+ hasta+`</h2>`;
			
});