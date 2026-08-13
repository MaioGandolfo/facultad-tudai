public class ej3 {
    final static int MAXF=4, MAXC=16;
    final static char SEPA=' ';
    public static void main(String[] args) {
        
        char[][] matriz = {
            {' ','e', 'l', ' ', 'a', 'g', 'e', 'n', 't', 'e', ' ', 'm', 'a', 'i', 'o', ' '},
            {' ','J', 'a', 'm', 'e', 's', ' ', 'B', 'o', ' ', 's', 'e', ' ', ' ', ' ', ' '},
            {' ','e', 'n', 'c', 'u', 'e', 'n', 't', 'r', 'a', ' ', 'e', 'n', ' ', ' ', ' '},
            {' ','c', 'o', 'l', 'o', 'n', 'i', 'a', ' ', 'M', 'a', 'i', 'o', ' ', ' ', ' '}
        };

        int totalEncritadas=0;

        for (int i=0; i<MAXF; i++){
            int encriptadas=procesarFila(matriz[i]);
            totalEncritadas+=encriptadas;
        }
        System.out.println("se encriptaron " + totalEncritadas + " secuencias.");

        mostrarMatriz(matriz);
    }
    public static int procesarFila(char[] arr){
        int ini=0, fin=-1, contador=0;
        while (ini<MAXC){
            ini=buscarIni(arr, fin+1);
            if (ini<MAXC){
                fin=buscarFin(arr, ini);
                if (esMayus(arr[ini])){
                    encriptarSec(arr, ini, fin);
                    contador++;
                }
            }
        }
        return contador;
    }
    public static boolean esMayus (char l){
        return l>='A' && l<='Z';
    }
    public static void encriptarSec(char[] arr, int ini, int fin){
        int i=ini, j=duplicarVocales(arr, ini, fin);
        char aux;
        while (i<j){
            aux=arr[i];
            arr[i]=arr[j];
            arr[j]=aux;
            i++;
            j--;
        }
    }
    public static void cDer(char [] arr, int pos){
        for (int i=MAXC-1; i>pos; i--)
            arr[i]=arr[i-1];
    }
    public static int duplicarVocales(char[] arr, int ini, int fin){
        while (ini<=fin){
            if (esVocal(arr[ini])){
                cDer(arr, ini);
                ini+=2;
                fin++;
            }
            else 
                ini++;
        }
        return fin;
    }
    public static boolean esVocal (char l){
        switch (l) {
            case 'a','e','i','o','u':
                return true;
            default:
                return false;
        }
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
    public static void mostrarMatriz(char [][]m){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++)
                System.out.print(m[i][j] + "|");
        }
    }
}
