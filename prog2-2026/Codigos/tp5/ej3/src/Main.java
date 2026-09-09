//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // 1. Instanciamos una PilaElementos con nombre
    PilaElementos pila1 = new PilaElementos("Pila Principal");

    // 2. Apilamos elementos usando el método push
    pila1.push("Primer Elemento");
    pila1.push(42);
    pila1.push(3.1416);
    pila1.push("Elemento Superior");

    // 3. Mostramos el nombre y el tamaño de la pila
    System.out.println("Nombre de la pila: " + pila1.getNombre());
    System.out.println("Cantidad de elementos: " + pila1.size());

    // 4. Consultamos el elemento en el tope (primer elemento del ArrayList)
    System.out.println("Elemento en el tope (top): " + pila1.top());

    // 5. Probamos los métodos copy y reverse
    PilaElementos copiaPila = pila1.copy();
    copiaPila.setNombre("Pila Copia");

    PilaElementos pilaInvertida = pila1.reverse();
    pilaInvertida.setNombre("Pila Invertida");

    // 6. Desapilamos un elemento usando pop
    Object desapilado = pila1.pop();
    System.out.println("Elemento desapilado (pop): " + desapilado);
    System.out.println("Nuevo tamaño tras desapilar: " + pila1.size());

    // 7. Instanciamos una pila sin parámetros en el constructor (asigna nombre por defecto "n")
    PilaElementos pilaVacia = new PilaElementos();
    System.out.println("Nombre pila por defecto: " + pilaVacia.getNombre());
}
