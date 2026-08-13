package Practica3;

public class ejercicio11 {
    public static void main(String[] args) {
        /*Escribir un método que retorne el mayor de dos números. Usar
        ese método para calcular el máximo de una serie de números
        ingresados por el usuario (20 números en total).
        */
        int maximo=Integer.MIN_VALUE;// para guardar un dato mayor hay que inicializarlo en el minimo valor posible de la variable
        int numero=0;
        final int MAX=20;

        System.out.println("Ingrese 20 numeros.");

        for (int i=1; i<=MAX; i++){
            System.out.println("ingrese el numero " + i + ":");
            numero=Utils.leerInt();
            maximo=mayor(maximo, numero);
        }

        System.out.println("El mayor numero ingresado fue: " + maximo);
    }
    public static int mayor(int a, int b){
        if (a > b){
            return a;
        } else { return b; }
    }
}

