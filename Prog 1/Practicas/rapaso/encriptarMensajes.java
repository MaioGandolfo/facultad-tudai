public class encriptarMensajes {
    final static int MAXF=3, MAXC=23;
    public static void main(String[] args) {
        char [] [] matriz={
            {'-','S','u','p','e','r',' ','s','e','c','r','e','t','o',':','-','-','-','-','-','-','-','-'},
            {'¡','¡','n','o',' ','c','o','r','t','a','r',' ','f','o','r',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ','c','o','n',' ','r','e','t','u','r','n','!','!','!','!','!','!','!','!','!','!','!','!'}
        };

        int encriptadasTotal=0, encriptadas;

        for (int i=0; i<MAXF; i++){
            encriptadas=procesarFila(matriz[i]);
            encriptadasTotal+=encriptadas;
        }

        System.out.println("se encriptaron " + encriptadasTotal + " palabras.");

        mostrarMatriz(matriz);
    }
    public static int procesarFila(char [] arr){
        int ini=0, fin=-1, cant=0;
        while(ini<MAXC){
            ini=buscarIni(arr, fin+1);
            if(ini<MAXC){
                fin=buscarFin(arr, ini);
                int tam=fin-ini+1;
                fin=procesarSec(arr, tam, ini, fin);
                cant++;
            }
        }
        return cant;
    }
    public static int procesarSec(char[] arr, int tam, int ini, int fin){
        while(ini<=fin){
            if(esVocal(arr[ini])){
                char c=arr[ini];
                c=(char)(c+tam);
                arr[ini]=c;
                ini++;
            }
            else{
                char letra=arr[ini];
                cDer(arr, ini);
                arr[ini+1]=letra;
                fin++;
                ini+=2;
            }
        }
        return fin;
    }
    public static boolean esVocal (char l){
        switch (l) {
            case 'a','A','e','E','i','I','o','O','u','U':
                return true;
            default:
                return false;
        }
    }
    public static void cDer(char[] arr, int ini){
        for(int i=MAXC-1; i>ini; i--)
            arr[i]=arr[i-1];
    }
    public static int buscarIni(char [] arr, int i){
        while (i<MAXC && !esLetra(arr[i]))
            i++;
        return i;
    }
    public static int buscarFin(char [] arr, int i){
        while(i<MAXC && esLetra(arr[i]))
            i++;
        return i-1;
    }
    public static boolean esLetra(char l){
        return (l>='a' && l<='z') || (l>='A' && l<='Z');
    }
    public static void mostrarMatriz(char[][] m){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++)
                System.out.print(m[i][j] + "|");
        }
    }
}
