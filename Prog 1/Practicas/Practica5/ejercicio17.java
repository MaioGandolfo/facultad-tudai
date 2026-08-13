package Practica5;

public class ejercicio17 {
    final static int MAX=10; 
    public static void main(String[] args) {
        /*
        Hacer un programa que dado un arreglo de enteros de tamaño
        10 que se encuentra cargado, solicite al usuario un número entero
        y lo agregue al principio del arreglo (posición 0). Para ello tendrá
        que realizar un corrimiento a derecha (se pierde el último valor del
        arreglo) y colocar el número en el arreglo en la posición indicada.
        */

        int [] array ={1,2,3,4,5,6,7,8,9,10};

        int pos=0;

        System.out.println("ingrese un numero");
            int num=Utils.leerInt();

        corrimientoDer(array, pos);

        agregarNum(array, num, pos);

        mostrarArreglo(array);
    }
    public static void corrimientoDer(int [] array, int pos){
        for (int i=MAX-1; i>pos; i--){
            array[i]= array [i - 1];
        }
    }
    public static void agregarNum(int [] array, int num , int pos){
        int i=0;
        while (i<=pos){
            array[i]=num;
            i++;
        }
    }
    public static void mostrarArreglo(int [] array){
        for (int i=0; i<MAX; i++){
            System.out.print(array[i] + "|");
        }
    }
}
