package Practica2;

public class ejercicio12 {
    public static void main (String[] args){
//Escribir un programa que mientras el usuario ingrese un
//carácter letra minúscula, se quede con la menor y la mayor letra
//ingresada. Finalmente muestre por pantalla dichas letras.

    char mayor=' ', menor=' ', letra=' ';
    boolean seguir= true;

    
    System.out.println("ingrese un carcater letra minuscula");
        letra=Utils.leerChar();
    
    mayor=letra;
    menor=letra;

    while (seguir){
        System.out.println("ingrese una letra minuscula.");
            letra=Utils.leerChar();

        if (letra >= 'a' && letra <='z'){
            if (letra<mayor){
                menor= letra;
            } else if (letra>menor){
                mayor=letra;
            }
        } else {
            seguir= false;
        }
    }
    System.out.println("la letra mayor es: " + mayor + '\n' + "la letra menor es: " + menor);
        
    }
}