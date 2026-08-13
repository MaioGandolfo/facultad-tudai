package Practica3;

public class ejercicio18 {
    public static void main(String[] args) {
        /*Escribir un programa que imprima por pantalla los números
        perfectos que existen entre 2 y 10000. Un número perfecto es
        aquel cuya suma de sus divisores (excepto sí mismo) es igual al
        propio número. Ejemplo: 6 es un número perfecto dado que sus
        divisores (excepto sí mismo) son 1, 2 y 3 cuya suma da 6. En
        cambio 12, no es un número perfecto dado que sus divisores
        (excepto sí mismo) 1, 2, 3, 4 y 6 cuya suma es 16 */

        int n=0;

        n=Valido(n);

        if (Perfecto(n)){
            System.out.println("el numero " + n + " es perfecto");
        } else {
            System.out.println("el numero " + n + " no es perfecto");
        }
    }
    public static int Valido (int a){
        while (a < 2 || a > 10000){
            System.out.println("Ingrese un numero entre 2 y 10000");
                a=Utils.leerInt();
        } return a;
    }
    public static boolean Perfecto (int a){
        int suma=0;
        for (int i=1; i<a; i++){
            if (a%i==0){
                suma+=i;
            }
        } return suma==a;
    }
}
