package Practica5;

public class ejercicio30 {
    final static int MAX=20, SEPA=0, MAX2=2;
    public static void main(String[] args) {
        /*
        Hacer un programa que reemplace de un arreglo A todas las
        ocurrencias de una secuencia patrón dada en un arreglo P, por la
        secuencia contenida en el arreglo R de igual tamaño.
         */
        
        int [] A={0,0,2,3,2,3,0,2,3,2,3,0,2,3,7,0,0,2,3,0};
        int [] P={2,3};
        int [] R={34,66};

        int inicio=0, fin=-1, j=0;

        mostrarArreglo(A);

        while (inicio<MAX){
            inicio=buscarIni(A, fin+1);
            System.out.println("inicio: " + inicio);
            if (inicio<MAX){
                fin=buscarFin(A, inicio);
                System.out.println("fin: " + fin);
                for (int i= inicio; i<=fin-MAX2+1; i++){
                    boolean esP=true;
                    while (j<MAX2 && esP){
                        if (A[i+j] != P[j]){
                            esP=false;
                        }
                        j++;
                    }
                    if (esP){
                        for (int k=0; k<MAX2; k++){
                            A[i+k]=R[k];
                        }
                        i+=MAX2-1;
                    }
                }
                /*
                if (A[inicio]==P[0] && A[inicio+1]==P[1]){
                    for (int i=inicio; i<=fin; i++){
                        A[i]= R[0];
                        while (j<=fin){
                            j++;
                            j++;
                            A[j]=R[1];
                        }
                    }
                    fin=inicio;
                */
                    /*
                    cambiarE(A, R, inicio, fin);
                    fin=inicio;
                    */
            }
        }
    

        mostrarArreglo(A);


    }
    public static void cambiarE(int [] arr,int [] p, int ini, int fin){
        for (int i=ini; i<=fin; i++){
            arr[i]= p[0];
            arr[i+1] = p[1];
        }
    }
    public static void mostrarArreglo (int [] arr){
        for (int i=0; i<MAX; i++){
            System.out.print(arr[i] + "|");
        }
        System.out.println('\n');
    }
    public static int buscarIni (int [] arr, int ini){
        while (ini<MAX && arr[ini]==SEPA)
            ini++;
        return ini;
    }
    public static int buscarFin (int [] arr, int ini){
        while (ini<MAX && arr[ini]!=SEPA)
            ini++;
        return ini-1;
    }
    public static void cIzq (int []arr, int ini){
        for (int i=ini; i<MAX-1; i++){
            arr[i]=arr[i+1];
        }
    }
}
