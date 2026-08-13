package Practica3;

public class ejercicio7 {
    public static void main(String[] args) {
        /*Escribir un programa que mientras el usuario cargue desde
        teclado un número entero distinto de 0, imprima por pantalla la
        suma que se obtiene de invocar un método que calcula la
        sumatoria de los primeros 200 números naturales (son números
        enteros entre 1 y 200). */

        int num= 0;

        System.out.println("Ingrese un numero distinto de 0.");
            num=Utils.leerInt();
            num=numeroDistintoA0(num);

        int suma=Suma();

        System.out.println("la suma de los 1eros 200 numeros naturales es: " + suma);
    }
    public static int numeroDistintoA0 (int n){
        while (n > -1 && n < 1){
            System.out.println("ingrese un numero distinto a 0.");
                n=Utils.leerInt();
        }
        return n;
    }
    public static int Suma(){
        int suma=0;
        final int MAX=200;
        for (int i=1; i<=MAX; i++){
            suma += i;
        }
        return suma;
    }
}
