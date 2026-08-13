package Practica6;

public class ejercicio16 {
    final static int MAXF=4, MAXC=20; 
    final static char SEPA=' ';
    public static void main(String[] args) {
        /*
         *  Para MAT1 y MAT2 elimine de cada secuencia el primer
         *  carácter vocal. 
         */

        char[][] MAT1 = {
            {' ', 'a', 'b', 'e', 'c', 'd', 'e', ' ', 'f', 'i', 'g', 'h', ' ', 'i', 'j', 'k', 'o', 'l', 'm', ' '},
            {' ', 'n', 'o', ' ', 'p', 'q', 'i', 'r', 'a', 't', ' ', 'u', 'v', 't', 'w', 'x', ' ', 'y', 'z', ' '},
            {' ', 'a', ' ', 'b', 'c', 'd', ' ', 'e', 'f', 'g', ' ', 'h', ' ', 'i', 'j', 'k', ' ', 'l', ' ', ' '},
            {' ', 'm', 'n', 'o', ' ', 'p', 'q', ' ', 'r', ' ', 's', 't', 'u', 'v', ' ', 'w', 'x', 'y', 'z', ' '}
        };

        char[][] MAT2 = {
            {' ', ' ', 'e', 'i', 'd', 'e', 't', ' ', ' ', 'y', 'a', 'e', 'i', 'o', 'u', 'y', ' ', ' ', ' ', ' '},
            {' ', ' ', 'i', 'q', 'e', ' ', 'r', 's', 't', 'a', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', 'b', 'c', 'a', ' ', 'f', 'k', 'e', 'i', 'l', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', 'n', 'o', 'a', ' ', 'q', 'p', 'r', 'b', 'k', ' ', ' ', 'b', 'c', 'e', 'f', 'h', ' ', ' ', ' '}
        };

        proceso(MAT1);
        proceso(MAT2);

        mostrarMatriz(MAT1);
        mostrarMatriz(MAT2);
    }
    public static void proceso(char [][] mat){
        for (int i=0; i<MAXF; i++){
            int ini=0, fin=-1;
            while (ini<MAXC){
                ini=buscarIni(mat[i], fin+1);
                if(ini<MAXC){
                    fin=buscarFin(mat[i], ini);
                    int posVocal = esVocal(mat[i], ini, fin);
                    if (posVocal >= 0){
                        cIzq(mat[i], posVocal);
                        fin--;
                    }
                }
            }
        }
    }
    public static void cIzq(char [] arr, int ini){
        for (int i=ini; i<MAXC-1; i++)
            arr[i]=arr[i+1];
    }
    public static int buscarIni(char [] arr, int i){
        while (i<MAXC && arr[i]==SEPA)
            i++;
        return i;
    }
    public static int esVocal(char [] arr, int ini, int fin){
        int vocal=-1;
        while (ini<=fin && vocal < 0){
            switch (arr[ini]) {
                case 'a','e','i','o','u':
                    vocal = ini;
                    break;
                default:
                    break;
            }
            ini++;
        }
        return vocal;
    }
    public static int buscarFin(char[] arr, int ini){
        while (ini<MAXC && arr[ini]!=SEPA)
            ini++;
        return ini-1;
    }
    public static void mostrarMatriz(char[][] m){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++)
                System.out.print(m[i][j] + "|");
        }
    }
}
