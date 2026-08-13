package Practica3;

public class ejercicio10 {
    public static void main(String[] args) {
        /*
        10. Escribir un programa que mientras el usuario ingrese un
        número entero entre 1 y 10 realice:
        a. Si el numero ingresado es múltiplo de 3 pida ingresar un
        caracter y para el caracter ingresado imprima a qué tipo de
        carácter está asociado:
        i. “letra minúscula” si el carácter es una letra del
        abecedario en minúscula;
        ii. “letra mayúscula” si el carácter es una letra del
        abecedario en mayúscula;
        iii. “dígito” si el carácter corresponde a un número;
        iv. “otro” para los restantes casos de caracteres.
        b. Si el número ingresado es múltiplo de 5 imprima la tabla de
        multiplicar del número ingresado.
         */

        int num=0;

        System.out.println("ingrese un numero entre 1 y 10.");
            num=Utils.leerInt();
            num=numeroValido(num);

        if (num%3==0){
            char caracter=' ';
            System.out.println("ingrese un caracter.");
                caracter=Utils.leerChar();

            if (caracter >= 'a' && caracter <= 'z'){
                System.out.println("el caracter '" + caracter + "' es minúscula.");
            } else if (caracter >= 'A' && caracter <= 'Z'){
                System.out.println("el caracter '" + caracter + "' es mayúscula.");
            } else if (caracter >= '0' && caracter <='9'){
                System.out.println("el caracter '" + caracter + "' es un dígito.");
            } else {
                System.out.println("el caracter '" + caracter + "' es otro tipo de caracter.");
            }
        } else if (num%5==0){
            int resultado=0;
            for (int i=1; i<=10; i++){
                resultado= num*i;
                System.out.println(num + "x" + i + "=" + resultado);
            }
        } else {
            System.out.println("el numero que ingresaste fue: " + num);
        }
    }
    public static int numeroValido(int n){
        while (n < 1 || n >10){
            System.out.println("ingrese un numero valido entre el 1 y el 10.");
                n=Utils.leerInt();
        }
        return n;
    }
}
