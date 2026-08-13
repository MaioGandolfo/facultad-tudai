package Practica3;

public class ejercicio12 {
    public static void main(String[] args) {
        /*Escribir un programa que simule 1000 lanzamientos de un dado
        y muestre por pantalla cuántas veces salió el valor del dado
        correspondiente al número entero N ingresado por el usuario.
        Considerar que el valor N ingresado se corresponda a un valor
        posible para un dado. Usar la sentencia Math.random() que
        devuelve un valor aleatorio real entre 0 y 1.
        Para asignar un posible valor a la variable dado entero:
        dado = (int) (6*Math.random() + 1) */

        final char SI='y';
        char letra=' ';
        int num=0, contador=0, dado;
        

        
        System.out.println("ingrese 'y' para lanzar el dado o 'n' para no lanzarlo");
        letra=Utils.leerChar();
        
        
        final int MAX=1000;
        
        if (letra==SI){
            System.out.println("Ingrese un numero entre 1 y 6.");
                num=Utils.leerInt();
                num=numeroValido(num);
                
            for (int i=1; i<=MAX; i++){
                dado= (int) (6*Math.random() + 1);
                if (dado==num){
                    contador++;
                }
            }
            System.out.println("el numero " + num + " salio " + contador + " veces en 1000 lanzaminetos.");
        } else {
            System.out.println("anda a cagar.");
        }
        


    }
    public static int numeroValido(int n){
        while (n < 1 || n > 6){
            System.out.println("ingrese un numero entre 1 y 6 por favor.");
                n=Utils.leerInt();
        } return n;
    }
}
