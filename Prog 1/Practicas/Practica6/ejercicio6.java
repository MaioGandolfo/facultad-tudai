package Practica6;

public class ejercicio6 {
    final static int MAXF=5, MAXC=10;
    public static void main(String[] args) {
        /*
         *  Hacer un programa que dada una matriz de enteros de tamaño
         *  5*10 que se encuentra precargada, solicite al usuario un número
         *  entero y elimine todas las ocurrencia de número en la matriz si
         *  existe. Mientras exista (en cada iteración tiene que buscar la
         *  posición fila y columna) tendrá que usar dicha posición para
         *  realizar un corrimiento a izquierda (quedarán tantas copias de la
         *  última posición de cada fila como cantidad de ocurrencias del
         *  número). Tener en cuenta, como se hizo en arreglos, si el
         *  elemento a eliminar es el último de alguna fila de la matriz.
         */

        int [][] matriz={  
            {2,5,3,4,1,6,7,8,9,50},
            {2,6,33,55,21,56,43,99,1,50},
            {7,8,9,10,11,222,50,14,15,56},
            {20,18,17,16,222,14,13,12,11,50},
            {5,10,15,20,25,30,35,40,45,50}
        };
        
        int num=0;

        System.out.println("ingrese un numero: ");
        num=Utils.leerInt();

        proceso(matriz, num);

        mostrarMatriz(matriz);

    }
    public static void cIzq(int [][] m, int f, int c){
        for (int i=c; i<MAXC-1; i++){
                m[f][i]=m[f][i+1];
        }
    }
    public static void proceso (int [][] m, int n){
        for (int i=0; i<MAXF; i++){
            for (int j=0; j<MAXC; j++){
                if (n==m[i][MAXC-1])
                    m[i][MAXC-1]=m[i][0];
                else if (m[i][j]==n)
                    cIzq(m, i, j);
            }
        }
    }
    public static void mostrarMatriz (int [][] m){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++){
                System.out.print(m[i][j] + "|");
            }
        }
    }
}
