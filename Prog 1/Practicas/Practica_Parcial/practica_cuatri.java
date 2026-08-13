public class practica_cuatri {
    final static int MAXF=3, MAXC=20, SEPA=0;
    public static void main(String[] args) {
        int[][] matriz = {
            {0,67,67,67,67,67,67,67,0,14,0,33,33,33,33,33,0,5,98,0},
            {0,23,45,45,45,45,23,0,88,88,88,88,0,0,0,0,78,78,0,0},
            {0,0,0,0,45,45,0,45,45,45,45,0,45,45,0,45,0,45,0,0}
        };
        
        for (int i=0; i<MAXF; i++){
            procesarFila(matriz[i]);
        }

        mostrarMatriz(matriz);
    }
    public static void mostrarMatriz(int m[][]){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++)
                System.out.print(m[i][j] + "|");
        }
    }
    public static void procesarFila(int arr[]){
        int ini=0, fin=-1;
        while (ini<MAXC){
            ini=buscarIni(arr, fin+1);
            if (ini<MAXC){
                fin=buscarFin(arr, ini);
                int tam=fin-ini+1;
                if (eIguales(arr, ini, fin) && tam>3){
                    fin=comprimirSec(arr, ini, fin, tam);
                }
            }
        }
    }
    public static int comprimirSec (int arr[], int ini, int fin, int tam){

        for (int i=0; i<=tam-2; i++){
            cDer(arr, ini);
            fin--;
        }
        arr[ini]=tam*-1;
        return fin;
    }
    public static void cDer(int arr[], int pos){
        for (int i=MAXC-1; i>pos; i--)
            arr[i]=arr[i-1];
    }
    public static int buscarIni(int arr[], int i){
        while (i<MAXC && arr[i]==SEPA)
            i++;
        return i;
    }
    public static int buscarFin(int arr[], int i){
        while (i<MAXC && arr[i]!=SEPA)
            i++;
        return i-1;
    }
    public static boolean eIguales (int arr[], int ini, int fin){
        while (ini<fin && arr[ini]==arr[ini+1])
            ini++;
        return ini==fin;
    }
}
