package Practica2;

public class ejercicio19 {
    public static void main(String[] args) {
        /*Construir un programa que solicite desde teclado un número de
        mes válido y posteriormente notifique por pantalla la cantidad de
        días de ese mes. En el caso de que ingrese 2 como número de
        mes (febrero) deberá además solicitar ingresar un número de año
        entre 2000 y 2024 inclusive (no debe seguir si no está en ese
        rango), y dependiendo de si es bisiesto o no imprimir la cantidad
        de días correspondiente
        */

        int mes=0, anio=0, dias=0;

        System.out.println("Ingrese el numero de un mes x");
            mes=Utils.leerInt();
            mes=mesValido(mes);

            if (mes==2){
                System.out.println("ingrese un año entre 2000 y 2024.");
                    anio=Utils.leerInt();
                    anio=anioValido(anio);
                    dias= febrero(anio);
            } else {
                dias = diasMes(mes);
            }

            System.out.println("El mes " + mes + " tiene " + dias + " días.");

        
    }
    public static int diasMes (int mes){
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            default:
                return 0;
        }
    }
    public static int mesValido (int mes){
        while (mes < 1 || mes > 12){
            System.err.println("es un mes invalido, ingrese un mes valido.");
                mes=Utils.leerInt();
        }
        return mes;
    }
    public static int febrero (int anio){
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
            return 29;
        } else {
            return 28;
        }
    }
    public static int anioValido(int anio){
        while (anio < 2000 || anio > 2024){
            System.out.println("El año es invalido. ingrese un año entre 2000 y 2024.");
                anio=Utils.leerInt();
        }
        return anio;
    } 
}