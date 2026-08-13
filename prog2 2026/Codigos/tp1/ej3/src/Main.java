//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    PuntoGeometrico p1 = new PuntoGeometrico();
    p1.desplazar(1, 2); // Queda en (1, 2)

    PuntoGeometrico p2 = new PuntoGeometrico();
    p2.desplazar(4, 6); // Queda en (4, 6)

    System.out.println("Distancia: " + p1.distanciaEuclidea(p2)); // Debe imprimir 5.0
}
