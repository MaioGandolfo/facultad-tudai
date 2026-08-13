package Practica1;

public class ejercicio12 {
    public static void main(String [] args ){
        int num=0, incremento=0, decremento=0;

        System.out.println("Ingresar numero");
            num=Utils.leerInt();
        
        incremento=(++num);
        decremento=(--num);

        System.out.println("Numero ingresado: " + num + "\n" + "Incremento: " + incremento + "\n" + "Decremento: " + decremento);
    }
}
