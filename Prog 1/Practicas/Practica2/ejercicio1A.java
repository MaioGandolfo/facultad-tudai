package Practica2;

public class ejercicio1A {
    public static void main(String[] args) {
        int numA=0;

        System.out.println("ingrese un numeroA");
            numA=Utils.leerInt();
            
        if (numA>0){
            System.out.println("es positivo");
        } else if (numA<0) {
            System.out.println("es negativo");
        } else System.out.println("no es valido");
    }
}
