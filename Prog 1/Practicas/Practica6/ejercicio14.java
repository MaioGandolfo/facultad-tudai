package Practica6;

public class ejercicio14 {
    final static int MAXF=4, MAXC=20;
    final static char SEPA=' ';
    public static void main(String[] args) {
        /*
         *  Hacer un programa que dada la matriz de secuencias de
         *  caracteres definida y precargada, elimine de cada fila todas las
         *  ocurrencias de una secuencia patrón dada por un arreglo de
         *  caracteres de tamaño igual al tamaño de columnas de la matriz
         *  (sólo tiene esa secuencia con separadores al inicio y al final). Al
         *  eliminar en cada fila se pierden los valores haciendo los
         *  corrimientos.
         */

        char[][] matriz = {
            {' ',' ','a','b','c','d',' ','d','e','f',' ','g','h',' ',' ','i','j','k',' ',' '},
            {' ','x','y','z',' ',' ','m','n',' ',' ','o','p','q',' ','c','d','r','s',' ',' '},
            {' ','a','b',' ','c','d','e',' ',' ','f','g',' ','h','i','j',' ',' ',' ','k',' '},
            {' ',' ','l','m','n',' ','o',' ','p','q','c','d','r','s','t',' ','u','v',' ',' '}
        };
        
        char[] patron={' ','c','d',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};

        for (int i=0; i<MAXF; i++){
            int ini=0, fin=-1;
            while (ini<MAXC){
                ini=buscarIni(matriz[i], fin+1);
                if(ini<MAXC){
                    fin=buscarFin(matriz[i], ini);
                    if(esPatron(matriz[i], ini, fin, patron)){
                        borrarSec(matriz[i], ini, fin);
                    }
                }
            }
        }
        mostrarMatriz(matriz);
    }
    public static boolean esPatron(char [] arr, int ini, int fin, char[] patron){
        while (ini<fin && (arr[ini]!=patron[1] && arr[ini+1]!=patron[2]))
            ini++;
        if (ini<fin)
            return true;
        return false;
    }
    public static int buscarIni(char [] arr, int i){
        while (i<MAXC && arr[i]==SEPA)
            i++;
        return i;
    }
    public static int buscarFin(char [] arr, int i){
        while (i<MAXC && arr[i]!=SEPA)
            i++;
        return i-1;
    }
    public static void borrarSec(char [] arr, int ini, int fin){
        while (fin>=ini){
            cIzq(arr, ini);
            fin--;
        }
    }
    public static void cIzq(char [] arr, int ini){
        for (int i=ini; i<MAXC-1; i++)
            arr[i]=arr[i+1];
    }
    public static void mostrarMatriz(char[][] matriz){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0;j<MAXC; j++){
                System.out.print(matriz[i][j] + "|");
            }
        }
    }
}
