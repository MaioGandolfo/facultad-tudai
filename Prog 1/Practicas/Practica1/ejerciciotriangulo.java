package Practica1;
    public class ejerciciotriangulo {
    
        public static void main(String[] args) {

            int angulo1 = 0, angulo2 = 0, angulo3 = 0;

            boolean esValido = false, rectangulo = false, acutangulo = false, obstustangulo = false;

            System.out.println("Ingrese angulo 1.");
                angulo1 = Utils.leerInt();
            System.out.println("Ingrese angulo 2.");
                angulo2 = Utils.leerInt();
            System.out.println("Ingrese angulo 3.");
                angulo3 = Utils.leerInt();

            esValido = ((angulo1 + angulo2 + angulo3 == 180) && (angulo1 > 1 && angulo2 > 1 && angulo3 > 1));

            rectangulo = (esValido && (angulo1 == 90 ^ angulo2 == 90 ^ angulo3 == 90));

            acutangulo = (esValido && (angulo1 < 90 && angulo2 < 90 && angulo3 < 90));

            obstustangulo = (esValido && (angulo1 > 90 || angulo2 > 90 || angulo3 > 90));

            System.out.println("es valido?: "+ esValido + '\n' + "es rectangulo?: " + rectangulo + '\n' + "es acutangulo?: " + acutangulo + '\n' + "es obstustangulo?: " + obstustangulo);

        }
    }