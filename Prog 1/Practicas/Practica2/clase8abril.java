package Practica2;

public class clase8abril {
    public static void main (String[] args ){
        // definir variables
        int numeroSecreto= (int)(Math.random() * 10);
        int numero= -1; 
        final int MAX_INTENTOS= 5;
        int  cantIntentos=0;

        // intentos de adivinacion
        //mientras que tenga intentos disponibles
        //y que no haya adivinado

        while(cantIntentos < MAX_INTENTOS && numero != numeroSecreto ){
            //muestro mensaje
            System.out.println("Adivina mi numero entre 0 y 9:");
            numero=Utils.leerInt();
            cantIntentos++;
            System.out.println("te quedan " + cantIntentos);
        }

        if (numero == numeroSecreto){
            System.out.println("adivinaste en menos de " + cantIntentos + ", crack.");
        } else { System.out.println("malaso, el numero era: " + numeroSecreto);}

    }
}
