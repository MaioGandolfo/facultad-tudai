package Practica2;

public class ejercicio4 {
    public static void main(String[] args) {
        int num=0;

        System.out.println("ingrese un numero.");
            num=Utils.leerInt();

        if (num>=0 && num<=99){
            System.out.println(num + " Tiene dos digitos.");
        } else if (num>=100 && num<=999){
            System.out.println(num + " Tiene 3 digitos.");
        } else {
            System.out.println(num + " No es un numero valido.");
        }
    }
}
