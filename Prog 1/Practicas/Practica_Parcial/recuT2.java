public class recuT2 {
    final static int MAXF=4, MAXC=26, E=25;
    public static void main(String[] args) {
        
        int[][] matriz = {
            {-6, 12, 26, 20, 24, 18, -9, -3, 51, 17, 83, 50, -1, 69, 74, 58, -6, 25, 33, 34, -8, 10, 25, 25, 44, -9},
            {-1, -2, 85, 86, 88, -9, -5, 12, 15, 18, 20, 35, 38, -7, 60, 61, 64, 50, -5, 18, 18, -8, 77, 62, 99, -2},
            {-4, 13, 20, 19, 31, 37, -5, -6, -8, 26, 28, 40, 39, -2, 36, 38, 34, 32, -9, 38, 15, -8, 12, 25, 20, -6},
            {-7, 85, 58, 57, 96, -6, 36, 42, 52, 41, -5, 25, 28, 36, 40, -8, 63, 66, 70, -6, 28, 21, 16, 23, 17, -3}
        };

        int [] arr={2,3,1,5};

        int eliminadas=0;

        for (int i=0; i<MAXF; i++){
            int ini=0, fin=-1, contador=1;
            boolean sec=false;
            while (ini<MAXC && !sec){
                ini=buscarIni(matriz[i], fin+1);
                if (ini<MAXC){
                    fin=buscarFin(matriz[i], ini);
                    if (contador==arr[i]){
                        int valoresE=procesarSec(matriz[i], ini, fin);
                        eliminadas+=valoresE;
                        sec=true;
                    }
                    else
                        contador++;
                }
            }
        }
        System.out.println("la cantidad de mediciones eliminadas fué: " + eliminadas );
        mostrarMatriz(matriz);
    }
    public static int buscarIni(int [] arr, int i){
        while (i<MAXC && arr[i]<0)
            i++;
        return i;
    }
    public static int buscarFin(int [] arr, int i){
        while (i<MAXC && arr[i]>=0)
            i++;
        return i-1;
    }
    public static void cIzq(int [] arr, int pos){
        for (int i=pos; i<MAXC-1; i++)
            arr[i]= arr[i+1];
    }
    public static int procesarSec(int [] arr, int ini, int fin){
        int contador=0;
        while (ini<=fin){
            if (arr[ini]<E){
                cIzq(arr, ini);
                contador++;
                fin--;
            }
            else if (arr[ini]>=E){
                arr[ini]-=E;
                ini++;
            }
        }
        return contador;
    }
    public static void mostrarMatriz(int [] [] m){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++)
                System.out.print(m[i][j] + "|");
        }
    }
}
