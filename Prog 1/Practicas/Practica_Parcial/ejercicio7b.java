public class ejercicio7b {
    final static int MAXF=3, MAXC=20, SEPA=0;
    public static void main(String[] args) {
        int[][] matriz = {
            {0, -8, 67, 0, 14, 0, -4, 33, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 25, 25, 0, -5, 3, 0, 25, 44, 44, 0, -4, 1, 0, 0, 0, 0, 0, 0},
            {0, 44, 44, 44, 0, -8, 15, 0, -5, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        int maxDf=0, totalD=0, fila=0; 
        for (int i=0; i<MAXF; i++){
            int descomprimidas=procesarfila(matriz[i]);
            totalD+=descomprimidas;
            if(descomprimidas>maxDf){
                maxDf=descomprimidas;
                fila=i;
            }
        }
        System.out.println("el total de descompresiones en la matriz es de " + totalD + " y el fila " + fila +" fue donde mas descompresiones hubo con " + maxDf);
        mostrarMatriz(matriz);
    }
    public static  int procesarfila(int [] arr){
        int ini=0, fin=-1, descomprimidas=0;
        while (ini<MAXC){
            ini=buscarIni(arr, fin+1);
            if (ini<MAXC){
                fin=buscarFin(arr, ini);
                if (arr[ini]<0){
                    descomprimidas+=arr[ini]*(-1);
                    fin=procesarSec(arr, ini, fin);
                }
            }
        }
        return descomprimidas;
    }
    public static int procesarSec(int []arr, int ini, int fin){
        int contador=0, numIni=arr[ini]*(-1)-3;
        
        while (contador<=numIni){
            cDer(arr, ini+1);
            contador++;
            fin++;
        }
        arr[ini]=arr[ini+1];
        
        return fin;
    }
    public static void cDer (int[] arr, int pos){
        for (int i=MAXC-1; i>pos; i--){
            arr[i]=arr[i-1];
        }
    }
    public static void mostrarMatriz(int[] [] matriz){
        for (int i=0 ; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++)
                System.out.print(matriz[i] [j] +"|");
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
    public static void cIzq (int [] arr, int pos){
		for (int i=pos; i<MAXC-1; i++){
			arr[i]=arr[i+1];
		}
	}//cIzq
}
