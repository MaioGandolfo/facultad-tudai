//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ArrayList<Integer> listaNumeros = new ArrayList<>();
    listaNumeros.add(1);
    listaNumeros.add(2);
    listaNumeros.add(-1);
    listaNumeros.add(100);
    listaNumeros.add(4);
    listaNumeros.add(56);
    listaNumeros.add(99);

    /*
    System.out.println(listaNumeros);

    Collections.sort(listaNumeros);

    System.out.println(listaNumeros);
    */
    Empleado empleado1 = new Empleado( 1,"Juan","Perez", 1000.1);
    Empleado empleado2 = new Empleado(  2,"Maria","Gonzalez",  2000);
    Empleado empleado4 = new Empleado(  4, "Teresa", "Gonzalez",  2000);
    Empleado empleado5 = new Empleado( 5, "Juan", "Garcia",  1000.6);

    ArrayList<Empleado> empleados = new ArrayList<>();

    empleados.add(empleado5);
    empleados.add(empleado1);
    empleados.add(empleado4);
    empleados.add(empleado2);

    System.out.println(empleados);

    Collections.sort(empleados);

    System.out.println(empleados);


}
