package Practica1;

public class practicaclase {
    public static void main(String[] args){

    final double PI = 3.14;
    int r;

    System.out.println("ingrese radio");
        r=Utils.leerInt();
    
    System.out.println("area:" + (PI * (r^2)));

    System.out.println("perimetro: " + (2*PI*r));
    }
}