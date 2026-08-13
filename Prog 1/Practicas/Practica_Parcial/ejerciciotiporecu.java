public class ejerciciotiporecu {
    final static int N=3, M=23;
    public static void main(String[] args) {
        char[][] matriz = {
            {'-', 'S', 'u', 'p', 'e', 'r', ' ', 's', 'e', 'c', 'r', 'e', 't', 'o', ':', '-', '-', '-', '-', '-', '-', '-', '-',},//3
            {'¡', '¡', 'n', 'o', ' ', 'c', 'o', 'r', 't', 'a', 'r', ' ', 'f', 'o', 'r', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},//x
            {' ', 'c', 'o', 'n', ' ', 'r', 'e', 't', 'u', 'r', 'n', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!',} //23
        };


        int cantEncritaciones=0;
        for (int i=0; i<N; i++){
            cantEncritaciones=encriptarFila(matriz[i]);
        }
        System.out.println("hubo " + cantEncritaciones + " encriptaciones");
    }
    public static int encriptarFila (char [] arr){
        int ini=0, fin=-1, cantEncrip=0, cantTotal=0;
        while (ini<M){
            ini=buscarIni(arr, fin+1);
            if (ini<M){
                fin=buscarFin(arr, ini);
                cantEncrip=encriptarSecuencia(arr, ini, fin);
                fin=fin+cantEncrip;
                cantTotal++;
            }
        }
        return cantTotal;
    }
    public static int encriptarSecuencia(char [] arr, int ini, int fin){
        int tam=fin-ini+1, cantEncrip=0;
        while (ini<=fin){
            if (esVocal(arr[ini])){
                arr[ini]= (char)arr[ini + tam];
                ini++;
            }
            else{
                cDer(arr, ini);
                ini+=2;
                fin++;
            }
            cantEncrip++;
        }
        return cantEncrip;
    }
    public static boolean esVocal(char ini){
        switch (ini) {
            case 'A','E','I','O','U' :
                return true;
            case 'a','e','i','o','u' :
                return true;
            default:
                return false;
        }
    }
    public static int buscarIni(char[] arr, int ini){
        int i=ini;
        while (i<M && !letra(arr[i]))
            i++;
        return i;
    }
    public static int buscarFin(char[] arr, int i){
        while (i<M && letra(arr[i]))
            i++;
        return i-1;
    }
    public static boolean letra(char l){
        return l>='a' && l<='z' || l>='A'&& l<='Z';
    }
    public static void cDer (char[] arr, int pos){
        for (int i=M-1; i>pos; i--){
            arr[i]=arr[i-1];
        }
    }
}
