package Practica6;

public class ejercicio11 {
    final static int MAXF=4, MAXC=20, SEPA=0;
    public static void main(String[] args) {
        /*
         *  Hacer un programa que dada la matriz de secuencias de
         *  enteros definida y precargada permita encontrar por cada fila la
         *  posición de inicio y fin de la secuencia cuya suma de valores sea
         *  mayor
         */

        int[][] matriz = {
            {0,0,2,3,4,0,0,5,6,0,7,8,9,0,0,1,2,3,0,0},
            {0,1,2,0,3,4,5,0,0,6,7,8,0,0,9,0,0,2,2,0},
            {0,0,5,0,6,7,8,0,0,55,55,1,0,2,3,4,0,0,0,0},
            {0,0,0,9,8,0,7,6,0,5,4,3,0,2,1,0,0,0,0,0}
        };

        int i=0;

        while (i<MAXF){
            int sumaMax=0, suma=0, iniMayor=0, finMayor=0, fila=0, ini=0, fin=-1;
            while (ini<MAXC){
                ini=buscarIni(matriz[i], fin+1);
                if(ini<MAXC){
                    fin=buscarFin(matriz[i], ini);
                    suma=sumaSec(matriz[i], ini, fin);
                    if (suma>sumaMax){
                        sumaMax=suma;
                        iniMayor=ini;
                        finMayor=fin;
                        fila=i;
                    }
                }
            }
            System.out.println("la secuencia mayor dá: " + sumaMax + ", está en la fila " + fila + " y su inicio y fin es: " + iniMayor + "|" + finMayor);
            i++;
        }
    }
    public static int buscarIni(int [] arr, int i){
        while (i<MAXC && arr[i]==SEPA)
            i++;
        return i;
    }
    public static int buscarFin (int[] arr, int i){
        while (i<MAXC && arr[i]!=SEPA)
            i++;
        return i-1;
    }
    public static int sumaSec (int[] arr, int ini, int fin){
        int suma=0;
        for (int i=ini; i<=fin; i++)
            suma+=arr[i];
        return suma;
    }
}
