package Practica6;

public class ejercicio13 {
    final static int MAXF=4, MAXC=20, SEPA=0;
    public static void main(String[] args) {
        /*
         *  Hacer un programa que dada la matriz de secuencias de       
         *  enteros definida y precargada, y un número entero ingresado por     
         *  el usuario, elimine de cada fila las secuencias de tamaño igual al      
         *  número ingresado.
         */

        int[][] matriz = {
            {0,0,2,3,4,0,0,5,6,0,7,8,9,0,0,1,2,3,0,0},
            {0,1,2,0,3,4,5,0,0,6,7,8,0,0,9,0,0,2,2,0},
            {0,0,5,0,6,7,8,0,0,55,55,1,0,2,3,4,0,0,0,0},
            {0,0,0,9,8,0,7,6,0,5,4,3,0,2,1,0,0,0,0,0}
        };

        int num=0;
        System.out.println("ingrese un numero: ");
        num=Utils.leerInt();

        for (int i=0; i<MAXF; i++){
            int ini=0, fin=-1, suma=0;
            while (ini<MAXC){
                ini=buscarIni(matriz[i], fin+1);
                if (ini<MAXC){
                    fin=buscarFin(matriz[i], ini);
                    suma=fin-ini+1;
                    while(fin>=ini && suma==num){ 
                        cIzq(matriz[i], ini);
                        fin--;
                    }
                }
            }
        }
        mostrarMatriz(matriz);
    }
    public static int buscarIni(int[] arr, int i){
        while (i<MAXC && arr[i]==SEPA)
            i++;
        return i;
    }
    public static int buscarFin(int[] arr, int i){
        while (i<MAXC && arr[i]!=SEPA)
            i++;
        return i-1;
    }
    public static void cIzq(int[] arr, int ini){
        for (int i=ini; i<MAXC-1; i++)
            arr[i]=arr[i+1];
    }
    public static void mostrarMatriz(int[][] m){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++)
                System.out.print(m[i][j] + "|");
        }
    }
}
