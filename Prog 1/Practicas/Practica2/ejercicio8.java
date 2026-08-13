package Practica2;

public class ejercicio8 {
    public static void main(String[] args) {
        final int distinto=0;
    int num1=0, num2=0;

    System.out.println("Ingrese un numero");
        num1=Utils.leerInt();
    
    while (num1 == distinto && num2 == distinto){
        System.out.println("Ingrese un 2do numero");
        num2=Utils.leerInt();   
        }

    if (num1 != distinto){
        System.out.println("el numero es: " + num1);
    } else {
        System.out.println("el numero es: " + num2);
    }
    }
}