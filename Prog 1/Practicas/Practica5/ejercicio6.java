package Practica5;

public class ejercicio6 {
    final static int MAX=10;
    public static void main(String[] args) {
        /*
        Hacer un programa que dado un arreglo de enteros de tamaño 10
        que se encuentra cargado, obtenga la cantidad de números pares
        que tiene y la imprima.
         */

        int [] arregloA= new int [MAX];

        int n=0;

        arreglo(arregloA, n);

        mostrarArreglo(arregloA);

        int contador=0;

        for (int i=0; i<MAX; i++){
            if (arregloA[i] %2==0){
                contador++;
            }
        }

        System.out.println('\n' + "la cantidad de numeros pares que hay en el arreglo es: " + contador);
    } 
    public static void arreglo(int [] arr, int a){
        for (int i=0; i<MAX; i++){
            System.out.println("ingrese un numero entero.");
                a=Utils.leerInt();
                arr[i]=a;
        }
    }
    public static void mostrarArreglo(int [] arr){
        System.out.println("así quedó el arreglo.");
        for (int i=0; i<MAX; i++){
            System.out.print(arr[i] + "|");
        }
    }
}
