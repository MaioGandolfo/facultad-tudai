package Practica6;

public class ejercicio2 {
    final static int MAXF=5, MAXC=10;
    public static void main(String[] args) {
        /*
         *  Hacer un programa que dada una matriz de enteros de tamaño
         *  5*10 que se encuentra precargada, obtenga la cantidad de
         *  números pares que tiene y la imprima.
         */

        int [] [] matriz={  
            {2,5,3,4,1,6,7,8,9,0},
            {2,6,33,55,21,56,43,99,1,4},
            {7,8,9,10,11,12,13,14,15,16},
            {20,18,17,16,15,14,13,12,11,10},
            {5,10,15,20,25,30,35,40,45,50}
        };

        int pene=0;

        for (int i=0; i<MAXF; i++){
            for (int j=0; j<MAXC; j++){
                if (matriz[i][j]%2==0)
                    pene++;
            }
        }

        System.out.println("la cantidad de numeros pares que hay en la matriz es: " + pene);
    }
    public static void proceso(int [][] matriz, int contador, int fila, int col){
        if (matriz[fila][col]%2==0)
            contador++;
    }
}
