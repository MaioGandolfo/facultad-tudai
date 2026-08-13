package Practica2;

public class ejercicio18 {
    public static void main(String[] args) {
        //Escribir un programa que mientras que el usuario ingrese un
        //número distinto de 0, pida ingresar otros dos números e imprima
        //el resultado de la división entre los dos últimos números
        //ingresados. ¿Existe alguna restricción para la división?

        int num=0, a=0, b=0;
        double resultado=0;

        System.out.println("Ingrese un numero entero que no sea cero.");
            num=Utils.leerInt();

        while (num > -1 && num < 1){
            System.out.println("El numero que igresaste no es valido. Ingrese un numero entero que no sea cero.");
                num=Utils.leerInt();
        }
        if (num != 0){
            System.out.println("Ingrese un numero.");
                a=Utils.leerInt();
            System.out.println("Ingrese otro numero.");
                b=Utils.leerInt();
        } 
        resultado= a/b;

        System.out.println("el resultado de la divison es: " + resultado);
    }
}
