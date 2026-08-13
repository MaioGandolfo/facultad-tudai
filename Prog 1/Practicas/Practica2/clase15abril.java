package Practica2;

import Practica1.Utils;

public class clase15abril {
    public static void main(String[] args) {
        //realiza un programa que dado un caracter ingresado desde teclado
        //(a O b) perminta realizar dos operaciones entre dos numero naturales
        //N y M ingresados tambien desde teclado, las operaciones son:
        //si se ingresa a obtener la potencia de N elevado a la M
        //si se ingresa b obtener la potencia de M elevado a N

        final char DESDE='a', HASTA='b';
        char letra=' ';
        int n=0, m=0;
        double calculo=0;


        System.out.println("ingresa una letra a o b");
            letra=Utils.leerChar();
            letra=obtenerOpcionvalida(letra, DESDE, HASTA);

        //while (letra<'a' || letra>'b'){
            //System.out.println("ingresaste una letra invalida, ingresa una letra a o b");
                //letra=Utils.leerChar();
        //}
        
        if (letra=='a' || letra=='b'){
            System.out.println("ingrese el 1er numero.");
                n=Utils.leerInt();
            System.out.println("ingrese el 2do numero.");
                m=Utils.leerInt();
        }

        if (letra=='a'){
            calculo=potencia(n, m);
            System.out.println("el 1er numero elevado al 2do numero es: " + n + "^" + m + "=" + calculo);
        } else {
            calculo=potencia(m, n);
            System.out.println("el 2do numero elevado al 1er numero es: " + m + "^" + n + "=" + calculo);
        }
        
        
    }
    public static int potencia(int base, int exponente){
        int resultado=1;
        for (int i=1; i<=exponente; i++ ){
            resultado*=base;
        }
        return resultado;
    }
    public static char obtenerOpcionvalida(char letra, char desde, char hasta){
        while (!(letra >=desde && letra<=hasta)){
            System.out.println("ingrese una letra valida entre: " + desde + " y " + hasta);
                letra=Utils.leerChar();
        }
        return letra;
    }
    public static int Natural(){
        int num=-1;
        while (num<=0){
            System.out.println("Ingrese un numero natural.");
                num=Utils.leerInt();
        }
        return num;
    }
}
