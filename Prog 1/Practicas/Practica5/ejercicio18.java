package Practica5;

public class ejercicio18 {
    final static int MAX=10;
    public static void main(String[] args) {
        /*
        Hacer un programa que dado un arreglo de enteros de tamaño
        10 que se encuentra precargado, solicite al usuario un número
        entero y elimine la primera ocurrencia del número (un número
        igual) en el arreglo (si existe). Para ello tendrá que buscar la
        posición y si está, realizar un corrimiento a izquierda (queda una
        copia de la última posición del arreglo en la anteúltima posición).
         */

        int [] array={1,2,3,4,5,6,7,8,9,10};

        System.out.println("ingrese un numero");
            int num=Utils.leerInt();

        int pos=numeroEncontrado(array, num);

        corrimientoIzq(array, num, pos);

        mostrarArreglo(array);

        //System.out.println(pos);

        
    
    }
    public static void corrimientoIzq (int [] array, int num, int pos){
        if (pos!=-1){
            for (int i=pos; i<MAX-1; i++){
                array[i]=array[i+1];
            }
        }
        else 
            System.out.println("no se encontro el numero ingresado");

    }
    public static int numeroEncontrado(int [] array, int num){
        int pos=0;
        int i=0;
        while(i <MAX && array[i]!=num){
            i++;
        }
        if (i<MAX){
            pos +=i;
            return pos;
        }
        else 
            return -1;
    }
    public static void mostrarArreglo(int [] arr){
        for (int i=0; i<MAX; i++){
            System.out.print(arr[i] + "|");
        }
    }
}   
