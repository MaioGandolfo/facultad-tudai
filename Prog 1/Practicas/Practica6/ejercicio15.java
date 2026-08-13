package Practica6;

public class ejercicio15 {
    final static int MAXF=4, MAXC=20; 
    final static char SEPA=' ';
    public static void main(String[] args) {
        /*
         *  Hacer un programa que dada la matriz de secuencias de
         *  caracteres definida y precargada elimine todas las secuencias que
         *  tienen orden descendente entre sus elementos.
         */

        char[][] matriz={
            {' ','c','b','a',' ','d','e','f',' ','h','g','f',' ','x','y','z',' ',' ',' ',' ',' '}, // 'c','b','a' y 'h','g','f' descendentes
            {' ','m','l','k',' ','n','o','p',' ','q','p','o',' ','a','b','c',' ',' ',' ',' ',' '}, // 'm','l','k' y 'q','p','o' descendentes
            {' ','z','y','x',' ','a','b','c',' ','d','c','b',' ','e','f','g',' ',' ',' ',' ',' '}, // 'z','y','x' y 'd','c','b' descendentes
            {' ','r','q','p',' ','s','t','u',' ','v','u','t',' ','w','x','y',' ',' ',' ',' ',' '}  // 'r','q','p' y 'v','u','t' descendentes
        };

        for (int i=0; i<MAXF; i++){
            int ini=0, fin=-1;
            while (ini<MAXC){
                ini=buscarIni(matriz[i], fin+1);
                if (ini<MAXC){
                    fin=buscarFin(matriz[i], ini);
                    if(eDes(matriz[i], ini, fin)){
                        eliminarSec(matriz[i], ini, fin);
                        fin=ini;
                    }
                }
            }
        }
        mostrarMatriz(matriz);
    }
    public static int buscarIni(char [] arr, int i){
        while (i<MAXC && arr[i]==SEPA)
            i++;
        return i;
    }
    public static int buscarFin(char[] arr, int i){
        while (i<MAXC && arr[i]!=SEPA)
            i++;
        return i-1;
    }
    public static boolean eDes(char [] arr, int ini, int fin){
        while (ini<fin  && (arr[ini]>arr[ini+1]))
            ini++;
        return ini==fin;
    }
    public static void cIzq(char[] arr, int ini){
        for (int i=ini; i<MAXC-1; i++)
            arr[i]=arr[i+1];
    }
    public static void eliminarSec(char [] arr, int ini, int fin){
        while (fin>=ini){
            cIzq(arr, ini);
            fin--;
        }
    }
    public static void mostrarMatriz(char[][] M){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++)
                System.out.print( M[i][j] + "|");
        }
    }
}
