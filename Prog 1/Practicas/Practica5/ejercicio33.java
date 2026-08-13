package Practica5;

public class ejercicio33 {
    final static int MAX=20, SEPA=0;
    public static void main(String[] args) {
        /*
         *  Hacer un programa que dado el arreglo definido y precargado,
         *  y un número entero ingresado por el usuario, copie de forma
         *  continua las secuencias de tamaño igual al número ingresado en
         *  otro arreglo de iguales características e inicializado con 0. La
         *  copia en este último arreglo deben comenzar desde el principio
         *  del mismo.
         */

        int [] arr={0,1,2,3,4,5,0,0,9,8,7,0,0,5,2,3,0,2,2,0};

        int num=-1, inicio=0, fin=-1, tamSec=0;

        int [] arrB=new int [MAX];

        while (num<0){
            System.out.println("ingrese un numero entero: ");
                num=Utils.leerInt();
        }

        while (inicio<MAX){
            inicio=buscarIni(arr, fin+1);
            if (inicio<MAX){
                fin=buscarFin(arr, inicio);
                tamSec=fin-inicio+1;
                if (tamSec==num){
                    procesarSec(arr, inicio, fin, tamSec, num);
                }
            }
        }
    }
    public static int buscarIni(int [] arr, int i){
        while (i<MAX && arr[i]==SEPA)
            i++;
        return i;
    }
    public static int buscarFin(int [] arr, int i){
        while (i<MAX && arr[i]!=SEPA)
            i++;
        return i-1;
    }
    public static void procesarSec(int [] arr, int [] B, int ini, int fin, int Tsec, int num){
        int i=ini;
        while(i<MAX){
            B[i]=arr[i];
            i++;
        }
    }
}
