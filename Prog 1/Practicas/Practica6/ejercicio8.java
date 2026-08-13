package Practica6;

public class ejercicio8 {
    final static int MAXF=4, MAXC=5;
    public static void main(String[] args) {
        /*  
         *  Hacer un programa que dada una matriz de enteros ordenada
         *  creciente por filas de tamaño 4*5 que se encuentra precargada,
         *  solicite al usuario un número entero y una fila, y elimine la primera
         *  ocurrencia de número en la fila indicada (un número igual) si
         *  existe.
        */
        
        int [] [] matriz={
            {  5,  25, 31, 40, 44 },
            { 50, 52, 63, 75, 80 },
            { 82, 90, 95, 97, 99 },
            { 100, 222, 280, 300, 400 }
        };

        int num=0, fila=-1;
        
        System.out.println("ingrese un numero: ");
        num=Utils.leerInt();

        while(fila <0 ^ fila >=MAXF){
            System.out.println("ingrese la fila: ");
            fila=Utils.leerInt();
        }

        int pos=buscarPos(matriz[fila], num);

        if (pos<MAXC){
            cIzq(matriz[fila], pos);

            mostrarMatriz(matriz);
        }
        else 
            System.out.println("el numero ingresado no existe en la fila " + fila );
    }
    public static int buscarPos (int [] arr, int n){
        int i=0;
        while (i<MAXC && arr[i]!=n)
            i++;
        return i;
    }
    public static void cIzq (int [] arr, int pos){
        for (int i=pos; i<MAXC-1; i++){
            arr[i]=arr[i+1];
        }
    } 
    public static void mostrarMatriz(int [][]m){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++){
                System.out.print(m[i][j] + "|");
            }
        }
    }
}
