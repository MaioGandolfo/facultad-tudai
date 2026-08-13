package Practica1;

public class ejercicio7 {
    public static void main(String[] args) {
        int a=0, b=0, c=0, division=0, resta=0;

        System.out.println("valor a");
            a=Utils.leerInt();
        System.out.println("valor b");
            b=Utils.leerInt();
        System.out.println("valor c");
            c=Utils.leerInt();
        
        division=a/b;
        resta=(division-c);

        System.out.println(resta);
    }
}
