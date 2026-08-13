package Practica6;

public class ejercicio9 {
    final static int MAXF=4, MAXC=5;
    public static void main(String[] args) {
        /*
         *  Hacer un programa que dada una matriz de enteros de tamaño
         *  4*5 que se encuentra precargada, solicite al usuario el ingreso de
         *  una fila y dos números enteros (columnas de la matriz), y ordene
         *  de forma creciente la matriz en la fila indicada entre las dos
         *  posiciones columnas ingresadas.
         */

        int [] [] matriz={
            {1,9,5,3,4},
            {4,2,3,5,10},
            {17,22,11,23,24},
            {30,22,18,2,31}
        };

        int num1=-1, num2=-1, fila=-1;

        while (fila <0 ^ fila >=MAXF){
            System.out.println("ingrese la fila");
            fila=Utils.leerInt();
        }

        while (num1 <0 ^ num1>=MAXC){
            System.out.println("ingrese la posición de inicio: ");
            num1=Utils.leerInt();
        }

        while ((num2<0 ^ num2 >=MAXC) && (num2 != num1)  ){
            System.out.println("ingrese la posición de fin: ");
            num2=Utils.leerInt();
        }

        orden(matriz[fila], num1, num2);

        mostrarMatriz(matriz);

    }
    public static void orden(int [] arr, int ini, int fin){
        int temp;
        for(int i = 1 ;i < MAXC; i++){
            for (int j = ini ; j <= fin; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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

