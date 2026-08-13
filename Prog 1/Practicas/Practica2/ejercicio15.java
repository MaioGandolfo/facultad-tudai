package Practica2;

public class ejercicio15 {
    public static void main(String[] args) {
        //Pedir por consola el ingreso de números enteros. Cuando se
        //ingrese un 0 se debe terminar el programa informando el
        //promedio de los números ingresados, cuál fue el mayor número y
        //cuál fue el menor número.
        
        int num, menor=Integer.MAX_VALUE, mayor=Integer.MIN_VALUE, suma=0, cantidad=0;

        System.out.println("Ingres un numero entero (no ingrese 0).");
            num=Utils.leerInt();

        while (num != 0){
            suma += num;
            cantidad++;

            if (num > mayor) {
                mayor = num;
            } else if (num < menor) {
                menor= num;
            }
            System.out.println("Ingrese otro numero entero (Ingrese 0 para terminar.)");
                num=Utils.leerInt();
        }
        if (cantidad > 0 ){
            double promedio = (double) suma / cantidad; //se calcula el promedio (double) no me descarta la parte decimal del promedio.
            System.out.println("El promedio de los numeros integrados es: " + promedio + '\n' + "El numero mayor ingresado fue: " + mayor + '\n' + "El numero menor ingresado fue: " + menor);
        } else {
            System.out.println("no se ingresaron numeros.");
        }


    }
}
