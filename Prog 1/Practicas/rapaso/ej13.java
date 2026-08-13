import Practica2.Utils;

public class ej13 {
    final static int MAXF=4, MAXC=20, SEPA=0;
    public static void main(String[] args) {
        int[][] matriz = {
            {0,0,2,3,4,0,0,5,6,0,7,8,9,0,0,1,2,3,0,0},
            {0,1,2,0,3,4,5,0,0,6,7,8,0,0,9,0,0,2,2,0},
            {0,0,5,0,6,7,8,0,0,1,1,1,0,2,3,4,0,0,0,0},
            {0,0,0,9,8,0,7,6,0,5,4,3,0,2,1,0,0,0,0,0}
        };

        System.out.print("ingrese un numero: ");
        int num=Utils.leerInt();

        for (int i=0; i<MAXF; i++)
            procesarFila(matriz[i], num);

        mostrarMatriz(matriz);

    }
    public static void mostrarMatriz(int [][] m){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for(int j=0; j<MAXC; j++)
                System.out.print(m[i][j] + "|");
        }
    }
    public static void procesarFila(int [] arr, int num){
        int ini=0, fin=-1;
        while (ini<MAXC){
            ini=buscarIni(arr, fin+1);
            if(ini<MAXC){
                fin=buscarFin(arr, ini);
                int tam=fin-ini+1;
                if(tam==num)
                    fin=eliminarSec(arr, ini, tam);
            }
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
    public static int eliminarSec(int [] arr, int ini, int tam){
        for (int i=1; i<=tam; i++)
            cIzq(arr, ini);
        return ini;
    }
    public static void cIzq(int [] arr, int ini){
        for (int i=ini; i<MAXC-1; i++)
            arr[i]=arr[i+1];
    }
}
