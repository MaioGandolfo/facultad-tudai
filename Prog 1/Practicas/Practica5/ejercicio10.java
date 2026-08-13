package Practica5;

public class ejercicio10 {
    final static int MAX=10;
    public static void main(String[] args) {
        /*
        Hacer un programa que verifique en un arreglo si tiene al
        menos N números primos. N debe ser ingresado por el usuario.
        Reutilizar los métodos ya desarrollados.
         */

        int [] array={1, 3, 2, 5, 11, 7, 22, 25, 40, 50};

        System.out.println("ingrese cuando numeros primos quiere saber que hay");
            int n=Utils.leerInt();

        if (Nprimos(array, n) > n)
            System.out.println("hay más de " + n + " numeros primos en el arreglo.");
        else if (Nprimos(array, n) == n)
            System.out.println("hay " + n + " numeros primos en el arreglo.");
        else 
            System.out.println("hay menos de " + n + " o ningun numero primos en el arreglo.");
        
    }
    public static boolean esPrimo(int a){
        if (a<=1)
            return false;
        for (int i=2; i<= Math.sqrt(a); i++){
            if (a % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int Nprimos (int [] arr, int n){
        int contador=0;
        for (int i=0 ;i<MAX; i++){
            if (esPrimo(arr[i])){
                contador++;
            }
        }
        if (contador >=n){
            return contador;
        } else 
            return contador;

    } 
}
