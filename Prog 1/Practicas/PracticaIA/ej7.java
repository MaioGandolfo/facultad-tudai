package PracticaIA;

public class ej7 {
    final static int MAXF=5, MAXC=20;
    final static char SEPA=' ';
    public static void main(String[] args) {
        //*Invertir solo palabras que comienzan con mayúscula. */

        char[][] matriz = {
            {' ', 'H', 'o', 'l', 'a', ' ', 'M', 'u', 'n', 'd', 'o', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', 'J', 'a', 'v', 'a', ' ', 'e', 's', ' ', 'C', 'o', 'o', 'l', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', 'M', 'a', 'i', 'o', ' ', 'y', ' ', 'M', 'e', 'l', 'i', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', 'P', 'y', 't', 'h', 'o', 'n', ' ', 'P', 'o', 'r', 'o', 'n', 'g', 'a', ' ', ' ', ' ', ' ', ' '},
            {' ', 'A', 'b', 'c', 'd', 'e', 'f', 'g', ' ', 'P', 'e', 'n', 'e', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
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
                if (esMayuscula(arr[ini]))
                    invertirSec(arr, ini, fin);
            }
        }
    }
    public static boolean esMayuscula(char l){
        return l>='A' && l<='Z';
    }
    public static void invertirSec (char[] arr, int ini, int fin){
        int i=ini, j=fin;
        char aux;

        while (i<j){
            aux=arr[i];
            arr[i]=arr[j];
            arr[j]=aux;
            i++;
            j--;
        }
    }
    public static int buscarIni (char[] arr, int i){
        while (i<MAXC && arr[i]==SEPA)
            i++;
        return i;
    }
    public static int buscarFin(char[] arr, int i){
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
