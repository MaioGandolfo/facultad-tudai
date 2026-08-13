package Practica5;

public class ejercicio12 {
    final static int MAXA=3;
    final static int MAXB=2;
    public static void main(String[] args) {
        /*
        Dado dos arreglos de números enteros: un arreglo A de tamaño
        MAXA y un arreglo B de tamaño MAXB con números entre 0 y
        MAXA-1, determinar la suma de los elementos del arreglo A cuyas
        posiciones son indicadas por el arreglo B. Por ejemplo, dado
        A={3,6,31,9}, MAXA=3 y B={0,2} con MAXB=2 el sistema deberá
        informar: 34 (lo cual es el resultado de sumar el 3 de la posición 0
        y el 31 de la posición 2 del arreglo A).
        */

        int [] A={3,6,31,9};

        int [] B={0,2};

        suma(A, B);

    
    }
    public static void suma(int [] A, int [] B){
        int sumador=0;
        for (int i=0; i<MAXB; i++){
            sumador += A[B[i]];
        }
        System.out.println(sumador);
    }

    
}
