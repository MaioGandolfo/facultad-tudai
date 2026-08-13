package Practica1;

public class ejercicio5 {
    public static void main(String[] args) {
        //aca abajo le defino el tipo de variable y el nombre
        String nombre, ocupacion="";
        int edad, altura;

        //aca abajo le pido al usuario rellenar los campos correspondientes
        System.out.println("ingresa tu nombre");
            nombre=Utils.leerString();
        System.out.println("ingrese edad");
            edad=Utils.leerInt();
        System.out.println("ingrese altura");
            altura=Utils.leerInt();
        System.out.println("ocupacion");
            ocupacion=Utils.leerString();

        //y aca se muestra todo
        System.out.println("nombre:"+ nombre +", edad:"+ edad +", altura:"+ altura +", ocupacion:"+ ocupacion);
    }
} 
