package PracticaIA;

public class ej2 {
    final static int MAXF=5, MAXC=20, SEPA=0;
    public static void main(String[] args) {
        /*
         *   Invertir secuencias estrictamente crecientes.
         */
        int [][] matriz={
            {0, 1, 3, 5, 0, 2, 4, 6, 0, 0, 9, 8, 0, 1, 2, 3, 0, 0, 0, 0},
            {0, 5, 3, 1, 0, 0, 9, 7, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 2, 4, 6, 8, 0, 1, 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 3, 0, 5, 0, 7, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        int maxI=0, fila=0, totalInvertidas=0;
        for (int i=0; i<MAXF; i++) {
            int invertidas=procesarFila(matriz[i]);
            totalInvertidas+=invertidas;
            if (invertidas>maxI){
                maxI=invertidas;
                fila=i;
            }
        }
        System.out.println("el total de invertidas fue " + totalInvertidas + " y en la fila " + fila + " se invertieron " + maxI);

        mostrarMatriz(matriz);
    }
    public static int buscarIni(int [] arr, int i){
        while (i<MAXC && arr[i]==SEPA)
            i++;
        return i;
    }
    public static int buscarFin(int [] arr, int i){
        while (i<MAXC && arr[i]!=SEPA)
            i++;
        return i-1;
    }
    public static int procesarFila (int [] arr){
        int ini=0, fin=-1, contador=0;
        while (ini<MAXC){
            ini=buscarIni(arr, fin+1);
            if (ini<MAXC){
                fin=buscarFin(arr, ini);
                if (!esCreciente(arr, ini, fin)){
                    invertirSec(arr, ini, fin);
                    contador++;
                }
            }
        }
        return contador;
    }
    public static boolean esCreciente (int [] arr, int ini, int fin){
        int i=ini;
        while (i<fin && arr[i]>arr[i+1])
                i++;
        return i==fin;
    }
    public static void invertirSec (int [] arr, int ini, int fin){
        int aux=0, i=ini, j=fin;
        while (i<j){
            aux=arr[i];
            arr[i]=arr[j];
            arr[j]=aux;
            i++;
            j--;
        }
    }
    public static void mostrarMatriz(int [] [] m){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++) 
                System.out.print(m[i][j] + "|");
        }
    }
}
