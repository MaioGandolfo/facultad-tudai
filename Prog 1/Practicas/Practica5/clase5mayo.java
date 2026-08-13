package Practica5;

public class clase5mayo {
    public static void main(String[] args) {
        int [] arr={5,1,10,7,3,-2,10};

        int a=11;
        int b=arr[a-3];
        b=3;
        arr[3]=a;//pisa el valor que hay en la posicion 3.

        for (int pos=0; pos<7; pos++){
            System.out.print(arr[pos] + "|");
        }
    }
}