package Practica1;

public class ejercicio6 {
    public static void main(String[] args) {
    
    char tipofactura;
    int import1, import2, numfac;
    String nombrecliente, produc1, produc2="";

    System.out.println("Ingrese que tipo de factura desea.");
        tipofactura=Utils.leerChar();
    System.out.println("Ingrese el numero de factura.");
        numfac=Utils.leerInt();
    System.out.println("Ingrese su nombre.");
        nombrecliente=Utils.leerString();
    System.out.println("Ingrese el nombre del producto 1.");
        produc1=Utils.leerString();
    System.out.println("Ingrese el importe del producto 1.");
        import1=Utils.leerInt();
    System.out.println("Ingrese el nombre del producto 2.");
        produc2=Utils.leerString();
    System.out.println("Ingrese el importe del producto 2.");
        import2=Utils.leerInt();

    System.out.println("Factura:" + '\t' + tipofactura + "\t" + "N " + numfac + "\n" + "Nombre: " + nombrecliente + "\n" + "Producto:" + "\t" + "\t" + "Importe" + "\n" + produc1 + "\t" + "\t" + "\t" + import1 + "\n" + produc2 + "\t" + "\t" + import2 + "\n" + "Importe total:" + "\t" + "\t" + (import1 + import2));
    
    }
}
