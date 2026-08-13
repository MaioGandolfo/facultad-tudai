package Practica2;

public class ejercicio1D {
    public static void main (String[] args){
        char letra=' ';

        System.out.println("ingrese letra.");
            letra=Utils.leerChar();

        if (letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'){
            System.out.println("tu letra: " + letra + " es una vocal.");
        } else {
            System.out.println("no es una vocal.");
        }
    }
}
