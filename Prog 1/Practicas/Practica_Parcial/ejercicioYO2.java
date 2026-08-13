public class ejercicioYO2 {
    final static int MAXF=6, MAXC=20, SEPA=0;
    public static void main(String[] args) {
        int[][] matriz = {
            {0,25,23,21,19,0,15,14,13,0,10,8,6,4,0,30,28,26,24,0},
            {0,40,38,36,34,0,30,29,28,0,25,23,21,0,18,17,16,15,0,0},
            {0,50,48,46,0,42,40,39,37,0,35,33,31,0,28,27,26,25,0,0},
            {0,100,95,90,85,0,80,75,70,0,65,60,55,0,50,45,40,35,0,0},
            {0,70,68,66,64,0,60,58,56,0,54,52,50,0,48,46,44,42,0,0},
            {0,90,88,86,84,0,80,78,76,0,74,72,70,0,68,66,64,62,0,0}
        };

        int num=0;

        while (num<=999999 || num>=2000000){
            System.out.println("ingrese un numero entre 1.000.000 y 1.999.999");
            num=Utils.leerInt();
        }

        for (int i=0; i<MAXF; i++){
            procesarFila(matriz[i], num);
        }

        mostrarMatriz(matriz);
    }
    public static void procesarFila (int[] arr, int n){
        int ini=0, fin=-1;
        while (ini<MAXC){
            ini=buscarIni(arr, fin+1);
            if (ini<MAXC){
                fin=buscarFin(arr, ini);
                if (esDecreciente(arr, ini, fin)){
                    agregarNum(arr, ini, fin, n);
                    fin++;
                }
            }
        }
    }
    public static boolean esDecreciente(char[] arr, int ini, int fin){
        while (ini<fin && arr[ini]>arr[ini+1])
            ini++;
        return ini==fin;
    }
}
