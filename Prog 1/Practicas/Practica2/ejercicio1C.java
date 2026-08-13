package Practica2;

public class ejercicio1C {
    public static void main(String[] args) {
        int dia=0;

        System.out.println("Ingrese dia");
            dia=Utils.leerInt();

        switch (dia) {
            case 1: System.out.println("lunes"); break;
            case 2: System.out.println("martes"); break;
            case 3: System.out.println("miercoles"); break;
            case 4: System.out.println("jueves"); break;
            case 5: System.out.println("viernes"); break;
            case 6: System.out.println("sabado"); break;
            case 7: System.out.println("domingo"); break;
        
            default: System.out.println("no es un dia valido");
                break;
        }
    }
}
