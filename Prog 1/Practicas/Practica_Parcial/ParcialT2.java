public class ParcialT2 {
    final static int SEPA=-1;
    public static void main(String[] args) {
        
        int [] tiempo={-6,-23,23,21,20,19,15,-1,15,14,13,16,-8,-10,-30,28,26,12,-3,56,52,54,60,-5};

        int inicio=0, fin=-1;

        while (inicio<tiempo.length){
            inicio=buscarIni(tiempo, fin+1);
            if (inicio<tiempo.length){
                fin=buscarFin(tiempo, inicio);
                if (tiempo[fin] > tiempo[inicio]){
                    procesarSec(tiempo, inicio, fin);
                    fin=inicio+1;
                }
            }
        }
        mostrarArreglo(tiempo);
    }
    public static int buscarIni(int [] arr, int i){
        while (i<arr.length && arr[i] <0)
            i++;
        return i;
    }
    public static int buscarFin (int [] arr, int i){
        while (i < arr.length && arr[i] >= 0)
            i++;
        return i-1;
    }
    public static int sumaSec(int [] arr, int ini, int fin){
        int suma=0;
        for (int i=ini; i<=fin; i++)
            suma+=arr[i];
        return suma;
    }
    public static void eliminarSec (int [] arr, int ini, int fin){
        while(fin>=ini){
            cIzq(arr, ini);
            fin--;
        }
    }
    public static void procesarSec(int[] arr, int ini, int fin){
        int suma=0, horas=0, mins=0;
        
        int hora=ini, min=ini+1;
        
        suma=sumaSec(arr, ini, fin);

        eliminarSec(arr, ini, fin);

        horas=suma/60;
        mins=suma%60;

        
        for (int i=0; i<2; i++)
            cDer(arr, ini);
        
        arr[hora]=horas;
        arr[min]=mins;
        
    }
    public static void cDer(int [] arr, int ini){
        for (int i=arr.length-1; i>ini; i--)
            arr[i]=arr[i-1];
    }
    public static void cIzq(int [] arr, int ini){
        for (int i=ini; i<arr.length-1; i++)
            arr[i]=arr[i+1];
    }
    public static void mostrarArreglo(int []arr){
        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i] + "|");
    }

}
