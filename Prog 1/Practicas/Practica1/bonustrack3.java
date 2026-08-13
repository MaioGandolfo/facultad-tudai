package Practica1;

public class bonustrack3 {
    public static void main(String[] args){
        int dia=0, dni=0, ticket=0, importe=0;
        final int DESCUENTO=8;

        System.out.println("Ingrese dia.");
            dia=Utils.leerInt();
        System.out.println("Ingrese DNI.");
            dni=Utils.leerInt();
        System.out.println("Ingrese importe.");
            importe=Utils.leerInt();
        System.out.println("Ingrese ticket.");
            ticket=Utils.leerInt();
        
        if ((dia<2)&&(importe>15000)&&(dni%3==0)&&(ticket%2==0)){

            int valorA= (importe/100*DESCUENTO);
            int valorB= (importe-valorA);
            System.out.println("El importe es:" + importe + '\n' + "Monto con descuento: " + valorB );
        }

        else {
            System.out.println("No cumple con los requisitos para el descuento");
        }


    }
}
