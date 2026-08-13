package Practica5;

public class ejercicio7 {
    final static int MAX=10;
    public static void main (String[] args){
        /*
        Hacer un programa que dado un arreglo de enteros y un número
        N, genere un arreglo con las posiciones donde se encuentra dicho
        número. A continuación, multiplicar por un número M todas las
        ocurrencias del número N en el arreglo original.
        */

        int [] arrA=new int [MAX];
        
        int num=0, N=0, M=5, posi=0;
        
        arreglo(arrA, num);//ingreso los numeros al arreglo
        
        //mostrarArreglo(arrA);
        
        System.out.println("ingres el numero del que quiera saber la posición.");
        N=Utils.leerInt();
        
        int aux=0, cant=cantPos(arrA, N);
        
        int [] arrB=new int [cant];
        
        
        
        posi=saberPos(arrA, N, arrB);
        
        //System.out.println("la posicion de " + N + " en el arreglo es: " + posi);
        


        if (posi<MAX){
            for (aux=0; aux < cant; aux++){
                arrB[aux]=posi;
            }
        }
        mostrarArreglo(arrB);

    }public static int cantPos (int [] arr, int a){
        int contador=0;
        for (int i=0; i<MAX; i++){
        
            if (arr[i]==a){
                contador++;
            }
        } return contador;
    }
    public static int saberPos (int [] arrA, int n, int [] arrB){
        int pos=0, ini=0;

        
        while(pos<MAX){
            if (arrA[pos]==n){
                arrB[ini]=pos;
                ini++;
            }
            pos++;
        }
        
        return MAX-6;
    }
    public static void mostrarArreglo(int [] arr){
        for (int i=0; i<MAX; i++){
            System.out.print(arr[i] + "|");
        }
    }
    public static void arreglo(int [] arr, int a){
        for (int i=0; i<MAX; i++){
            System.out.println("ingrese un numero entero.");
                a=Utils.leerInt();
            arr[i]=a;
        }
    }
}
