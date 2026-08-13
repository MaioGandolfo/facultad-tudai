package PracticaIA;

public class ej3 {
    final static int MAXF=5, MAXC=20, SEPA=0;
    public static void main(String[] args) {
        /*
         *  Conservar solo números primos en las secuencias.
         */

        int [][] matriz={
            {0, 2, 4, 6, 0, 7, 9, 0, 11, 0, 13, 15, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 3, 5, 0, 0, 0, 10, 11, 0, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 2, 3, 5, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        
        int maxE=0, totalE=0, fila=0;
        for (int i=0; i<MAXF; i++){
            int eliminadas=procesarFila(matriz[i]);
            totalE+=eliminadas;
            if (eliminadas>maxE){
                maxE=eliminadas;
                fila=i;
            }
        }
    }
    public static int procesarFila (int [] arr){
        int ini=0, fin=-1, contador=0;
        while (ini<MAXC){
            ini=buscarIni(arr, fin+1);
            if (ini<MAXC){
                fin=buscarFin(arr, ini);
                contador+=dejarPrimos(arr, ini, fin);
            }
        }
        return contador;
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
    public static int dejarPrimos(int [] arr, int ini, int fin){
        int contador=0;
        while (ini<=fin){
            if (!esPrimo(arr[ini])){
                cIzq(arr, ini);
                fin--;
                contador++;
            }
            else 
                ini++;
        }
        return contador;
    }
    public static void cIzq(int[] arr, int pos){
        for (int i=pos; i<MAXC-1; i++)
            arr[i]=arr[i+1];
    }
    public static 
}
