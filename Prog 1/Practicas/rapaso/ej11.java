public class ej11 {
    
    final static int MAXF=4, MAXC=20, SEPA=0;
    public static void main(String[] args) {
        int[][] matriz = {
            {0,0,2,3,4,0,0,5,6,0,7,8,9,0,0,1,2,3,0,0},
            {0,1,2,0,3,4,5,0,0,6,7,8,0,0,9,0,0,2,2,0},
            {0,0,5,0,6,7,8,0,0,1,1,1,0,2,3,4,0,0,0,0},
            {0,0,0,9,8,0,7,6,0,5,4,3,0,2,1,0,0,0,0,0}
        };

        for (int i=0; i<MAXF; i++)
            procesarFila(matriz, i);
    }
    public static void procesarFila(int [][] matriz, int fila){
        int ini=0, fin=-1, sumaMax=0, iniMax=0, finMax=0, suma=0;

        while (ini<MAXC){
            ini=buscarIni(matriz[fila], fin+1);
            if(ini<MAXC){
                fin=buscarFin(matriz[fila], ini);
                suma=sumaSec(matriz[fila], ini, fin);
                if(suma>sumaMax){
                    iniMax=ini;
                    finMax=fin;
                }
            }
        }
        System.out.println("en la fila " + fila + " la secuencia con mayor suma da " + suma + ", el inicio es " + iniMax +" y el fin es " + finMax);
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
    public static int sumaSec(int [] arr, int ini, int fin){
        int suma=0;
        for (int i=ini; i<=fin; i++)
            suma+=arr[i];
        return suma;
    }

}
