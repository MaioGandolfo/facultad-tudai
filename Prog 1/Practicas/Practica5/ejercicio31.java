package Practica5;

public class ejercicio31 {
    final static int MAX=20, SEPA=0, NSEC=1;
    public static void main(String[] args) {
        /*
        Hacer un programa que invierta el orden de la última secuencia
        en un arreglo.
         */

        int [] arr={0,0, 20,34,45, 0,0,45,55,10,4,  0  ,12,13,7,24,77,87,18,0};

        mostrarArreglo(arr);

        int inicio=MAX-1, fin=MAX, contador=0;

        boolean secuencia=true;
        while  (inicio>0 && secuencia){	
            inicio=buscarIni(arr, fin-1);
            if (inicio>0){
                fin=buscarFin(arr, inicio);
                contador++;
                if (contador==NSEC){
                    invertirSec(arr, fin, inicio);
                    secuencia=false;
                }
            }
        }
        //0,0, 20,34,45, 0,0,45,55,10,4,  0  ,12,13,7,24,77,87,18,0
        /* 
        while (inicio<MAX){
            inicio=buscarIni(arr, fin-1);
            if (inicio<MAX){
                fin=buscarFin(arr, inicio);
            }
        }
        */

        mostrarArreglo(arr);
    }
    public static void invertirSec (int [] arr, int ini, int fin){
        int aux=0, i=ini, j=fin;

        while (i<j){
            aux=arr[i];
            arr[i]=arr[j];
            arr[j]=aux;
            i++;
            j--;
        }
        /*
        for (int i=ini; i>fin/2 ;i--){	
            aux=arr[i];//hago una variarable con el arreglo
            arr[i]=arr[fin];//la posicion es igual a MAX-pos-1.
            arr[fin]= aux;//MAX-1-i es aux.
        }
        */
    }
    public static void mostrarArreglo(int [] arr){
        for (int i=0; i<MAX; i++){
            System.out.print(arr[i] + "|");
        }
        System.out.println('\n');
    }
    public static int buscarFin(int [] arr, int ini){
        int i=ini;
        while (i>0 && arr[i]!=SEPA)
            i--;
        return i+1;
    }
    public static int buscarIni (int [] arr, int ini){
        int i=ini;
        while (i>0 && arr[i]==SEPA)
            i--;
        return i;
    }
}
