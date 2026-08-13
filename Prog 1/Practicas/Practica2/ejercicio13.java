package Practica2;

public class ejercicio13 {
    public static void main(String[] args){

//Escribir un programa que mientras que el usuario ingrese un
//caracter letra minúscula, pida ingresar un número entero. Si el
//número ingresado está entre 1 y 5 inclusive deberá imprimir la
//tabla de multiplicar de dicho número.

    char letra=' ';
    int num=0, resultado=0, multiplicador=0;

    System.out.println("Igrese una letra minuscula.");
        letra=Utils.leerChar();

    while (letra < 'a' || letra > 'z'){
        System.out.println(letra + ", No es una letra valida, ingrese otra.");
            letra=Utils.leerChar();
    }
    while (letra >= 'a' && letra <= 'z'){
        System.out.println("Ingrese un numero entero");
            num=Utils.leerInt();
    
        if (num>=1 && num<=5){
            for (multiplicador=1; multiplicador<=10; multiplicador++){
                resultado= num*multiplicador;
                System.out.println(num + "*" + multiplicador + "=" + resultado);
            }
        } else {
            System.out.println("el numero que ingresaste fué: " + num);
        }
        System.out.println("Ingrese otra letra minuscula o un caracter diferente para salir.");
            letra=Utils.leerChar();
    }
}
}
