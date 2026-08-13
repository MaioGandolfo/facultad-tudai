package Practica5;

public class ejercicio15 {
    final static int MAX=10;
    public static void main(String[] args) {
        /*
        Implementar un método que realice un corrimiento a derecha
        en un arreglo ordenado de tamaño MAX=10 a partir de una
        posición.
        */

        int [] array={1,2,3,4,5,6,7,8,9,10};
        
        int pos=4;
        
        corrimientoDerecha(array, pos);

        mostrarArreglo(array);


    }
    public static void mostrarArreglo(int [] array){
        for (int i=0; i<MAX; i++){
            System.out.print(array[i] + "|");
        }
    }
    public static void corrimientoDerecha(int [] array, int pos){
        for (int i = MAX - 1; i > pos; i--) {
        array[i] = array[i - 1]; // Mover cada elemento una posición a la derecha
        }
    }
}
