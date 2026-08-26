//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Instanciamos la Fábrica con su constructor que recibe el nombre
        Fabrica fabrica = new Fabrica("Fábrica San José");

        // 2. Instanciamos distintos Muebles usando el constructor:
        // Mueble(String nombre, double peso, int costoFabricacion, String tipoMadera, String color)
        Mueble m1 = new Mueble("Silla de Comedor", 5.5, 12000, "Pino", "Marrón");
        Mueble m2 = new Mueble("Mesa Principal", 25.0, 45000, "Roble", "Al natural");
        Mueble m3 = new Mueble("Escritorio", 15.0, 30000, "Cedro", "Negro");
        Mueble m4 = new Mueble("Estantería", 18.5, 22000, "Pino", "Blanco");

        // Le asignamos el porcentaje de venta a cada mueble para calcular su valor de venta
        m1.setPorcentajeventa(30);
        m2.setPorcentajeventa(40);
        m3.setPorcentajeventa(35);
        m4.setPorcentajeventa(25);

        // 3. Agregamos muebles al ArrayList StockMuebles usando el método addStockMueble
        fabrica.addStockMueble(m1);
        fabrica.addStockMueble(m2);
        fabrica.addStockMueble(m3);
        fabrica.addStockMueble(m4);

        // 4. Probamos mostrar la fábrica y el stock cargado
        System.out.println("Fábrica: " + fabrica.getNombre());
        System.out.println("--- Lista de Stock ---");
        fabrica.mostrarStock();
    }
}