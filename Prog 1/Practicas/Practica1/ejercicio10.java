package Practica1;

public class ejercicio10 {
    public static void main(String[] args) {
    
        int a=0, b=0;


        System.out.println("ingrese a");
            a=Utils.leerInt();
        System.out.println("ingrese b");
            b=Utils.leerInt();
        
            boolean amayor=(a>b);
            boolean multiploA=(a%2==0);
            boolean multiploB=(b%2==0);

        System.out.println("el primer numero es mayor que el segundo?: " + amayor + "\n" + "el primero numero es multiplo de 2?: " + multiploA + "\n" + "el segundo numero es multiplo de 2?: " + multiploB);




    }
    
}
