package Practica5;

public class ejercicio27 {
    final static int MAX=20, SEPA=0;
    public static void main(String[] args) {
        /*
        Hacer un programa que dado un número N ingresado por el
        usuario, elimine las secuencias de tamaño N de números distintos
        de cero.
         */

        int inicio=0, fin=-1, tamanio=0;
        int [] arr={0,0,20,34,45,77,0,0,55,10,4,0,12,13,7,0,0,87,18,0};

        mostrarArreglo(arr);

        System.out.print("ingrese un numero:");
            int num=Utils.leerInt();

        while (inicio<MAX){
            inicio=buscarIni(arr, fin+1);
            if (inicio<MAX){
                fin=buscarFin(arr, inicio);
                tamanio=fin-inicio+1;//veo el tamaño del la secuencia
                if (tamanio==num){// la comparo con el 
                    eliminarSec(arr, inicio, fin, tamanio);
                    fin=inicio;
                }
            }
        }
        mostrarArreglo(arr);
        /*actualizar el fin con la cantidad de cosas que borre
        ej: si tengo que borrar todos los elementos 3
        */
    }
    public static void eliminarSec (int [] arr, int ini, int fin, int tam){
        
        for (int i=ini; i<=fin; i++){
            cIzq(arr, ini);// que siempre borre desde ini
        }
    }
    public static void cIzq (int []array, int pos){
        for (int i=pos; i<MAX-1; i++){
            array[i]=array[i+1];
        }
    }
    public static int buscarFin (int [] arr, int ini){
        while (ini<MAX && arr[ini]!=SEPA)
            ini++;
        return ini-1;
    }
    public static int buscarIni (int[]arr, int ini){
        while (ini<MAX && arr[ini]==SEPA)
            ini++;
        return ini;
    }
    public static void mostrarArreglo(int [] arr){
        int i=0;
        while (i<MAX){
            System.out.print(arr[i] + "|");
            i++;
        }
        System.out.println(" ");
    }
}  
