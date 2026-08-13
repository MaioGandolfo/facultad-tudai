package Practica5;

public class ejercicio16 {
    final static int MAX=10;
    public static void main(String[] args) {
        /*
        Implementar un método que realice un corrimiento a izquierda
        en un arreglo ordenado de tamaño MAX=10 a partir de una
        posición.
         */

        int [] array={1,2,3,4,5,6,7,8,9,10};

        int pos=2;

        mostrarArreglo(array);

        System.out.println(" ");

        corrimientoIzq(array, pos);

        mostrarArreglo(array);
    }
    public static void corrimientoIzq (int [] array, int pos){
        for (int i =pos; i<MAX-1; i++)
            array[i] = array[i + 1];
    }
    public static void mostrarArreglo(int [] array){
        for (int i=0; i<MAX; i++){
            System.out.print(array[i] + "|");
        }
    }
}
