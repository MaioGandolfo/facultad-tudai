package Practica5;

public class ejercicio19 {
    final static int MAX=10;
    public static void main(String[] args) {
        /*
        Hacer un programa que dado un arreglo de enteros de tamaño
        10 que se encuentra precargado, solicite al usuario un número
        entero y elimine todas las ocurrencia de número en el arreglo.
        Mientras exista (en cada iteración tiene que buscar la posición
        dentro del arreglo) tendrá que usar la posición para realizar un
        corrimiento a izquierda (quedarán tantas copias de la última
        posición del arreglo como cantidad de ocurrencias del número).
         */

        int [] array={1,10,3,4,5,6,10,8,9,10};

        System.out.println("ingrese un numero");
            int num=Utils.leerInt();

        /* 
        int cant=cantNum(array, num);

        int pos=saberPos(array, num);
        */
        

        //System.out.println(saberPos(array, num));
        //cIzq(array, num);

        eliminarNums(array, num);

        mostrarArreglo(array);

    }
    public static void eliminarNums(int [] arr, int num){
        int i=0;
        while (i<MAX){
        if (arr[i]==num){
            cIzq(arr, i);
        }
        else 
            i++;
        } 

    }
    public static void mostrarArreglo (int[] arr){
        for (int i=0; i<MAX; i++){
            System.out.print(arr[i] + "|");
        }
    }
    public static void cIzq (int [] arr, int pos){
            for (int i=pos; i<MAX-1; i++){
                arr[i]=arr[i+1];
            }
    }
    public static int cantNum(int [] arr, int num){
        int contador=0;
        for (int i=0; i<MAX; i++){
            if (arr[i]==num){
                contador++;
            }
        }
        return contador;
    }
    public static int saberPos(int [] arr, int num){
        int i=0;
        while (i<MAX && arr[i]!=num){
            i++;
        }
        if (i<MAX)
            return i;
        else 
            return -1;
    }
}
