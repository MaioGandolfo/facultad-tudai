package Practica5;

public class ejercicio11 {
    final static int MAXA=6;
    final static int MAXB=8;
    public static void main(String[] args) {
        /*
        Dado dos arreglos de números enteros A y B determinar si
        todos los números almacenados en el arreglo A están presentes
        en el arreglo B
         */
        int [] A = {10,20,5,22,40,51};
        
        int [] B = {10,20,5,22,40,51,7,55};

        mostrarArreglo(A);

        System.out.println(" ");
        
        mostrarArreglo(B);

        System.out.println(" ");
        
        if (AenB(A,B))
            System.out.println("todos los elementos del arreglo a estan en el arreglo b");
        else 
            System.out.println("no todos los elementos del arreglo a estan en b");

    }
    public static boolean AenB(int [] A, int [] B){
        int contador=0;
        for (int i=0; i<MAXA; i++){
            for (int ib=0; ib<MAXB; ib++){
                if (A[i]==B[ib])
                    contador++;
            }
        }
        if (contador==MAXA-1)
            return false;
        else 
            return true;
    }
    public static void mostrarArreglo(int [] arr){
        System.out.println("así quedó el arreglo.");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "|");
        }
    }
}
