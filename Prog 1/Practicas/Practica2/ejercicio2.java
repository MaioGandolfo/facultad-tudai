package Practica2;

public class ejercicio2 {
    public static void main(String[] args) {
        int num=0, anio=0;

        System.out.println("Ingrese mes");
            num=Utils.leerInt();
        if (num>=1 && num <=12 ){
            if (num==1||num==3||num==5||num==7||num==8||num==10||num==12){
                System.out.println("tu mes tiene 31 dias");
            } else if (num==2){
                System.out.println("ingrese año");
                    anio=Utils.leerInt();
                    if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
                        System.out.println(num+ " es biciesto");
                    } else {
                        System.out.println("tu mes tiene 28 dias.");
                    }

            } else {
                System.out.println("tu mes tiene 30 dias");
            }
        } else {
            System.out.println("no es un mes valido.");
        }
    }
}