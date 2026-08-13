package Practica1;

    public class bonustrack1 {
        public static void main(String[] args){
        
        int dni;
        final int NROTICK= 3455674, CAJA= 8;
        final String CAJERO= "Luis Mercado", LEYENDA="'El precio lo pone el cliente'", FECHAHORA= "04/04/23 - 18:55",  CUIT= "99-34567833-9";
        

        System.out.print("Ingrese DNI:");
            dni=Utils.leerInt();

        System.out.println(FECHAHORA + '\t' + "Nro Ticket. " + NROTICK + '\n' + '\t'  + "   CUIT: " + CUIT + '\n' +
        "Cajero: " + CAJERO + '\t' + '\t' + "Caja: " + CAJA + '\n' + "DNI: " + dni + '\t' + LEYENDA );

        }
    }
