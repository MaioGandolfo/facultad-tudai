package Practica2;

public class clase3abril {
    public static void main(String[] args) {
        
        int hora=0, minutos=0;

        final int HORAa=8, MINa=30, HORAb=19;

        System.out.println("ingrese hora");
            hora=Utils.leerInt();
        System.out.println("Ingrese minutos");
            minutos=Utils.leerInt();

        if ((hora<0 || hora>23) && (minutos<0 || minutos>59)){
            System.out.println("no es una hora valida.");
        } else if ((hora>=0 || hora>23) && (minutos>=0 || minutos<=59)) {
            if ((hora>=HORAa && minutos>MINa) && hora<=HORAb){
                System.out.println("está abierto.");
            } else {
                System.out.println("está cerrado");
            }
        } else {
            System.out.println( "no es una hora valida");
        }
    }
}
