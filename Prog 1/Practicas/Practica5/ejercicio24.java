package Practica5;

public class ejercicio24 {
    final static int MAX=20, SEPA=0;
    public static void main(String[] args) {
        /*
        Hacer un programa que devuelva la posición de inicio y fin de la
        secuencia de números distintos de ceros cuya suma del contenido
        sea mayor.
         */

        int [] arr={0,0,20,34,45,0,0,0,55,10,4,0,12,13,0,0,0,17,18,19};

        System.out.println(arr.length);

        int fin=-1;
        int ini=0;
        int suma=0;
        int suma_mayor_actual=0;
        int ini_mayor=0;
        int fin_mayor=0;

        while (ini<MAX){
            ini = obtenerIni(arr, fin+1);        //{0,0,5,6,7,0,0,4,2,0,0,0,23,45,67,0,0,8,6,5,4}
            if(ini<MAX){
                fin = obtenerFin(arr, ini);
                suma = suma_sec(arr,ini,fin);
                if(suma>suma_mayor_actual){
                    suma_mayor_actual = suma;
                    ini_mayor = ini;
                    fin_mayor = fin;
                }
            }
        }
        System.out.println("la secuencia mayor dá: " + suma_mayor_actual + ", el inicio es " + ini_mayor + " y el fin es " + fin_mayor  );

    }
    public static int suma_sec(int[] arr,int ini, int fin){
        int suma = 0;
        for(int i=ini;i<=fin;i++){
            suma+=arr[i];
        }
        return suma;
    }
    public static int obtenerIni (int [] array, int ini){
        while (ini<MAX && array[ini]==0){
            ini++;
        }
        return ini;
    }
    public static int obtenerFin(int [] arr, int ini){
        while (ini<MAX && arr[ini]!=SEPA)
            ini++;
        return ini-1;
    }
}
