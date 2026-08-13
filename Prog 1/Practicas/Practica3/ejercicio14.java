package Practica3;

public class ejercicio14 {
    public static void main(String[] args) {
        /*Escribir un programa que mientras el usuario ingresa un
        carácter distinto del carácter ‘*’, invoque a un método que imprima
        si es carácter dígito o carácter letra minúscula, y si es letra
        minúscula imprimir si es vocal o consonante. */
        
        final char DISTINTO='*';
        char caracter='*';
    
        
        while (caracter==DISTINTO){
            System.out.print("ingrese un carcacter distinto de '*'" + '\n' + "caracter: ");
                caracter=Utils.leerChar();
        }

        tipoCaracter(caracter);
    }
    public static void tipoCaracter(char a){
        if (a>='0' && a <='9'){
            System.out.println(a + ": es digito.");
        } else if (a >='a' && a <='z'){
            switch (a) {
                case 'a','e','i','o','u' :
                    System.out.println(a + ": es letra minuscula y vocal");
                    break;
                default:
                    System.out.println(a + ": es minuscula y consoante");
                    break;
            }
        } else {
            System.out.println(a + ": es otro tipo de caracter.");
        }
    }
}

