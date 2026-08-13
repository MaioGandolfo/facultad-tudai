package Practica2;

public class ejercicio10 {
    public static void main (String[] args){
        //Escribir un programa que mientras que el usuario ingrese un
        //número entero entre 1 y 10 inclusive, lleve la suma de los
        //números ingresados. Finalmente, cuando sale del ciclo muestre
        //por pantalla el resultado de la suma. ¿En qué casos termina?

        int num=0;
        int resultado=0;

        System.out.println("Ingrese un numero del 1 al 10.");
            num=Utils.leerInt();

        while (num < 1 || num > 10 ){
            System.out.println("Ingrese un numero del 1 al 10");
                num=Utils.leerInt();
        } while (num >=1 && num <=10){
            resultado=num + num ;
            num++;
        }
        System.out.println("su resultado es: " + resultado);
    }
}
