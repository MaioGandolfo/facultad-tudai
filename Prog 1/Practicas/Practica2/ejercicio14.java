package Practica2;

public class ejercicio14 {
    public static void main(String[] args){
//Pedir por consola el ingreso de 10 números enteros positivos.
//Contar cuántas veces se ingresaron números pares y mostrarlo
//por pantalla

    int numero=0,contador=0;

    for (int i=1; i<=10; i++){
        System.out.println("Ingrese un numero entero");
            numero=Utils.leerInt();
            while ( numero <= 0){
                System.out.println("el numero ingresado no es un numero positivo, ingres un numero positivo.");
                    numero=Utils.leerInt();
            }
            if (numero%2==0){
                contador= contador +1;
            }
            
    }
    System.out.println("caudntos numeros pares ingresaste?: " + contador);
    }
}
