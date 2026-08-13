package Practica3;

public class ejercicio8 {
    public static void main (String[] args){
        /*Realizar un programa que dado dos números enteros y un
        carácter (todos ingresados por el usuario) muestre por pantalla el
        resultado de una operación matemática básica según el valor del
        carácter ingresado. Si se ingresó el carácter ‘a’ debe realizar la
        suma, para ‘b’ la resta, para ‘c’ la multiplicación y para ‘d’ la
        división entre ambos números.
        */

        char letra=' ';
        int numA=0, numB=0, resultado=0;
        

        System.out.println("ingrese el dos numeros enteros.");
            numA=Utils.leerInt();
            numB=Utils.leerInt();

        System.out.println("Ingrese una letra minuscula.");
            letra=Utils.leerChar();
            letra=caracterValido(letra);

        switch (letra) {
            case 'a':
                resultado= numA + numB;
                System.out.println("La suma de los dos numeros enteros ingresados es: " +  resultado);
                break;
            case 'b':
                resultado= numA - numB;
                System.out.println("La resta de los dos numero enteros ingresados es: " + resultado);
            case 'c':
                resultado= numA*numB;
                System.out.println("La multiplicación de los dos numero enteros ingresados es: " + resultado);
            case 'd':
                while (numB==0){
                    System.out.println("no se pude dividir un numero por 0, ingrese otro numero.");
                        numB=Utils.leerInt();
                }
                double div= (double) numA / numB;
                    System.out.println("La división entre los dos numeros ingresados es: " + div);
            default:
                break;
        }
    }
    public static char caracterValido(char letra){
        while (letra < 'a' || letra > 'd'){
            System.out.println("No es una letra valida, ingrese una letra entra la 'a' y la 'd'.");
                letra=Utils.leerChar();
        }
        return letra;
    }
}
