package Practica3;

public class ejercicio17 {
    public static void main(String[] args) {
        /*Escribir un programa que mientras que el usuario ingrese un
        carácter letra minúscula, pida ingresar un número entero. Si el
        número ingresado está entre 1 y 5 inclusive deberá imprimir la
        tabla de multiplicar de dicho número */

        char caracter='!';
        int n=0;
        
        while (caracter < 'a' || caracter >'z'){
            System.out.println("ingrese un una letra minuscula");
                caracter=Utils.leerChar();
        }
        n=numeroValido(n);

        tablaMulti(n);
        
    }
    public static int numeroValido(int a){
        while (a < 1 || a > 5){
            System.out.println("ingrese un numero entre 1 y 5.");
                a=Utils.leerInt();
        } return a;
    }
    public static void tablaMulti (int a){
        int resultado;
        for (int i=1; i<=10; i++){
            resultado= a*i;
            System.out.println(a + "x" + i + "=" + resultado);
        }
    }
}
