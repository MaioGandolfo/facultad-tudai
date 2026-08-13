package Practica2;
    public class ejercicio1B{
        
        public static void main(String[] args){
            int numA=0;

            System.out.println("ingrese numero");
                numA=Utils.leerInt();

            if (numA>=100){
                System.out.println("es grande");
            } else {
                System.out.println("es chico");
            }
        }
    }