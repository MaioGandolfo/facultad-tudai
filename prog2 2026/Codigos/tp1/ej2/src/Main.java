//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Electrodomestico e1 = new Electrodomestico();

    System.out.println("nombre: " + e1.getNombre() + '\n' +
            "color: " + e1.getColor() + '\n' +
            "peso: " + e1.getPeso() + " Kg" + '\n' +
            "precio: $" + e1.getPrecioBase() + '\n' +
            "consumo energetico: " + e1.getConsumoEner());

    e1.setNombre("microondas");
    e1.setColor("blanco");
    e1.setPeso(10);
    e1.setPrecioBase(58000);
    e1.setConsumoEner(50);

    System.out.println("-------------------------------------------------------------");

    System.out.println("nombre: " + e1.getNombre() + '\n' +
            "color: " + e1.getColor() + '\n' +
            "peso: " + e1.getPeso() + " Kg" + '\n' +
            "precio: $" + e1.getPrecioBase() + '\n' +
            "consumo energetico: " + e1.getConsumoEner() + '\n' +
            "es bajo consumo?: " + e1.bajoConsumo() + '\n' +
            "cual es el balance?: " + e1.calcularBalance() + '\n' +
            "es alta gama?: " + e1.altaGama());
}
