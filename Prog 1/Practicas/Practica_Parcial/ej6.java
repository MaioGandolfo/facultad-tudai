public class ej6 {
    final static int MAXF=3, MAXC=23;
    public static void main(String[] args) {

        /*
         *  ● Desplazar cada vocal tantas posiciones en el abecedario como caracteres tenga la palabra.
         *  ● Duplicar cada consonante.
         */
        char[][] matriz = {
            {'-','S','u','p','e','r',' ','s','e','c','r','e','t','o',':','-','-','-','-','-','-','-','-'},
            {'¡','¡','n','o',' ','c','o','r','t','a','r',' ','f','o','r',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ','c','o','n',' ','r','e','t','u','r','n','!','!','!','!','!','!','!','!','!','!','!','!'}
        };

        for (int i=0; i<MAXF; i++)
            procesarFila(matriz[i]);

        mostrarMatriz(matriz);
    }
    public static int procesarFila(char [] arr){
        int ini=0, fin=-1;
        while (ini<MAXC){
            ini=buscarIni(arr, fin+1);
            if (ini<MAXC){
                fin=buscarFin(arr, ini);
                int tam=fin-ini+1;
                fin=procesarSec(arr, ini, fin, tam);
            }
        }
        return fin;
    }
    public static int procesarSec(char[] arr, int i, int fin, int tam){
        while (i<=fin){
            if (esVocal(arr[i])){
                //desplazarVocal(arr, i, tam);
                char letra=arr[i]; letra=(char)(letra+tam);
                arr[i]=letra;
                i++;
            }
            else{
                char conso=arr[i];
                cDer(arr, i);
                arr[i+1]=conso;
                fin++;
                i+=2;
            }
        }
        return fin;
    }
    public static boolean esVocal (char l){
        switch (l) {
            case 'a','e','i','o','u':
                return true;
            case 'A','E','I','O','U':
                return true;
            default:
                return false;
        }
    }
    public static void cDer (char[] arr, int pos){
        for (int i=MAXC-1; i>pos; i--)
            arr[i]=arr[i-1];
    }
    public static boolean esLetra (char l){
        return (l>='a' && l<='z') || (l>='A' && l<='Z');
    }
    public static int buscarIni(char [] arr, int i){
        while (i<MAXC && !esLetra(arr[i]))
            i++;
        return i;
    }
    public static int buscarFin (char[] arr, int i){
        while (i<MAXC && esLetra(arr[i]))
            i++;
        return i-1;
    }
    public static void mostrarMatriz (char[][]m){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++)
                System.out.print(m[i][j] + "|");
        }
    }
}
