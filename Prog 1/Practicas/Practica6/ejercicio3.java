package Practica6;

public class ejercicio3 {
    final static int MAXF=5, MAXC=10;
    public static void main(String[] args) {
        /*
         *  Hacer un programa que dada una matriz de enteros de tamaño
         *  5*10 que se encuentra precargada, solicite al usuario una posición
         *  fila, columna y realice un corrimiento a izquierda.
         */

        int [] [] matriz={  
            {2,5,3,4,1,6,7,8,9,0},
            {2,6,33,55,21,56,43,99,1,4},
            {7,8,9,10,11,12,13,14,15,16},
            {20,18,17,16,15,14,13,12,11,10},
            {5,10,15,20,25,30,35,40,45,50}
        };

        int fila=-1, col=-1;

        while (fila < 0 ^ fila >= MAXF){
            System.out.println("ingrese una fila entre 0 y 4");
            fila=Utils.leerInt();
        }
        while (col < 0 ^ col >= MAXC){
            System.out.println("ingrese una posición entre 0 y 9");
            col=Utils.leerInt();
        }

        cIzq(matriz, fila, col);

        mostrarMatriz(matriz);
    }
    public static void mostrarMatriz(int [][] matriz){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++){
                System.out.print(matriz[i][j] + "|");
            }
        }
    }
    public static void cIzq(int[][] matriz, int fila, int col){
        for (int i=col; i<MAXC-1; i++){
            matriz[fila][i]=matriz[fila][i+1];
        }
    }
}
