package Practica3;

public class ejercicio13 {
    public static void main(String[] args) {

        int num=0, a=0, b=0, c=0;
        double resultado=0, calculo=0;

        System.out.println("ingrese 3 numeros reales.");
            a=Utils.leerInt();
                //a=validarNumero(a);
            b=Utils.leerInt();
                //b=validarNumero(b);
            c=Utils.leerInt();
                //c=validarNumero(c);                                                     

            System.out.println("\t\t-------Ingrese la opción que quiera hacer-------" + '\n' +
            "1) Calcular la raíz cuadrada de (a-c)" + '\n' +
            "2) Calcular el promedio de a, b y c" + '\n' +
            "3) Calcular cociente de la raíz cuadrada de (c - b) / a" + '\n' +
            "4) Calcular el cociente del promedio de los tres valores dividido por la raíz cuadrada de b");
            num=Utils.leerInt();

        switch (num) {
            case 1:
                calculo=(a-c);
                if (calculo>0){
                    resultado=Math.sqrt(calculo);
                    System.out.println("la raíz cuadrada de (" + a + "-" + c + ")= " + resultado);
                } else {
                    System.out.println("no se pude calcular la raíz cuadrada de (" + a + "-" + c + ") porque da cero.");
                }
                break;
            case 2:
                calculo=promedio(a, b, c);
                System.out.println("el promedio de (" + a + ", "+ b +", "+ c + ")= " + calculo);
                break;
            case 3:
                if (a!=0) {
                    calculo=(c-b);
                } else if (calculo>0){
                    resultado=Math.sqrt(calculo) / a;
                    System.out.println("la raíz cuadrada de (" + c + "-" + b + ") /" + a + "= " + resultado);
                } else {
                    System.out.println("no se pude calcular la raíz cuadrada de (" + c + "-" + b + ") / " + a);
                }
                break;
            case 4:
                calculo = promedio(a, b, c);
                if (b > 0){
                    resultado = calculo / Math.sqrt(b);
                    System.out.println("el cociente del promedio de los tres valores dividido por la raíz cuadrada de " + b + " es: " + resultado);
                } else {
                    System.out.println("no se puede calcular la raiz de " + b);
                }
                break;
            default:
                System.out.println(num + "no es una opcion valida");
                break;
        }   
    }
    public static double promedio (int a, int b, int c){
        double calculo = (a + b + c) / 3;
        return calculo;
    }
}
