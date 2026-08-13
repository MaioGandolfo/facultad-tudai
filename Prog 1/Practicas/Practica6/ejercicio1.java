package Practica6;

public class ejercicio1{
    final static int MAXF=5, MAXC=10;
    public static void main(String[] args) {
        /*
         *  Hacer un programa que dada una matriz de enteros de tamaño
         *  5*10 que se encuentra precargada, invierta el orden del contenido
         *  por fila. Este intercambio no se debe realizar de manera explícita,
         *  hay que hacer un método que incluya una iteración de
         *  intercambio.
         */

        int [] [] matriz={  
            {2,5,3,4,1,6,7,8,9,0},
            {2,6,33,55,21,56,43,99,1,4},
            {7,8,9,10,11,12,13,14,15,16},
            {20,18,17,16,15,14,13,12,11,10},
            {5,10,15,20,25,30,35,40,45,50}
        };

        mostrarMatriz(matriz);

        invertirFila(matriz);

        System.out.println('\n'+"asi quedo las filas de la matriz invertidas: ");
        mostrarMatriz(matriz);
    }
    public static void mostrarMatriz(int [] [] matriz){
        for (int i=0; i<MAXF; i++){
            System.out.println();
            for (int j=0; j<MAXC; j++){
                System.out.print(matriz[i][j]+ "|");
            }
        }
    }
    public static void invertirFila(int[][] matriz){
        for (int i=0; i<MAXF; i++){
            int k=0, j=MAXC-1, aux=0;

            while (k<j){
                aux=matriz[i][k];
                matriz[i][k]=matriz[i][j];
                matriz[i][j]=aux;
                k++;
                j--;
            }
        }
    }
}