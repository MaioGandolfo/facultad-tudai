public class ejercicoYO {
    final static int MAXF=5, MAXC=17, SEPA=0;
    public static void main(String[] args) {
        //*insertar un numero dado por el usuario en una secuencia ordenada */

        int[][] matriz = {
            {0,1,2,5,0,8,10,11,0,3,4,7,0,1,2,3,0},
            {0,4,6,7,0,1,3,4,0,9,10,12,0,5,6,9,0},
            {0,10,11,15,0,2,5,6,0,1,2,5,0,7,8,11,0},
            {0,1,3,4,0,7,8,10,0,11,13,14,0,2,4,6,0},
            {0,5,7,9,0,1,2,3,0,4,5,8,0,10,11,12,0}
        };
        int [] sec={1,4,1,3,4};

            int num=0;

        while (num<1){
            System.out.println("Ingrese un nuemero del 1 en adelante");
            num=Utils.leerInt();
        }
        
        for (int i=0; i<MAXF; i++){
            procesarFila(matriz[i], sec[i], num);
        }
        mostrarMatriz(matriz);
    }
    public static void procesarFila (int [] arr, int sec, int num){
        int ini=0, fin=-1, contador=1; boolean existe=false;
        while (ini<MAXC && !existe){
            ini=buscarIni(arr, fin+1);
            if (ini<MAXC){
                fin=buscarFin(arr, ini);
                if(contador==sec){
                    fin=agregarNum(arr, num, ini, fin);
                    existe=true;
                }
                else 
                    contador++;
            }
        }
    }
    public static int agregarNum(int [] arr, int num, int i, int fin){
        while (i<=fin && arr[i]<num)
            i++;

        cDer(arr, i);
        fin++;
        arr[i]=num;

        return fin;
    }
    public static void cDer (int [] arr, int pos){
        for (int i=MAXC-1; i>pos; i--)
            arr[i]=arr[i-1];
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
    public static void mostrarMatriz(int [] [] m){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++) 
                System.out.print(m[i][j] + "|");
        }
    }
}
