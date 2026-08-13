public class ej12 {
    final static int MAXF=4, MAXC=20, CONT=2;
    final static char SEPA=' ';
    public static void main(String[] args) {
        
        char[][] matriz = {
            {' ',' ','a','b','c',' ',' ','d','e','f',' ','g','h',' ',' ','i','j','k',' ',' '},
            {' ','x','y','z',' ',' ','m','n',' ',' ','o','p','q',' ',' ',' ','r','s',' ',' '},
            {' ','a','b',' ','c','d','e',' ',' ','f','g',' ','h','i','j',' ',' ',' ','k',' '},
            {' ',' ','l','m','n',' ','o',' ','p','q',' ',' ','r','s','t',' ','u','v',' ',' '}
        };

        for (int i=0; i<MAXF; i++)
            procesarFila(matriz, i);
        
    }
    public static void procesarFila (char [] [] matriz, int fila){
        int ini=MAXC, fin=MAXC-1, contador=0;
        boolean secuencia=false;
        while (fin>0 && !secuencia){
            fin=buscarFin(matriz[fila], ini-1);
            if (fin>0){
                ini=buscarIni(matriz[fila], fin);
                contador++;
                if (contador==CONT){
                    System.out.println("en la fila " + fila + " el inicio y fin de la anteultima secuencia es :" + ini + "|" + fin);
                    secuencia=true;
                }
            }
            
        }
    }
    public static int buscarFin(char[] arr, int i){
        while (i>0 && arr[i]==SEPA)
            i--;
        return i;
    }
    public static int buscarIni(char[] arr, int i){
        while (i>0 && arr[i]!=SEPA)
            i--;
        return i+1;
    }
}
