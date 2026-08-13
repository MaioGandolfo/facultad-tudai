public class practicaRecu {
    final static int MAXC=20, MAXF=7, SEPA=0;
    public static void main(String[] args) {
        double p=0.5;
        
        int [][] entrenamiento={{1234,222}, {2222}};
        int [] dias={1,2,5,0,0,0,0};

        int i=0, diascumplidos=0, diasEnt=0;
        while (i<MAXF && dias[i]!=SEPA){
            diasEnt++;
            if (progresivo(entrenamiento[dias[i]-1])){
                diascumplidos++;
                cIzq(dias, i);
            }
            else 
                i++;
        }
        informar(diascumplidos, p, diasEnt);
    }
    public static boolean progresivo(int [] arr){
        int ini=0, fin=-1; boolean progresiva=true;
        while (ini<MAXF && progresiva){
            ini=buscarIni(arr, fin+1);
            if (ini<MAXF){
                fin=buscarFin(arr, ini);
                progresiva=esProgresiva(arr, ini, fin);
            }
        }
        return progresiva;
    }
    public static boolean esProgresiva(int [] arr, int ini, int fin){
        while (ini<fin && arr[ini]>=arr[ini+1])// al analizar ubna sec progresiva o decreciente es ini<fin
            ini++;
        return ini==fin;
    }
    public static int buscarIni(int [] arr, int i){
        while (i<MAXF && arr[i]==SEPA)
            i++;
        return i;
    }
    public static void cIzq (int[] arr, int pos){
        for (int i=pos; i<MAXF-1; i++)
            arr[i]=arr[i+1];
    }
    public static void informar (int diasC, double p, int diasEnt){
        if ((double)(diasC/diasEnt)>=p)
            System.out.println("cumplió");
        else 
            System.out.println("no cumplió");
    }
    public static int buscarFin(int [] arr, int i){
        while (i<MAXF && arr[i]!=SEPA)
            i++;
        return i-1;
    }
}
