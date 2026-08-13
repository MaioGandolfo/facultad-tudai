package Practica6;

public class ejercicio4 {
    final static int MAXF=5, MAXC=10;
    public static void main(String[] args) {
        /*
         *  Hacer un programa que dada una matriz de enteros de tamaño
         *  5*10 que se encuentra precargada, solicite al usuario un número
         *  entero y una posición fila, columna. Con estos datos tendrá que
         *  realizar un corrimiento a derecha (se pierde el último valor en
         *  dicha fila) y colocar el número en la matriz en la posición fila,
         *  columna indicada.
         */

        int [] [] matriz={  
            {2,5,3,4,1,6,7,8,9,0},
            {2,6,33,55,21,56,43,99,1,4},
            {7,8,9,10,11,12,13,14,15,16},
            {20,18,17,16,15,14,13,12,11,10},
            {5,10,15,20,25,30,35,40,45,50}
        };

        int fila=-1, col=-1, num=0;

        while (fila < 0 ^ fila >=MAXF){
            System.out.print("ingrese una fila entre 0 y 4: ");
            fila=Utils.leerInt();
        }
        while (col < 0 ^ col >=MAXC ){
            System.out.print("ingrese una posicion entre 0 y 9: ");
            col=Utils.leerInt();
        }

        System.out.print("ingrese un numero: ");
        num=Utils.leerInt();

        cDer(matriz, fila, col);

        matriz[fila][col]=num;

        mostrarMatriz(matriz);
    }
    public static void mostrarMatriz(int [][] matriz){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++){
                System.out.print(matriz [i][j] + "|");
            }
        }
    }
    public static void cDer(int [][] matriz, int fila, int col){
        for (int i=MAXC-1; i>col; i--){
            matriz[fila] [i]= matriz [fila] [i-1];
        }
    }
}
