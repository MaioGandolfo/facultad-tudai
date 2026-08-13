package Practica5;
public class ejercicio22 {
    final static int MAX=10;
    public static void main(String[] args) {
        /*
        Hacer un programa que elimine los valores pares en un arreglo
        de tamaño MAX=10.
         */

        int [] array={1,34,24,23,45,65,67,55,12,12,};

        int i=0;

        int pos=MAX-1;

        if (array[pos]%2==0){
            cDer(array, pos);
        }
        while (i<MAX){
            if (array[i]%2==0){
                cIzq(array, i);
            }
            else 
                i++;
        }

        mostrarArreglo(array);

    }
    public static void cDer(int []arr, int pos){
        for (int i=MAX-1; i>pos; i--){
            arr[i] = arr[i - 1];
        }
    }
    public static void mostrarArreglo (int [] array){
        for (int i=0; i<MAX; i++){
            System.out.print(array[i] + "|");
        }
    }
    public static void cIzq (int []array, int pos){
        for (int i=pos; i<MAX-1; i++){
            array[i]=array[i+1];
        }
    }

}
