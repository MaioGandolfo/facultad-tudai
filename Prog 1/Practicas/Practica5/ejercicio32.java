package Practica5;

public class ejercicio32 {
    final static int MAX=20, SEPA=0;
    public static void main(String[] args) {
        /*
         *  Se tiene un arreglo de enteros de tamaño 20 de secuencias de
         *  números entre 1 y 9, separadas por 0. El arreglo está precargado,
         *  y además empieza y termina con uno o más separadores 0. Hacer
         *  un programa que permita obtener a través de métodos la posición
         *  de inicio y la posición de fin de la secuencia ubicada a partir de
         *  una posición entera ingresada por el usuario. Finalmente, si
         *  existen imprima por pantalla ambas posiciones obtenidas.
         */
        
        int [] arr={0,1,2,3,4,5,0,0,9,8,7,0,0,5,2,3,0,2,2,0};

        int num=-1;

        while (num>MAX || num<0){
            System.out.println("ingrese un numero menor a 20:");
                num=Utils.leerInt();
        }

        int inicio=0, fin=-1;


        encontrarSec(arr, inicio, fin, num);

        //System.out.println("dasdda : " +arr.length);
        /*
        while (inicio<MAX&&sec){
            inicio=buscarIni(arr, fin+1);
            if (inicio<MAX){
                fin=buscarFin(arr, inicio);
                encontrarSec(arr, inicio, fin, num);
                sec=false;
            }
        }
        */

    }
    public static void encontrarSec(int [] arr, int ini, int fin, int num){
        if (num<MAX){
            ini=buscarIniNum(arr, num);
            if (ini!=-1 && ini<MAX){
                fin=buscarFin(arr, ini);
                System.out.println("el inicio y fin es: " + ini+"|"+fin);
            }
            else{ 
                System.out.println("no hay inicio ni fin");
            }

        }
        else if (num==SEPA){
            System.out.println("no hay inicio ni fin");
        }
        
    }
    public static void mostrarArreglo(int [] arr){
        for (int i=0; i<MAX; i++){
            System.out.print(arr[i] + "|");
        }
        System.out.println(" ");
    }
    public static int buscarIniNum (int [] arr, int num){
        
        //0,1,2,3,4,5,0,0,9,8,7,0,0,5,2,3,0,2,2,0
        if (arr[num]!=SEPA){
            while (num>0 && arr[num]!=SEPA)
                num--;
            return num+1;
        }
            return -1;
    }
    public static int buscarIni (int [] arr, int ini){
        
        while (ini<MAX && arr[ini]==SEPA)
            ini++;
        return ini;
    }
    public static int buscarFin (int [] arr, int ini){
        while (ini<MAX && arr[ini]!=SEPA)
            ini++;
        return ini-1;
    }
}
