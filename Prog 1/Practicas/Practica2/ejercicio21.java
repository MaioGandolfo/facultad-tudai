package Practica2;

public class ejercicio21 {
    public static void main(String[] args) {
        /*Pedir por consola un número entero e informar si es un número
        primo. Un número es primo si solo es divisible por 1 y por sí
        mismo. */

        int n=0;

        n=Valido(n);

        int calculo=0;

        calculo = n/n;

        if (calculo==0){
            System.out.println("el numero " + n + " es primo.");
        } else {
            System.out.println("el numero " + n + " no es primo.");
        }



    }
    public static int Valido(int n){
        while (n <=0){
            System.out.println("ingrese un numero natural");
                n=Utils.leerInt();
        } return n;
    }
}
