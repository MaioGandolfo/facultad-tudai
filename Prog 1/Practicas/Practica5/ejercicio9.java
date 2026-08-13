package Practica5;

public class ejercicio9 {
    final static int MAX=7;
    public static void main(String[] args) {
        /* 
        Dado un arreglo de caracteres, determinar si en el arreglo existe al
        menos una letra repetida. 
        */

        char [] arrChar= new char [MAX];

        char letra=' ';

        cargarArreglo(arrChar, letra);

        if (elementoRepetido(arrChar, letra))
            System.out.println("hay al menos UN elemento repetido");
        else 
            System.out.println("no hay un elemento repetido");




    }
    public static void cargarArreglo(char [] arr, char a){
        for (int i=0; i<MAX; i++){
            System.out.println("ingrese un caracter.");
                a=Utils.leerChar();
                arr[i]=a;
        }
    } 
    public static boolean elementoRepetido(char [] arr, char a){
        int i=0;
        while (i<MAX-1 && (arr[i]!=a)){//si en la posicion de i hay un elemento indistinto a la letra que ingresé se incrementa i
            i++;
        }
        if (i==MAX-1)
            return true;
        else 
            return false;
    }
}
