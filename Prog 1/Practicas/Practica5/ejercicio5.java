package Practica5;

public class ejercicio5 {
    final static int MAX=5;
    public static void main(String[] args) {
        /* Hacer un programa que dado un arreglo de caracteres de tamaño
        MAX que se encuentra cargado, invierta el orden del contenido.
        */

        char [] arrC=new char [MAX];

        char caracter=' ';

        for (int pos=0; pos<MAX; pos++){
            System.out.println("ingrese un caracter");
                caracter=Utils.leerChar();
                arrC [pos]=caracter;
        }
        System.out.println("asi quedo el arreglo.");
        for (int pos=0 ; pos<MAX; pos++){
            System.out.print(arrC[pos] + "|");
        }
        char aux=' ';

        for (int i=0; i<MAX-1;i++){	
            aux=arrC[i];//hago una variarable con el arreglo
            arrC[i]=arrC[MAX-i-1];//la posicion es igual a MAX-pos-1.
            arrC[MAX-1-i]= aux;//MAX-1-i es aux.
        }
        
        System.out.println('\n'+ "asi quedo el arreglo invertido.");
        for (int pos=0 ; pos<MAX; pos++){
            System.out.print(arrC[pos] + "|");
        }
        
    }
}
