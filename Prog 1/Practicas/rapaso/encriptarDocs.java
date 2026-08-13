public class encriptarDocs {
    final static int MAXF=4, MAXC=16;
    final static char SEPA=' ';
    public static void main(String[] args) {
        char[][]matriz={
            {' ','e','l',' ','a','g','e','n','t','e',' ',' ',' ',' ',' ',' '},
            {' ','J','a','m','e','s',' ','B','o',' ','s','e',' ',' ',' ',' '},
            {' ','e','n','c','u','e','n','t','r','a',' ','e','n',' ',' ',' '},
            {' ','C','o','l','o','n','i','a',' ',' ',' ',' ',' ',' ',' ',' '}
        };

        for (int i=0; i<MAXF; i++)
            procesarFila(matriz[i]);

        mostrarMatriz(matriz);
    }
    public static void procesarFila(char [] arr){
        int ini=0, fin=-1;
        while (ini<MAXC){
            ini=buscarIni(arr, fin+1);
            if(ini<MAXC){
                fin=buscarFin(arr, ini);
                if(esMayus(arr[ini])){
                    fin=encriptarSec(arr, ini, fin);
                }
            }
        }
    }
    public static int encriptarSec(char[] arr, int ini, int fin){
        int i=ini;
        while (i<=fin){
            if(esVocal(arr[i])){
                cDer(arr, i);
                fin++;
                i+=2;
            }
            else
                i++;
        }
        invertirSec(arr, ini, fin);

        return fin;
    }
    public static void cDer(char [] arr, int ini){
        for(int i=MAXC-1; i>ini; i--)
            arr[i]=arr[i-1];
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
    public static boolean esMayus(char l){
        return l>='A' && l<='Z';
    }
    public static boolean esVocal(char l){
        switch (l) {
            case 'a','A','e','E','i','I','o','O','u','U':
                return true;
            default:
                return false;
        }
    }
    public static void invertirSec(char[] arr, int ini, int fin){
        int i=ini, j=fin;
        char aux;
        while (i<j){
            aux=arr[i];
            arr[i]=arr[j];
            arr[j]=aux;
            i++;
            j--;
        }
    }
    public static void mostrarMatriz (char [] [] m){
        for(int i=0; i<MAXF; i++){
            System.out.println();
            for(int j=0; j<MAXC; j++)
                System.out.print(m[i][j] + "|");
        }
    }
}