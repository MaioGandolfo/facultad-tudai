package Practica3;

public class ejercicioIngreso {
    public static void main(String[] args) {
        /*Realizar un programa que dado un número natural N liste los números pares pero en
        sentido inverso. Mostrar por consola. */

        int num=0;

        System.out.println("Ingrese un numero");
            num=Utils.leerInt();

        for (int i=num; i>=0; i--){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
