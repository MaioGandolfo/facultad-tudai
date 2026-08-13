package Practica5;

public class ejercicio7Rogger {
    public static void main(String[] args) {
        System.out.println("arreglo original: ");
        int [] array = {45,76,34,23,87,12,8,7,5,23,56};
        for (int num : array){
            System.out.print(num + " ");
        }
        

        System.out.println("ingrese le numero que quiere buscar en el arreglo");
            int n=Utils.leerInt();

        System.out.println("ingrese el numero por el que quiera multiplicar");
            int m=Utils.leerInt();

        posiciones(array, n);
        multiplicar(array, n ,m);   
    }

    public static void posiciones(int[] array, int n){
        int [] posiciones=new int [array.length];
        int contador = 0;

        for (int i=0; i< array.length; i++){
            if (array[i]==n){
                posiciones[contador] = 1;
                contador++;
            }
        }
        System.out.print("posiciones del numero " + n + ": ");
        for(int i = 0; 1 < contador; i++){
            System.out.println(posiciones[i]+ " ");
        }
        System.out.println();
    }
    public static void multiplicar(int[] array, int n, int m){
        for(int i = 0; i<array.length; i++){
            if(array[i]==n){
                array[i] *=m;
            }
        }
        System.out.println("arreglo modificado: ");
        for (int i=0 ;i<array.length; i++){
            System.out.println(array[i] + "|");
        }

    }
}
