package Practica2;

public class ejercicio6 {
    public static void main (String[] args){

        //Escribir un programa que mientras el usuario ingrese un número
        //entero menor que 100 y mayor a 1, muestre por pantalla si el
        //número es múltiplo de 2 y múltiplo de 3 simultáneamente. (¿Los
        //valores mencionados en el enunciado deberían ser constantes?.
        //De a poco habría que definirlos como constantes).

        final int mas1=1, menos100=100;
        boolean multi2y3=false;
        int num=0;

        System.out.println("ingrese numero.");
            num=Utils.leerInt();

        while (num<=mas1 || num>=menos100){
            System.out.println("ingrese un numero entero que sea mayor que 1 y menor que 100");
            num=Utils.leerInt();
        }

        if (num>mas1 && num<menos100){
            multi2y3=(num%2==0 && num %3==0);
            System.out.println( "el numero: " + num + ", es multiplo de 2 y 3?: " + multi2y3);
        }
    }
}
