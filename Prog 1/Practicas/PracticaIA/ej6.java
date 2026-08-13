package PracticaIA;

public class ej6 {
    final static int MAXF=5, MAXC=20, K=3;
    final static char SEPA=' ', CAMBIO='#';
    public static void main(String[] args) {
        //* Eliminar palabras (secuencias de letras) con menos de K caracteres, reemplazándolas por #. */

        char[][] matriz = {
            {' ', 'H', 'o', 'l', 'a', ' ', 'y', ' ', 'a', 'd', 'i', 'o', 's', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', 'J', 'a', 'v', 'a', ' ', 'e', 's', ' ', 'g', 'e', 'n', 'i', 'a', 'l', ' ', ' ', ' ', ' ', ' '},
            {' ', 'P', 'e', 'n', 'e', ' ', 's', 'i', ' ', 'x', 'f', 'a', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', 'C', 'o', 'd', 'e', ' ', 'n', 'n', 'n', ' ', 'x', 'x', 'x', ' ', ' ', 'q', 'u', 'e', ' ', ' '},
            {' ', 'A', ' ', 'B', ' ', 'C', ' ', 'x', 'd', ' ', 'x', 'd', ' ', ':', 'v', ' ', ' ', ' ', ' ', ' '}
        };

        for (int i=0; i<MAXF; i++){
            procesarFila(matriz[i]);
        }
        mostrarMatriz(matriz);
    }
    public static void procesarFila(char[] arr){
        int ini=0, fin=-1;
        while (ini<MAXC){
            ini=buscarIni(arr, fin+1);
            if (ini<MAXC){
                fin=buscarFin(arr, ini);
                int tam=fin-ini+1;
                if (tam<=K){
                    eliminarSec(arr, ini, fin);
                }
            }
        }
    }
    public static void eliminarSec(char [] arr, int ini, int fin){
        for (int i=ini; i<=fin; i++)
            arr[i]=CAMBIO;
    }
    public static int buscarIni (char [] arr, int i){
        while (i<MAXC && arr[i]==SEPA)
            i++;
        return i;
    }
    public static int buscarFin (char[] arr, int i){
        while (i<MAXC && arr[i]!=SEPA)
            i++;
        return i-1;
    }
    public static void mostrarMatriz(char[][] m){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++)
                System.out.print(m[i][j] + "|");
        }
    }
}
