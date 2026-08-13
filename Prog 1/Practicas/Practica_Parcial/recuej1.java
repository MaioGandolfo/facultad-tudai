public class recuej1 {
    final static int MAXF=3, MAXC=20, R=2;
    final static char SEPA='x';
    public static void main(String[] args) {
        char [][] huerta={
            {'x','t','a','C','M','O','t','a','a','t','O','C','t','t','a','O','M','C','t','x'},
            {'x','r','r','r','C','C','O','O','r','r','C','r','G','G','G','r','r','x','x','x'},
            {'x','m','G','m','h','h','L','G','G','O','h','h','m','m','O','B','M','C','x','x',}
            };

        char [] buenas={'C','O','L'};

        int contador=0;

        for (int i=0; i<MAXF; i++){
            int malezaEliminada=procesarFila(huerta[i], buenas);
            contador+=malezaEliminada;
        }
        System.out.println("la cantidad de maleza eliminada fue: " + contador);
        mostrarMatriz(huerta);

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
    public static int procesarFila(char [] arr, char[] buenas){
        int ini=0, fin=-1, contador=0;
        while (ini<MAXC){
            ini=buscarIni(arr, fin+1);
            if (ini<MAXC){
                fin=buscarFin(arr, ini);
                boolean eMaleza=false;
                while(!eMaleza){
                    int malezaE=buscarMaleza (arr, buenas, ini, fin);
                    contador+=malezaE;
                    if (malezaE==0)
                        eMaleza=true;
                }
            }
        }
        return contador;
    }
    public static int buscarMaleza(char[] arr, char[] buenas, int i, int fin){
        int contador=0;
        while (i<=fin){
            if(!encontrarMaleza(arr[i], buenas)){
                cIzq(arr, i);
                fin--;
                contador++;
            }
            else
                i++;
        }
        return contador;
    }
    public static boolean encontrarMaleza(char l , char [] buenas){
        int i=0; boolean existe=false;
        while (i<MAXF && !existe ){
            if(l==buenas[i] || l>='a' && l<='z')
                existe=true;
            else 
                i++;
        }
            return existe;
            //'x','t','a','C','M','O','t','a','a','t','O','C','t','t','a','O','M','C','t','x'
    }
    public static void cIzq(char [] arr, int pos){
        for (int i=pos; i<MAXC-1; i++)
            arr[i]=arr[i+1];
    }
    public static void mostrarMatriz(char [][]m){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++)
                System.out.print(m[i][j] + "|");
        }
    }
}
