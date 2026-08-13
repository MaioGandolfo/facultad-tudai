package Practica1;

public class ejercicio11 {
    public static void main(String[] args) {
        int a=0;

        System.out.println("valor de a");
            a=Utils.leerInt();
        
        boolean multiplo6=(a%6==0);
        boolean multiplo7=(a%7==0);
        boolean mayor30=(a>30);
        boolean multiplo2=(a%2==0);
        boolean menor30=(a<=30);

        float division=(a/5);
        boolean cos=(division>10);

        System.out.println("el numero es multiplo de 6?: " + multiplo6 + "\n"+"es multiplo de 7?: " + multiplo7 + "\n" + "es mayor a 30?: " + mayor30 + "\n" + "es multiplo de 2?: " + multiplo2 + "\n" + "es menor o igual a 30?: " + menor30 + "\n" + "el cociente de la división de " + a + " por 5 es mayor que 10?: " + cos );
    }
}
