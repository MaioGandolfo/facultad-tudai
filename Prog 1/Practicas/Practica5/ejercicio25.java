package Practica5;

public class ejercicio25 {
    final static int MAX=20, SEPA=0;
    public static void main(String[] args) {
        /*
        Hacer un programa que devuelva la posición de inicio y fin de la
        anteúltima secuencia de números distintos de ceros.
        */

        int [] arr={0,0, 20,34,45, 0,0,0, 55,10,4,  0  ,12,13,7, 88,0,  87,18,0};

        mostrarArreglo(arr);

        proceso(arr);

    
        
    }
    public static void proceso(int []arr){
        int inicio=MAX-1, fin=MAX, contador=0;
        int secMaxI=-1, secMaxF=-1; 
        boolean secuencia=true;
        while (inicio>0 && secuencia){
            inicio=saberIni(arr, fin-1);
            if (inicio>0){
                fin=saberFin(arr, inicio);
                contador++;
                if (contador==2){
                    secMaxI=fin;
                    secMaxF=inicio;
                    secuencia=false;
                }
            }
        }
        System.out.println(secMaxI + "|" + secMaxF);
    }
    public static int saberIni(int [] arr, int ini){
        while (ini>0 && arr[ini]==SEPA)
            ini--;
        return ini;
    }
    public static int saberFin(int []arr, int ini){
        while (ini>0 && arr[ini]!=SEPA)
            ini--;
        return ini+1;
    }
    public static void mostrarArreglo(int[] arr){
        int i=0;
        while (i<MAX){
            System.out.print(arr[i] + "|");
            i++;
        }
        System.out.println();
    }
}
