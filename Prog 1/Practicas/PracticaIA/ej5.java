package PracticaIA;

public class ej5 {
    final static int MAXF=5, MAXC=20;
    final static char SEPA=' ';
    public static void main(String[] args) {
        //* Invertir nombres propios (secuencias que empiezan con mayúscula) y duplicar vocales.*/

        char [][] matriz={
            {' ', 'A', 'n', 'a', ' ', ' ', 'L', 'u', 'c', 'a', 's', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', 'p', 'e', 'p', 'e', ' ', ' ', 'M', 'a', 'r', 'i', 'a', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', 'M', 'e', 'l', 'i', 'n', 'a', ' ', 'y', ' ', 'M', 'a', 'i', 'o', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', 'J', 'u', 'a', 'n', ' ', 'P', 'e', 'd', 'r', 'o', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', 'A', 'l', 'e', 'x', ' ', 'S', 'a', 'n', 't', 'i', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };

        int maxE=0, totalE=0, fila=0;
        for (int i=0; i<MAXF; i++){
            int encriptaciones=procesarFila(matriz[i]);
            totalE+=encriptaciones;
            if (encriptaciones>maxE){
                maxE=encriptaciones;
                fila=i;
            }
        }
        System.out.println("encriptaciones de la matriz : " + totalE + ", mayor encriptacion en la fila : " + fila + ", con : " + maxE + ", encriptaciones.");

        mostrarMatriz(matriz);
    }
    public static int procesarFila (char[] arr){
        int ini=0, fin=-1, contador=0;
        while(ini<MAXC){
            ini=buscarIni(arr, fin+1);
            if (ini<MAXC){
                fin=buscarFin(arr, ini);
                if (esMayuscula(arr[ini])){
                    encriptarSec(arr, ini, fin);
                    contador++;
                }
            }
        }
        return contador;
    }
    public static boolean esMayuscula(char l){
        return l>='A' && l<='Z';
    }
    public static int buscarIni (char [] arr, int i){
        while (i<MAXC && arr[i]==SEPA)
            i++;
        return i;
    }
    public static int buscarFin(char[] arr, int i){
        while (i<MAXC && arr[i]!=SEPA)
            i++;
        return i-1;
    }
    public static void encriptarSec(char[] arr, int ini, int fin){
        int i=ini;
        
        int j=duplicarVocales(arr, ini, fin);
        
        char aux;
        while (i<j){
            aux=arr[i];
            arr[i]=arr[j];
            arr[j]=aux;
            i++;
            j--;
        }
    }
    public static int duplicarVocales(char[] arr, int ini, int fin){
        while (ini<=fin){
            if (esVocal(arr[ini])){
                cDer(arr, ini);
                ini+=2;
                fin++;
            }
            else
                ini++;
        }
        return fin;
    }
    public static boolean esVocal(char l){
        switch (l) {
            case 'a','e','i','o','u':
                return true;
            default:
                return false;
        }
    }
    public static void cDer(char [] arr, int pos){
        for (int i=MAXC-1; i>pos; i--)
            arr[i]=arr[i-1];
    }
    public static void mostrarMatriz(char [][]m){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++)
                System.out.print(m[i][j] + "|");
        }
    }
}
