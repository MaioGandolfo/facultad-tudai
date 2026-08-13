package Practica5;

public class ejercicio1 {
    final static int MAX=15;
    public static void main(String[] args) {
        /*Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
        de valores entre 1 y 12. Luego mostrar cómo quedó cargado */
        int [] arrN = new int [MAX];

        int n=0;

        for (int pos=0 ; pos<MAX; pos++){
            System.out.println("ingrese un numero entre 1 y 12.");
            n=Utils.leerInt();
            n=numeroValido(n);
            arrN [pos]=n;
        }

        System.out.println("asi quedo el arreglo.");
        for (int pos=0 ; pos<MAX; pos++){
            System.out.print(arrN[pos] + "|");
        }
        
    }

    public static int numeroValido(int a){
        while (a < 1 || a > 12){
            System.out.println("numero invalido, ingrese un numero entre 1 y 12");
            a=Utils.leerInt();
        } return a;
    }
    /*public static int ingresoNumero(int a){
        for (int i=0; i<MAX; i++){
            System.out.println("ingrese un numero entre 1 y 12.");
                a=Utils.leerInt();
                a=numeroValido(a);
        }
        return a; 
    } */
}
