package Practica2;
public class ejercicio9 {
    public static void main(String[] args) {
        char caracter=' ';

        System.out.println("Ingrese un caracter digito o letra minuscula");
            caracter=Utils.leerChar();
        
            while((caracter < '0' || caracter > '9') && (caracter < 'a' || caracter > 'z')){
                System.out.println("Por favor ingrese un caractet digito o letra miniscula");
                    caracter=Utils.leerChar();
            }
            if (caracter >=0 && caracter <=9){
                System.out.println(caracter + ", es un caracter digito");
            } else if (caracter >= 'a' && caracter <='z'){
                switch (caracter) {
                    case 'a','e','i','o','u':
                    System.out.println( caracter + ", es una vocal.");
                        break;
                    default: System.out.println(caracter + ", es una consonante.");
                        break;
                }
            } 
    }
}
