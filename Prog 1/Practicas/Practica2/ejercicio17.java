package Practica2;

public class ejercicio17 {
    public static void main (String[] args){
        //Escribir un programa que dado un valor ingresado por el
        //usuario menor que 10 y mayor a 1, muestre por pantalla una
        //cuenta regresiva de números desde dicho valor hasta el 0
        //inclusive.

        int num=0, resultado=0;

        System.out.println("Ingrese un numero menor que 10 y mayor que 1.");
            num=Utils.leerInt();
        
        while (num <=1 || num >=10){
            System.out.println("Ingresaste un numero no valido para la consigna, por favor ingrese un numero menor que 10 y mayor que 1.");
                num=Utils.leerInt();
        }

        for (int i=num; i>=0; i--){
            resultado=i;
            System.out.println("la cuenta regresiva es: " + resultado);
        }
    }
}
