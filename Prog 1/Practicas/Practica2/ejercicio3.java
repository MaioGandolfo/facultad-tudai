package Practica2;

public class ejercicio3 {
    public static void main(String[] args) {
        int num=0;

        System.out.println("Ingrese un numero.");
            num=Utils.leerInt();

        if (num>50){
            if (num%2==0||num%3==0) {
                System.out.println("su numero es: " + num);
            } else {
                System.out.println("su numero es mayor de 50, pero no es multiplo de 2 o 3.");
            } 
        } else {
            System.out.println("puto el que lee");
        }
    }
}
