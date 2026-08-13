package Practica5;

public class ejercicio21 {
    final static int MAX=10;
    public static void main(String[] args) {
        /*
        Hacer un programa que inserte un elemento en un arreglo
        (ordenado decrecientemente) de tamaño MAX=10
        */

        int [] array={60,40,30,23,32,22,42,47,4,10};

        System.out.println("ingrese un numero");
            int num=Utils.leerInt();
        
        //ingresarNum(array, num);
        //seleccion(array);

        
        burbujeo(array);

        insertarNum(array, num);

        burbujeo(array);
        
        mostrarArreglo(array);

    }public static void insertarNum (int [] arr, int num){
        int i=0;
        while (i<MAX && arr[i] > num){
            i++;
        }
        cDer(arr, i);
        if (i<MAX)
            arr[i] = num;
    }
    public static void mostrarArreglo(int[] arr){
        for (int i=0; i<MAX; i++){
            System.out.print(arr[i]+"|");
        }
    }
    public static void cIzq (int [] arr, int pos){
        for (int i=pos; i<MAX-1; i++){
            arr[i] = arr[i+1];
        }
    }
    public static void cDer(int [] arr, int pos){
        for (int i=MAX-1; i>pos; i--){
            arr[i] = arr[i - 1];
        }
    }
    public static void burbujeo(int [] arr){
        //este metodo para ordenar un arreglo desordenado es mucho mas entendible
        int temp;
        for (int i=1; i<MAX; i++){
            for (int j=0; j<MAX-1; j++){
                if (arr[j] < arr [j+1]){// si queiero que lo haga ascendente arr[j] > arr[j+1]
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
