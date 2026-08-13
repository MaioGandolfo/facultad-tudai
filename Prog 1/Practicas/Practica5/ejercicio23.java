package Practica5;

public class ejercicio23 {
    final static int MAX=20, SEPA=0;
    public static void main(String[] args) {
        /*
        Hacer un programa que devuelva la posición de inicio y fin de la
        primera secuencia de números distinta de ceros
        */

        int [] array={0,24,54,67,80,0,0,0,344,55,0,0,0,13,14,15,0,17,18,0};

        int ini=encontrarIni(array);
        int fin=encontrarFin(array, ini);

        System.out.println("las posiciones del inicio y fin de la secuencia son: ");
        System.out.println(ini + "|" + fin );


    }
    public static int encontrarIni(int[] array){
        int i=0;
        while (i<MAX){
            if (array[i]!=SEPA){// encontra el ini así está bien solamente en este ejercicio, en los demas se busca de la manera tradicional
                return i;
            }
            else 
                i++;
        }
        return -1;
    }
    public static int encontrarFin (int [] arr, int ini){
        while (ini<MAX && arr[ini]!=SEPA){
            ini++;
        }
        return ini-1;
    }
}
