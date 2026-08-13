public class prefinal {
    final static int MAXF=4, MAXC=39, MAX=5;
    public static void main(String[] args) {
        
        char[][] matriz = {
            {'-','Y','o',' ','m','o','d','u','l','a','r','i','z','o',':','-','-','-','-','-','-','-','-',' ',' ',' ',' ',' ',' ',' ',' ','/','/','/','/','/','/','/','/'},
            {'¡','p','e','r','o',' ','s','i',' ','n','o',' ','l','o',' ','h','a','g','o',',',' ',' ',' ',' ',' ',' ',' ',' ',' ','-','-','-','-','-','-',' ',' ',' ',' '},
            {' ','e','l',' ','c','a','o','s',' ','d','e',' ','m','i',' ','c','o','d','i','g','o','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
            {'¡','c','a','r','o',' ','l','o',' ','p','a','g','o','!','!','!','!','!','!','!','!','!','!','!','!','!','!','!',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '}
        };

        char [] arrC={'p','m','l','p','t'};

        //System.out.println(matriz[0].length + " Y " + matriz[1].length + " Y " + matriz[2].length + " Y " + matriz[3].length);4

        int menEncriptadas=Integer.MAX_VALUE, fila=0;
        for (int i=0; i<MAXF; i++){
            int encriptadas=procesarFila(matriz[i], arrC);
            if (encriptadas<menEncriptadas){
                menEncriptadas=encriptadas;
                fila=i;
            }
        }
        System.out.println("la fila " + fila + " hubo la menor cantidad de encriptaciones");

        mostrarMatriz(matriz);
    }
    public static int procesarFila(char[] arr, char[] arrC){
        int ini=0, fin=-1, contador=0;
        while (ini<MAXC){
            ini=buscarIni(arr, fin+1);
            if (ini<MAXC){
                fin=buscarFin(arr, ini);
                fin=procesarSec(arr, arrC, ini, fin);
                contador++;
            }
        }
        return contador;
    }
    public static int procesarSec(char[] arr, char[] arrC, int ini, int fin){
        int vocal=0;
        while (ini<=fin){
            vocal=esVocal(arr[ini]);
            if (vocal>=0){
                encriptar(arr, arrC, ini, vocal);
                ini+=3;
                fin+=2;
            }
            else 
                ini++;
        }
        return fin;
    }
    public static void encriptar (char [] arr, char[] arrC, int ini, int vocal){
        char posVocal=arr[ini], letra=arrC[vocal];
        for (int i=0; i<2; i++)
            cDer(arr, ini);

        arr[ini+1]=letra;
        arr[ini+2]=posVocal;
    }
    public static int esVocal(char l){
        switch (l) {
            case 'A','a':
                return 0;
            case 'E','e':
                return 1;
            case 'I','i':
                return 2;
            case 'O','o':
                return 3;
            case 'U','u':
                return 4;
            default:
                return -1;
        }
    }
    public static void cDer(char[] arr, int pos){
        for (int i=MAXC-1; i>pos; i--)
            arr[i]=arr[i-1];
    }
    public static int buscarIni(char[] arr, int i){
        while (i<MAXC && !esLetra(arr[i]))
            i++;
        return i;
    }
    public static int buscarFin (char[] arr, int i){
        while (i<MAXC && esLetra(arr[i]))
            i++;
        return i-1;
    }
    public static boolean esLetra(char l){
        return l>='A' && l<='Z' || l>='a' && l<='z';
    }
    public static void mostrarMatriz (char[] [] m){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++)
                System.out.print(m[i][j] + "|");
        }
    }
}
