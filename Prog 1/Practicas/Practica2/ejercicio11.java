package Practica2;

public class ejercicio11 {
    public static void main (String[] args){
    //Escribir un programa que mientras el usuario ingrese un
    //caracter letra minúscula, acumule la cantidad de vocales que
    //ingresó. Finalmente muestre por pantalla dicha cantidad.

    char caracter=' ';
    String vocales= "";

    System.out.println("Ingrese un caracter minuscula.");
        caracter=Utils.leerChar();
    
    while (caracter>='a' && caracter<='z'){// se va a ejecutar siemore que pongamos un caracter minuscula..
        switch (caracter) {
            case 'a','e','i','o','u':
                vocales= vocales + caracter + ", ";
                break;// el ciclo se va terminar cuando el usuartio ingrese un caracter que no sea una letra minucula,
                //sino nos va a pedir ingresar un caracter infinitamente.
            }
            System.out.println("ingrese otro caracter minuscula");
                caracter=Utils.leerChar();
    }

    System.out.println("la repeticion terminó. las vocales que ingresaste fueron: " + vocales );
    
    }
}
