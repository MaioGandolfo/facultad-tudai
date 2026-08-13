package Practica6;

public class ejercicio10 {
    final static int MAXF=4, MAXC=20, SEPA=0;
    public static void main(String[] args) {
        /*
         *  Hacer un programa que dada la matriz de secuencias de
         *  enteros definida y precargada, permita obtener a través de
         *  métodos la posición de inicio y la posición de fin de la secuencia
         *  ubicada a partir de una posición entera y una fila, ambas
         *  ingresadas por el usuario. Finalmente, si existen imprima por
         *  pantalla ambas posiciones obtenidas.
         */
        
        int[][] matriz = {
            {0,0,2,3,4,0,0,5,6,0,7,8,9,0,0,1,2,3,0,0},
            {0,1,2,0,3,4,5,0,0,6,7,8,0,0,9,0,0,2,2,0},
            {0,0,5,0,6,7,8,0,0,1,1,1,0,2,3,4,0,0,0,0},
            {0,0,0,9,8,0,7,6,0,5,4,3,0,2,1,0,0,0,0,0}
        };
        int fila=-1, num=-1;

        while (fila <0 ^ fila >=MAXF){
            System.out.println("ingrese una fila: ");
            fila=Utils.leerInt();
        }
        while (num < 0 ^ num >=MAXC){
            System.out.println("ingrese pos: ");
            num=Utils.leerInt();
        }

        int ini=0, fin=-1;
        if (ini<MAXC){
            ini=buscarIni(matriz[fila], num);
            if (ini!=-1){
                fin=buscarFin(matriz[fila], num);
                System.out.println("el inicio y fin es: " + ini + "|" + fin);
            }
            else 
                System.out.println("no hay ni inicio ni fin.");
        }

    }
    public static int buscarIni(int [] arr, int n){
        if (arr[n]!=SEPA){
            while (n>=0 && arr[n]!=SEPA)
                n--;
            return n+1;
        }
        return -1;
    }
    public static int buscarFin (int[] arr, int n){
        while (n <MAXC && arr[n]!=SEPA)
            n++;
        return n-1;
    }
}
