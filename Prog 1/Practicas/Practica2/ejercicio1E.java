package Practica2;

public class ejercicio1E {
    public static void main(String[] args) {
        int a=0, b=0, c=0;
        
        System.out.println("ingrese numero a:");
            a=Utils.leerInt();
        System.out.println("ingrese numero b:");
            b=Utils.leerInt();
        System.out.println("ingrese numero c:");
            c=Utils.leerInt();

        if (a<b&&b<c){
            System.out.println("creciente");
        } else if (a>b&&b>c){
            System.out.println("decreciente");
        } else {
            System.out.println("error");
        }
    }
}
