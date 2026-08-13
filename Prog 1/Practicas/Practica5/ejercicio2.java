package Practica5;

public class ejercicio2 {
    final static int MAX=10;
    public static void main(String[] args) {
        /*Hacer un programa que dado un arreglo ya cargado con 10
        enteros, calcule el promedio y lo muestre por la consola.
         */

        int [] arrEnt={10, 30, 22, 62, 44, 1, 78, 56, 90, 17};
        double promedio=calcularPromedio(arrEnt);

        System.out.println("el promedio del arreglo es: " + promedio + '\n' + "los elementos por arriba del promedio son: ");

        /* Con el mismo arreglo del ejercicio anterior informe por pantalla
        cuantos elementos del mismo están por encima del promedio
        calculado */

        for (int pos=0; pos<MAX; pos++){//examino todos los elemtos del arreglo
            if (arrEnt[pos] > (int)promedio ){//verifico si arrEnt[pos] es mayor al promedio
                System.out.print("|" + arrEnt[pos]);
            }
        }
    }
    public static double calcularPromedio(int [] arr){
        int suma = 0;
        for (int pos = 0; pos < MAX; pos++){
            suma+=arr[pos];
        }
        return ((double)suma/MAX);
    }
} 

