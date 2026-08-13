package Practica2;

public class ejercicio7 {
    public static void main (String[] args){

        //Escribir un programa que mientras el usuario ingrese un caracter
        //distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o
        //si es carácter vocal minúscula.

        final char digito = '*';
        char algo= ' ';

        System.out.println("Ingrese algo");
            algo=Utils.leerChar();

        if ((algo>='!' && algo<='/') && algo != digito){
            System.out.println(algo + ", es un digito");
        }
        else if (algo>='a' && algo<='z') {
            if (algo=='a'||algo=='e'||algo=='i'||algo=='o'||algo=='u') {
                System.out.println(algo + ", es una vocal minuscula");
            }
            else {
                System.out.println(algo + ", es una consonante");
            }
        } 
        else if (algo>='A' && algo<='Z'){
            if (algo=='A'||algo=='E'||algo=='I'||algo=='O'||algo=='U') {
                System.out.println(algo + ", es una vocal mayuscula.");
            }
            else {
                System.out.println(algo + ", es una consonante");
            } 
        } 
        else {
            System.out.println(algo + ", es un digito");
        }
    }
}
