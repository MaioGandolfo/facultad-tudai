package Practica2;

public class ejercico20 {
    public static void main (String[] args){
        /*Pedir números enteros positivos por teclado. En cada iteración
        el usuario puede ingresar 0 para salir del programa. Si ingresa un
        número distinto de 0 se debe pedir el ingreso de un carácter.
        a. Si es ‘a’ se debe permitir al usuario escribir un texto libre e
        imprimirlo por pantalla.
        b. Si es ‘b’ se deben pedir 5 números positivos e informar si
        fueron ingresados en orden ascendente.
        c. Si es ‘c’ se deben pedir dos números enteros negativos e
        imprimir la raíz cuadrada de su multiplicación. La raíz
        cuadrada de un número se calcula con la sentencia:
        Math.sqrt(numero).
        d. Ante cualquier otro carácter ingresado se debe informar un
        error y pedir nuevamente el carácter.
         */

        int num=0;
        char letra=' ';
        String texto="";
        double resultado;

        System.out.println("Ingrese un numero entero positivo.");
            num=Utils.leerInt();
            num=numeroValido(num);

        System.out.println("Ingrese un caracater.");
            letra=Utils.leerChar();

            while (letra <'a' || letra >'c'){
                System.out.println("error, ingrese una letra");
                    letra=Utils.leerChar();
            }

        switch (letra) {
            case 'a':
                texto=caracterA(letra);
                System.out.println("El texto que ingresaste fue: '" + texto + "'");
            case 'b':
                letra=caracterB(letra);
                break;
            case 'c':
                resultado=caracterC(letra);
                System.out.println("la raíz cuadrada es: " + resultado);
            default:
                break;
        }
    }
    public static int numeroValido (int num){
        while ( num < 0 ){
            System.out.println("el numero no es postivo, ingrese un numero positivo.");
                num=Utils.leerInt();
        }
        return num;
    }
    public static String caracterA (char letra){
        String texto="";
        if (letra=='a'){
            System.out.println("Ingrese un texto al azar.");
                texto=Utils.leerString();
            }
            return texto;
    }
    public static char caracterB (char letra){
        if (letra=='b'){
            int numA=0, numB=0, numC=0, numD=0, numE=0;
            System.out.println("ingrese 5 numeros positivos");
                numA=Utils.leerInt();
                numB=Utils.leerInt();
                numC=Utils.leerInt();
                numD=Utils.leerInt();
                numE=Utils.leerInt();

            if (numA <= numB &&  numB <= numC && numC <= numD && numD <= numE) {
                System.out.println("los numero que ingreaste estan en orden ascendente.");
            } else if (numE >= numD &&  numD >= numC && numC >= numB && numB >= numA){
                System.out.println("el orden de los numeros es descendente.");
            } else {
                System.out.println("los numero estan desordenados.");
            }
        }
        return letra;
    }
    public static double caracterC (char letra){
        double resultado=0;
        if (letra=='c'){
            int numA, numB, multiplicacion;
            System.out.println("Ingres dos numeros negativos.");
                numA=Utils.leerInt();
            while (numA >=0){
                System.out.println("el numero no es negativo, ingrese un numero negativo.");
                    numA=Utils.leerInt();
            }
                numB=Utils.leerInt();
            while (numB >=0) {
                System.out.println("el numero no es negativo, ingrese un numero negativo.");
                    numB=Utils.leerInt();
            }
            
            multiplicacion= numA*numB;

            resultado=Math.sqrt(multiplicacion);
        }
        return resultado;
    }
}
