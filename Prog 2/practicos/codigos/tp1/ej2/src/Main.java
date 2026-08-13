//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Electrodomestico e1 = new Electrodomestico("plata", 45, 2000, 3.5);

    System.out.println("el electrodomestico es bajo consumo?: " + e1.bajoConsumo());
    System.out.println("que balance tiene el electrodomestico?: " + e1.calcularBalance());
    System.out.println("es alta gama?: " + e1.esAltaGama());
}
