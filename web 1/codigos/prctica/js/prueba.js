"use strict";
let saludo = "Hola ";

let contadorClick = 0;

prender();

function saludar(){
    /*
    let nombre = prompt("ingrese su nombre");
    alert(saludo + nombre);
    console.log("saludo por boton");
    console.log(saludo + nombre);
    */
    let nodoInput = document.getElementById("txtInput");
    let nombre = nodoInput.value;

    console.log(nombre);

    let nodoSaludo = document.getElementById("txtSaludo");
    let nodoParrafo = document.getElementById("nombre");
    console.log("agarro el parrafo que quiero editar " + nodoSaludo.innerHTML);
    
    nodoParrafo.innerHTML = nombre + " putito";
    nodoSaludo.innerHTML = saludo + nombre;
    console.log("listop");
}


function editarParrafo(){
    let elem = document.getElementById("parr");
    let nuevo = prompt("lo que quieras");
    elem.innerHTML = nuevo;
}

function contarClicks(){
    contadorClick++;
    document.querySelector("#contador").innerHTML = contadorClick;
}


document.querySelector("#btn-apagar").addEventListener("click", apagar);
document.querySelector("#btn-prender").addEventListener("click", prender)

function apagar(){
    document.querySelector("#img-lampara").src = "img/lampara-apagada.png";
    document.querySelector("body").classList.add("apagado");
    document.querySelector("body").classList.remove("prendido");
}

function prender(){
    document.querySelector("#img-lampara"). src = "img/lampara-prendida.png";
    document.querySelector("body").classList.add("prendido");
    document.querySelector("body").classList.remove("apagado");
}





/*
function actualizarSaludo(){
    let nodoInput = document.getElementById("txtInput");
    let nombre = nodoInput.value;

    console.log(nombre);

    let nodoSaludo = document.getElementById("txtSaludo");
    console.log("agarro el parrafo que quiero editar" + nodoSaludo.innerHTML);
    
    nodoSaludo.innerHTML = saludo + nombre;
    console.log("listop");
}
    */

