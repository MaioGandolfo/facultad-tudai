public class foodTruck {
    final static int MAXF=4, MAXC=15, SEPA=0, X=2;
    public static void main(String[] args) {
        
        int[][] matriz = {
            {0,625,815,900,0,562,952,300,0,365,169,254,0,0,0},
            {0,958,62,57,221,0,596,623,600,0,587,889,984,0,0},
            {0,0,700,257,0,0,0,854,958,388,0,954,842,925,0},
            {0,988,899,874,0,254,258,652,200,0,568,958,210,0,0}
        };

        for (int i=0; i<MAXF; i++){
            if(procesarFila(matriz[i]))
                System.out.println("en el dia " + (i+1) + " se incrementaron las ventas");
        }

    }
    public static boolean procesarFila(int [] arr){
        int ini=0, fin=-1, promedio=0, promedioNuevo=0, contador=0;
        boolean incrementa=false;
        while (ini<MAXC){
            ini=buscarIni(arr, fin+1);
            if(ini<MAXC){
                fin=buscarFin(arr, ini);
                int tam=fin-ini+1;
                promedioNuevo=sacarPromedio(arr, tam, ini, fin);
                if (promedioNuevo>promedio){
                    contador++;
                    promedio=promedioNuevo;
                }
                if(contador>=X)
                    incrementa=true;
            }
        }
        return incrementa;
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
    public static int sacarPromedio(int [] arr, int tam, int ini, int fin){
        int suma=0;
        for(int i=ini; i<=fin; i++)
            suma+=arr[i];
        return suma/tam;
    }
}
