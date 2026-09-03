import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Instanciar plantas
        Planta p1 = new Planta("Monstera");
        p1.setNombreCientifico("Monstera deliciosa");
        p1.setFechaCompra(LocalDate.of(2023, 5, 10));
        p1.setPaisOrigen(null); // Al pasar null, setPaisOrigen asigna el país de la JVM

        Planta p2 = new Planta("Ficus");
        p2.setNombreCientifico("Ficus elastica");
        p2.setFechaCompra(LocalDate.of(2024, 1, 15));
        p2.setPaisOrigen(null);

        Planta p3 = new Planta("Lirio de la Paz");
        p3.setNombreCientifico("Spathiphyllum");
        p3.setFechaCompra(LocalDate.now());
        p3.setPaisOrigen(null);

        Planta p4 = new Planta("Cactus");
        p4.setNombreCientifico("Echinocactus grusonii");
        //p4.setFechaCompra(LocalDate.of(2022, 11, 20));
        p4.setPaisOrigen(null);

        // 2. Instanciar jardines
        Jardin jardinInterior = new Jardin("Jardín de Interior");
        Jardin jardinExterior = new Jardin("Jardín Exterior");

        // 3. Agregar plantas mediante el método agregarPlanta (o addPlanta)
        jardinInterior.addPlanta(p1);
        jardinInterior.addPlanta(p2);
        jardinInterior.addPlanta(p3);

        jardinExterior.addPlanta(p4);

        // 4. Mostrar el contenido de cada jardín
        System.out.println("=== " + jardinInterior.getNombre() + " ===");
        jardinInterior.imprimirPlantas();

        System.out.println("\n=== " + jardinExterior.getNombre() + " ===");
        jardinExterior.imprimirPlantas();
    }
}