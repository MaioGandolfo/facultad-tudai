package Practica6;

public class ejercicio7 {
    final static int MAXF=4, MAXC=5, MINV=0, MAXV=100;

    public static void main(String[] args) {
        /*
         *  Hacer un programa que dada una matriz de enteros ordenada
         *  creciente por filas de tamaño 4*5 que se encuentra precargada,
         *  solicite al usuario un número entero y una fila, y luego inserte el
         *  número en la matriz en la fila indicada manteniendo su orden.
         */

        int [] [] matriz={
            {  5,  25, 31, 40, 44 },
            { 50, 52, 63, 75, 80 },
            { 82, 90, 95, 97, 99 },
            { 100, 222, 280, 300, 400 }
        };

        int num=0, fila=-1;
        
        System.out.println("ingrese el numero: ");
        num=Utils.leerInt();

        while (fila < 0 ^ fila >= MAXF){
            System.out.println("ingrese la fila: ");
            fila=Utils.leerInt();
        }
        
        System.out.println("matriz original");
        mostrarMatriz(matriz);

        proceso(matriz, fila, num);

        System.out.println('\n' + "matriz con el numero agregado");
        mostrarMatriz(matriz);
    
        
    }
    public static void mostrarMatriz(int [][] m){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++){
                System.out.print(m[i][j] + "|");
            }
        }
    }
    public static void proceso(int [][] m, int fila, int num){
        int pos=buscarPos(m[fila], num);
        cDer(m[fila], pos);
        m[fila][pos]=num;
    }
    public static int buscarPos (int [] arr, int n){
        int i=0;
        while (i<MAXF && arr[i]<n)
            i++;
        return i;
    }
    public static void cDer(int [] m, int pos){
        for (int i=MAXC-1; i>pos; i--){
            m[i]=m[i-1];
        }
    }
}
