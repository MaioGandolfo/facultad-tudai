package Practica3;

public class ejercicio16 {
    public static void main(String[] args) {
        /*Escribir un programa que mientras el usuario ingresa un
        número de mes (entero) entre 1 y 12 inclusive, muestre por
        pantalla la cantidad de días del mes ingresado (suponer febrero
        de 28 días) (Mostrar por pantalla la cantidad de días del mes
        debería realizarse con un método).
         */
        int mes=0;

        while (mes <1 || mes >12){
            System.out.print("ingrese un mes" + '\n' + "mes: ");
                mes=Utils.leerInt();
        }
        diasMes(mes);
    }
    public static void diasMes(int a){
        switch (a) {
            case 1,3,5,7,8,10,12:
                System.out.println(a + " tiene 31 dias");
                break;
            case 4,6,9,11:
                System.out.println(a + " tiene 30 dias");
                break;
            default:
                System.out.println(a + " tiene 28 dias");
                break;
        }
    }
}
