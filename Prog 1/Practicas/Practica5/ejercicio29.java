package Practica5;

public class ejercicio29 {
    final static int MAX=20, SEPA=0; 
    public static void main(String[] args) {
        /*
        Hacer un programa que elimine de un arreglo todas las
        secuencias que tienen orden descendente entre sus elementos.
         */
        int [] arr={0,0,40,30,20,10,0,0,55,45,22,11,0,0,42,52,62,72,0,0};

        mostrarArreglo(arr);

        int inicio=0, fin=-1;
        boolean existe=true;
        
        while (inicio<MAX){
            inicio=buscarIni(arr, fin +1);
            if (inicio<MAX){
                fin=buscarFin(arr, inicio);
                existe=descendente(arr, inicio, fin);
                if (existe){
                    eliminarSec(arr, inicio, fin);
                    fin=inicio;
                }
            }
        }
        mostrarArreglo(arr);
        System.out.println("dasdda : " +arr.length);
    }
    public static boolean descendente (int [] arr, int ini, int fin){
        while (ini<fin && arr[ini] >= arr[ini+1])
            ini++;
        if (ini==fin)
            return true;
        else
            return false;
    }
    public static void eliminarSec (int [] arr, int ini, int fin){
            for (int i=ini; i<=fin; i++)
                cIzq(arr, ini);
    }
    public static void mostrarArreglo (int []arr){
        for (int i=0; i<MAX; i++)
            System.out.print(arr[i] + "|");
        System.out.println('\n');
    }
    public static int buscarIni (int [] arr, int i){
        while (i<MAX && arr[i]==SEPA)
            i++;
        return i;
    }
    public static int buscarFin (int [] arr, int ini){
        while (ini<MAX && arr[ini]!=SEPA)
            ini++;
        return ini-1;
    }
    public static void cIzq (int [] arr, int ini){
        for (int i=ini; i<MAX-1; i++)
            arr[i]=arr[i+1];
    }
}
