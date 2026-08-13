package PracticaIA;

public class ej4 {
    final static int MAXF=5, MAXC=20, SEPA=0, R=4;
    public static void main(String[] args) {
        //*Reemplazar secuencias de X o más elementos repetidos por [-cantidad, valor] */

        int [][] matriz={
            {0, 2, 2, 2, 2, 0, 5, 5, 5, 5, 5, 0, 0, 1, 1, 1, 1, 0, 0, 0},
            {0, 3, 3, 3, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 4, 4, 4, 4, 0, 4, 4, 4, 4, 0, 10, 10, 10, 10, 10, 10, 10, 10, 0},
            {0, 4, 4, 4, 4, 4, 0, 6, 6, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 7, 7, 0, 8, 8, 8, 8, 0, 9, 9, 9, 9, 9, 0, 0, 0, 0, 0, 0}
        };

        int maxCom=0, totalC=0, fila=0;
        for (int i=0; i<MAXF; i++){
            int comprimidos=procesarFila(matriz[i]);
            totalC+=comprimidos;
            if (comprimidos>maxCom){
                maxCom=comprimidos;
                fila=i;
            }
        }
        System.out.println("hubo un total de " + totalC + " compresiones en la matriz, y la fila " + fila + " tuvo un total de " + maxCom + " de compresiones");

        mostrarMatriz(matriz);
    }
    public static int procesarFila(int [] arr){
        int ini=0, fin=-1, contador=0;

        while (ini<MAXC){
            ini=buscarIni(arr, fin+1);
            if (ini<MAXC){
                fin=buscarFin(arr, ini);
                int vIni=arr[ini];
                int tam=fin-ini+1;
                if (tam>=R){
                    comprimirSec(arr, ini, fin, (-tam), vIni);
                    fin=ini+1;
                    contador++;
                }
            }
        }
        return contador;
    }
    public static void comprimirSec(int [] arr, int ini, int fin, int comprimidos, int vIni){

        while (fin>=ini){
            cIzq(arr, ini);
            fin--;
        }
        for (int i=0; i<2; i++)
            cDer(arr, ini);

        arr[ini]=comprimidos;
        arr[ini+1]=vIni;
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
    public static void cDer (int [] arr, int pos){
        for (int i=MAXC-1; i>pos; i--)
            arr[i]=arr[i-1];
    }
    public static void cIzq (int [] arr, int pos){
        for (int i=pos; i<MAXC-1; i++)
            arr[i]=arr[i+1];
    }
    public static void mostrarMatriz(int [][]m){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++)
                System.out.print(m[i][j] + "|");
        }
    }
}
