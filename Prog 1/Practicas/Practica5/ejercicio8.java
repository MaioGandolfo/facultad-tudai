package Practica5;

public class ejercicio8 {
    final static int MAX=6;
    public static void main(String[] args) {
        /*
        Hacer un programa que determine si los valores almacenados en
        un arreglo de enteros se encuentran en orden ascendente.
         */

        int [] array={10, 20, 25, 32, 33, 39};

        if (ascendente(array))
            System.out.println("está en orden ascendente");
        else 
            System.out.println("no está en orden ascendente");


    }
    public static boolean ascendente(int [] arr){
        int i=0;
        while (i<MAX-1 && (arr[i]<= arr[i+1])){
            //controlo que no se me salga del arreglo y veo si la posicion de i es menor a la siguiente posicion con i + 1
            i++;
        }
        if (i==MAX-1)
            return true;
        else 
            return false;
    }
}
