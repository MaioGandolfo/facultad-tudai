package Practica2;

public class ejercicio16 {
    public static void main(String[] args){
        //Pedir por consola 15 caracteres. Imprimir la mayor cantidad de
        //‘a’ seguidas que se ingresaron.

        char letra=' ';
        int cantidad=15, seguidas=0, contador=0, maxSeguidas=0;


        System.out.println("Ingrese letra minuscula.");
            letra=Utils.leerChar();
        
        while (letra < 'a' || letra > 'z'){
            System.out.println("No es una letra valida, Por favor ingrese una letra minuscula.");
                letra=Utils.leerChar();
        }
        
            for(;contador<=cantidad; contador++ ){
                System.out.println("Ingrese letra minucula");
                    letra=Utils.leerChar();
                
                    if (letra == 'a') {
                        seguidas++;
                        if (seguidas > maxSeguidas) {
                            maxSeguidas = seguidas;
                        }
                    } else {
                        seguidas = 0; 
                    }
            }
            System.out.println("La mayor cantidad de 'a' seguidas fue: " + maxSeguidas);
    }
}
