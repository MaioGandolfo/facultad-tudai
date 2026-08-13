package Practica6;

public class ejercicio12 {
    final static int MAXF=4, MAXC=20, CONT=2; 
    final static char SEPA=' ';
    public static void main(String[] args) {
        /*
         *  Hacer un programa que dada la matriz de secuencias de
         *  caracteres definida y precargada, permita encontrar por cada fila
         *  la posición de inicio y fin de la anteúltima secuencia (considerar
         *  comenzar a buscarla a partir de la última posición de la fila).
         */

        char[][] matriz = {
            {' ',' ','a','b','c',' ',' ','d','e','f',' ','g','h',' ',' ','i','j','k',' ',' '},
            {' ','x','y','z',' ',' ','m','n',' ',' ','o','p','q',' ',' ',' ','r','s',' ',' '},
            {' ','a','b',' ','c','d','e',' ',' ','f','g',' ','h','i','j',' ',' ',' ','k',' '},
            {' ',' ','l','m','n',' ','o',' ','p','q',' ',' ','r','s','t',' ','u','v',' ',' '}
        };

        for (int i=0; i<MAXF; i++){
            int ini=MAXC-1, fin=MAXC, contador=0;
            boolean secuencia=true;
            while (ini>0 && secuencia){
                ini=saberIni(matriz[i], fin-1);
                if (ini>0){
                    fin=saberFin(matriz[i], ini);
                    contador++;
                    if(contador==CONT){
                        System.out.println("fila " + i + ": el inicio y fin de la ante ultima secuenciecia: " + ini + "|" + fin);
                        secuencia=false;
                    }
                }
            }
        }
    }
    public static int saberIni(char[] arr, int i){
        while (i>0 && arr[i]==SEPA)
            i--;
        return i;
    }
    public static int saberFin(char [] arr, int i){
        while (i>0 && arr[i]!=SEPA)
            i--;
        return i+1;
    }
}
