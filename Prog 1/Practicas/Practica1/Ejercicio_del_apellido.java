package Practica1;
public class Ejercicio_del_apellido{
    public static void main(String[] args) {
        //aca van las variables
        String nombre= "";
        char inicialApellido= ' ';
        int edad;
        double altura;

        //pedis los datos al user
        System.out.print("Ingrese su nombre.");
            nombre = Utils.leerString();
        System.out.print("Ingrese la inicial de su apellido.");
            inicialApellido = Utils.leerChar();
        System.out.print("Ingrese su edad.");
            edad = Utils.leerInt();
        System.out.print("Ingrese su altura.");
            altura = Utils.leerDouble();

        //mostrar info
        System.out.println("Su nombre es: " + nombre);
        System.out.print("Su incial de apellido es: " + inicialApellido);
        System.out.print("Su edad es: " + edad);
        System.out.print("Su altura es: " + altura);
    }
}