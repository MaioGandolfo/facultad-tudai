package Practica3;

public class ejercicio6 {
    public static void main(String[] args) {
        /* Escribir un programa que mientras el usuario cargue desde
        teclado un carácter letra minúscula, llame a un método que
        imprime por pantalla la tabla de multiplicar del 9. */

        char letra=' ';

        System.out.println("Ingrese una letra.");
            letra=Utils.leerChar();
            while (letra < 'a' || letra >'z') {
                System.out.println("Ingrese una letra minuscula.");
                    letra=Utils.leerChar();
            }
            
            tabla9();
        
    }

    public static void tabla9(){
        for (int i=1; i<=10; i++){
            System.out.println("9x" + i + "=" +  9*i);
        }
    }
}
