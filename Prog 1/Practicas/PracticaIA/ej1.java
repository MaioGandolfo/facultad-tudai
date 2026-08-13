package PracticaIA;

public class ej1 {
    final static int MAXF=5, MAXC=20, SEPA=0, K=3;
    public static void main(String[] args) {
        /*
         *  Eliminar secuencias con menos de K elementos (conservar solo las de longitud ≥ K)
         */

        int [][] matriz ={
            {0, 3, 5, 0, 2, 2, 2, 0, 7, 8, 9, 0, 0, 1, 1, 0, 4, 4, 4, 0},
            {0, 1, 0, 4, 4, 4, 0, 0, 0, 5, 0, 0, 6, 6, 6, 6, 0, 0, 0, 0},
            {0, 0, 0, 2, 2, 0, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 9, 9, 9, 0, 1, 1, 0, 8, 8, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 22, 55, 1, 6, 1, 0, 3, 3, 0, 2, 3, 0, 2, 2, 0, 1, 1, 0, 0}
        };
        
        int maxE=0, fila=0, totalE=0;
        for (int i=0; i<MAXF; i++){
            int eliminada=procesarFila(matriz[i]);
            totalE+=eliminada;
            if (eliminada>maxE){
                maxE=eliminada;
                fila=i;
            }
        }

        System.out.println("el total de eliminaciones fue " +  totalE + " y la fila con mas eliminaciones fue la " + fila + " con un total de " + maxE  + " eliminaciones");

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
    public static int procesarFila (int [] arr){
        int ini=0, fin=-1, contador=0;
        while (ini<MAXC){
            ini=buscarIni(arr, fin+1);
            if (ini<MAXC){
                fin=buscarFin(arr, ini);
                int tam=fin-ini+1;
                if (tam<K){
                    eliminarSec(arr, ini, fin);
                    fin=ini;
                    contador++;
                }
            }
        }
        return contador;
    }
    public static void eliminarSec(int []arr, int ini, int fin){
        while (ini<=fin){
            cIzq(arr, ini);
            fin--;
        }
    }
    public static void cIzq(int [] arr, int pos){
        for (int i=pos; i<MAXC-1; i++)
            arr[i]=arr[i+1];
    }
    public static void mostrarMatriz(int [] [] m){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++)
                System.out.print(m[i][j] + "|");
        }
    }
}
