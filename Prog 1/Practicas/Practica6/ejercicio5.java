package Practica6;

public class ejercicio5 {
    final static int MAXF=5, MAXC=10;
    public static void main(String[] args) {
        /*
         *  Hacer un programa que dada una matriz de enteros de tamaño
         *  5*10 que se encuentra precargada, solicite al usuario un número
         *  entero y elimine la primera ocurrencia de número en la matriz (un
         *  número igual) si existe. Para ello tendrá que buscar la posición y si
         *  está, realizar un corrimiento a izquierda y no continuar buscando.
         */

        int [][] matriz={  
            {2,5,3,4,1,6,7,8,9,0},
            {2,6,33,55,21,56,43,99,1,4},
            {7,8,9,10,11,222,13,14,15,16},
            {20,18,17,16,222,14,13,12,11,10},
            {5,10,15,20,25,30,35,40,45,50}
        };

        int num=0;

        System.out.println("ingrese un numero: ");
        num=Utils.leerInt();

        proceso(matriz, num);

        mostrarMatriz(matriz);
    }
    public static void proceso(int[][] m, int n){
        int f=0; boolean existe = false;
        while (f<MAXF && !existe){
            int c=0;
            while (c<MAXC && !existe){
                if (m[f][c] == n){
                    cIzq(m,f,c);
                    existe=true;
                }
                else
                    c++;
            }
            f++;
        }
    }
    public static void cIzq (int [][] m,int f, int c){
        for (int i=c; i<MAXC; i++){
            m[f][c]=m[f][c+1];
        }
    }
    public static void mostrarMatriz(int [][] m){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for(int j=0; j<MAXC; j++){
                System.out.print(m[i][j] + "|");
            }
        }
    }
}
