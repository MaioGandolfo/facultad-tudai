//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Corp");

        // 2. Instanciamos 10 empleados utilizando sus jerarquías y constructores
        // (4 Empleados comúnes, 3 por Hora Extra y 3 por Ventas)

        // --- EMPLEADOS COMUNES ---
        Empleado e1 = new Empleado("Carlos Pérez");
        e1.setSueldoFijo(1200000);

        Empleado e2 = new Empleado("Ana Gómez");
        e2.setSueldoFijo(950000);

        Empleado e3 = new Empleado("Lucía Fernández");
        e3.setSueldoFijo(1100000);

        Empleado e4 = new Empleado("Martín Silva");
        e4.setSueldoFijo(1050000);

        // --- EMPLEADOS POR HORA EXTRA ---
        // Constructor: (nombre, cantHorasTrabajadas, extraPorHora)
        EmpleadoHoraExtra e5 = new EmpleadoHoraExtra("Roberto Díaz", 10, 5000);
        e5.setSueldoFijo(1000000);

        EmpleadoHoraExtra e6 = new EmpleadoHoraExtra("Sofia Martínez", 15, 6000);
        e6.setSueldoFijo(1150000);
        EmpleadoHoraExtra e7 = new EmpleadoHoraExtra("Esteban Quito", 8, 4500);
        e7.setSueldoFijo(980000);

        // --- EMPLEADOS POR VENTAS ---
        // Constructor: (nombre, porcentajeVenta)
        EmpleadoVenta e8 = new EmpleadoVenta("Laura Rossi", 5);
        e8.setSueldoFijo(850000);
        e8.addVenta(new Venta(200000));
        e8.addVenta(new Venta(500000));

        EmpleadoVenta e9 = new EmpleadoVenta("Javier López", 4);
        e9.setSueldoFijo(900000);
        e9.addVenta(new Venta(1000000));

        EmpleadoVenta e10 = new EmpleadoVenta("Mariana Torres", 6);
        e10.setSueldoFijo(880000);
        e10.addVenta(new Venta(350000));
        e10.addVenta(new Venta(400000));

        // 3. Agregamos los 10 empleados a la Empresa
        empresa.addEmpleado(e1);
        empresa.addEmpleado(e2);
        empresa.addEmpleado(e3);
        empresa.addEmpleado(e4);
        empresa.addEmpleado(e5);
        empresa.addEmpleado(e6);
        empresa.addEmpleado(e7);
        empresa.addEmpleado(e8);
        empresa.addEmpleado(e9);
        empresa.addEmpleado(e10);

        // 4. Imprimimos la lista de empleados para verificar
        System.out.println("=== EMPRESA: " + empresa.getNombre() + " ===");
        empresa.getListaEmpleados();
    }
}