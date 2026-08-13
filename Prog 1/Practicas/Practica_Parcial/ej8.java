public class ej8 {
    final static int MAXF=3, MAXC=15, SEPA=0;
    public static void main(String[] args) {

        int[][] matriz = {
            {0,120,250,80,0,0,620,410,645,0,0,240,960,0,0},
            {0,250,155,90,85,0,150,625,0,0,900,750,225,0,0},
            {0,580,550,850,0,0,220,110,0,0,150,480,690,0,0}
        };

        int maxI=0, total_i=0, fila=0;
        for (int i=0; i<MAXF; i++){
            int invertidas=procesarFila(matriz[i]);
            total_i+=invertidas;
            if (invertidas>maxI){
                maxI=invertidas;
                fila=i;
            }
        }

        System.out.println("en la matriz hubo " + total_i + " de sec's invertidas, en la fila " + fila + " hubo " + maxI);
        mostrarMatriz(matriz);
    }
    public static int procesarFila(int [] arr){
        int ini=0, fin=-1, contador=0;
        while (ini<MAXC){
            ini=buscarIni(arr, fin+1);
            if (ini<MAXC){
                fin=buscarFin(arr, ini);
                if (esDecreciente(arr, ini, fin)){
                    invertirSec(arr, ini, fin);
                    contador++;
                }
            }
        }
        return contador;
    }
    public static boolean esDecreciente(int [] arr, int ini, int fin){
        while (ini<fin && arr[ini]>arr[ini+1])
            ini++;
        return ini==fin;
    }
    public static void invertirSec(int [] arr, int ini, int fin){
        int i=ini, j=fin, aux=0;
        while (i<j){
            aux=arr[i];
            arr[i]=arr[j];
            arr[j]=aux;
            i++;
            j--;
        }
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
    public static void mostrarMatriz (int [][] m){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++)
                System.out.print(m[i][j] + "|");
        }
    }
}
