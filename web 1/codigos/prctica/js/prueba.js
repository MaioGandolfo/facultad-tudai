"use strict";
let saludo = "Hola ";

let valor_nombre = "mariano";
let valor_apellido = "gandolfo";

let contadorClick = 0;

//alert();

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

let boton = document.getElementById("btn1");

boton.addEventListener("click", saludar2);

function saludar2(){
    alert(valor_nombre + " " +valor_apellido)
}



let formulario = document.getElementById("formulario")

formulario.addEventListener("submit", saludar3)

function saludar3(e){
    e.preventDefault();

    let formData = new FormData(formulario)
    let nombre = formData.get("nombre");
    let apellido = formData.get("apellido")

    let nodoTitulo = document.getElementById("titulo")

    nodoTitulo.innerHTML = nombre + " " + apellido;
}

let btnOcultar = document.getElementById("btn-ocultar")

btnOcultar.addEventListener("click", ocultar)

function ocultar(){
    let caja = document.querySelector(".info")
    console.log("hola")
    caja.classList.toggle("oculto");
}


let calculadora = document.getElementById("calculadora")
let resultado = document.getElementById("resultado")

calculadora.addEventListener("submit", calcular)

function calcular(e){
    e.preventDefault();

    let formData = new FormData(calculadora)
    let n1 = parseInt(formData.get("num1"))
    let n2 = parseInt(formData.get("num2"))
    let operacion = formData.get("operacion")

    let total =0;

    switch (operacion){
        case "+":
            total= n1 + n2;
            break;
        case "-":
            total = n1-n2;
            break;
        case "/":
            if(n2 == 0){
                resultado.innerHTML = "no se puede dividir por 0";
                return;
            }
            total = n1 / n2;
            break;
        case "*":
            total = n1 *n2;
            break;
    }
    console.log(total);
    resultado.innerHTML = total;
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

