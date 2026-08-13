package Practica3;

public class ejercicio15 {
    public static void main(String[] args) {
        /*Escribir un programa que mientras que el usuario ingrese un
        número entero natural, llame a un método que calcule la
        sumatoria desde 1 a dicho número (Ej: si n= 5 sumatoria =
        1+2+3+4+5=15) y retorne el resultado.
         */

        int num=0, sumatoria=0;

        while (num <=0){
            System.out.println("ingrese un numero natural");
                num=Utils.leerInt();
        }
        sumatoria=Suma(num);

        System.out.println("la suma de los numeros hasta " + num + " es : " + sumatoria);
    }
    public static int Suma (int num){
        int suma=0;
        for (int i=1; i<=num; i++){
        suma+= + i; 
        } 
        return suma;
    }
}
