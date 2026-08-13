package Practica5;

public class ejercicio28 {
    final static int MAX=20, SEPA=0, NPAT=2, MPAT=3;
    public static void main(String[] args) {
        /*
        Hacer un programa que elimine de un arreglo todas las
        ocurrencias de una secuencia patrón dada por otro arreglo.
        */

        int [] arr={0,0,2,3,2,3,0,2,3,2,2,0,2,1,7,0,0,6,5,0};

        mostrarArreglo(arr);

        int inicio=0, fin=-1;
        while (inicio<MAX){
            inicio=buscarIni(arr, fin + 1);
            System.out.println("inicio: " +inicio);
            if (inicio<MAX){
                fin=buscarFin(arr, inicio);
                System.out.println("Fin: " + fin);

                if (arr[inicio]==NPAT && arr[inicio+1]==MPAT){
                    eliminarPatron(arr, inicio, fin);
                    fin=inicio;
                }
            }
        }

        mostrarArreglo(arr);

    }
    public static void mostrarArreglo(int [] arr){
        for (int i=0; i<MAX; i++)
            System.out.print(arr[i] + "|");
        System.out.println('\n');
    }
    public static int buscarFin(int [] arr, int ini){
        while (ini<MAX && arr[ini]!=SEPA)
            ini++;
        return ini-1;
    }
    public static int buscarIni(int [] arr, int i){
        while(i<MAX && arr[i]==SEPA)
            i++;
    return i;
    }
    public static void cIzq (int [] arr, int ini){
        for (int i=ini; i<MAX-1; i++){
            arr[i]=arr[i+1];
        }
    }
    public static void eliminarPatron(int [] arr, int ini, int fin){
        //0,0,2,3,2,3,0,2,3,2,2,0,2,1,7,0,0,6,5,0
        while(fin>=ini){
            cIzq(arr, fin);
            fin--;
        }
    }
}
