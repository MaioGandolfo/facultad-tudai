package Practica3;

public class ejercicio9 {
    public static void main (String [] args){
        /*Escribir un programa que mientras el usuario ingrese un número
        entero entre 1 y 10, pida ingresar un carácter, y por cada carácter
        ingresado imprima:
        a. “letra minúscula” si el carácter es una letra del abecedario en
        minúscula;
        b. “letra mayúscula” si el carácter es una letra del abecedario
        en mayúscula;
        c. “dígito” si el carácter corresponde a un número;
        d. “otro” para los restantes casos de caracteres. */

        int  num=0;
        char caracter=' ';

        System.out.println("ingrese una numero ente 1 y 10.");
            num=Utils.leerInt();
            num=numeroValido(num);

        System.out.println("ingrese un caracter random.");
            caracter=Utils.leerChar();

        if (caracter >='a' && caracter <='z'){
            System.out.println("el cracter '" + caracter + "' es minúscula.");
        } else if (caracter >='A' && caracter <='Z'){
            System.out.println("el caracter '" + caracter + "' es mayúscula.");
        } else if (caracter >= '0' && caracter <='9'){
            System.out.println("el caracter '" + caracter + "' es un dígito.");
        } else {
            System.out.println("el caracter '" + caracter + "' es otro.");
        }

    }
    public static int numeroValido(int n){
        while (n <1 || n> 10){
            System.out.println("el numero ingresado no es valido, ingrese un numero nuevamente.");
                n=Utils.leerInt();
        }
        return n;
    }

}
