package Practica4;

public class prube2 {
    public static void main(String[] args) {
        final int MAX = 10, MIN=4;
        int suma= 0;
        for (int i=MAX; i>MIN;i--)// acá faltaba un signo menos
            /*int*/ suma = suma + obtenerValor();// la variable suma la tengo que delcarar afuera del for

        System.out.println("El promedio es: " + (suma/(MAX-MIN)));// acá faltaba un parentesis de cierre
    }
    public static int obtenerValor(){
        System.out.println("Ingrese un numero entero: ");
        int valor = Utils.leerInt();
        return valor;
        }
        
}
