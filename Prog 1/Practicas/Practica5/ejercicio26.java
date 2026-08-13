package Practica5;

public class ejercicio26 {
    final static int MAX=20, SEPA=0; 
    public static void main(String[] args) {
        /*
        Hacer un programa que devuelva la posición de inicio y de fin
        de la secuencia de mayor tamaño.
         */

        int [] arr={0,0, 20,34,45, 0,0, 5,55,10,4,  0  ,12,13,7, 0,0,  87,18,0};

        int iniAux=0, finAux=0, inicio=0, fin=-1, tamanio=0, tamMax=0;
        while (inicio<MAX){
            inicio=buscarIni(arr, fin+1);
            if (inicio<MAX){
                fin=buscarFin(arr, inicio);
                tamanio=fin-inicio+1;
                if (tamanio>tamMax){
                    tamMax=tamanio;
                    iniAux=inicio;
                    finAux=fin;
                }
            }
        }
        System.out.println(iniAux + "|" + finAux);
    }
    public static int buscarIni (int []array, int i){
        while (i<MAX && array[i]==SEPA){
            i++;
        }
        return i;
    }
    public static int buscarFin (int [] array, int inicio){
        while (inicio<MAX && array[inicio]!=SEPA){
            inicio++;
        }
        return inicio-1;
    }
}
