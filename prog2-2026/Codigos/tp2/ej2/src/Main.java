//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
// 1. Instanciamos a las personas que van a participar
    Persona p1 = new Persona("Lola", "lola@example.com", 123456);
    Persona p2 = new Persona("Carlos", "carlos@example.com", 654321);
    Persona p3 = new Persona("Ana", "ana@example.com", 987654);

    // 2. Definimos las fechas y horarios para las 4 reuniones
    LocalDate fecha1 = LocalDate.of(2026, 8, 20);
    LocalDate fecha2 = LocalDate.of(2026, 8, 21);

    LocalTime inicio1 = LocalTime.of(10, 0); // 10:00 hs
    LocalTime fin1 = LocalTime.of(11, 0);    // 11:00 hs

    LocalTime inicio2 = LocalTime.of(15, 0); // 15:00 hs
    LocalTime fin2 = LocalTime.of(16, 0);    // 16:00 hs

    // 3. Crear las 4 reuniones
    // Reunión 1 (Planificación)
    Reunion r1 = new Reunion(fecha1, inicio1, fin1, p1, 2);

    // Reunión 2 (IGUAL A LA REUNIÓN 1: misma fecha, misma hora inicio y mismo fin)
    Reunion r2 = new Reunion(fecha1, inicio1, fin1, p2, 2);

    // Reunión 3 (Mismo día pero distinto horario)
    Reunion r3 = new Reunion(fecha1, inicio2, fin2, p3, 1);

    // Reunión 4 (Distinta fecha y horario)
    Reunion r4 = new Reunion(fecha2, inicio2, fin2, p1, 3);

    // 4. Instanciar la Agenda para 4 reuniones
    Agenda agenda = new Agenda(4);

    // 5. Agregar las reuniones a la agenda
    agenda.agregarReunion(r1);
    agenda.agregarReunion(r2); // Se agrega la reunión duplicada
    agenda.agregarReunion(r3);
    agenda.agregarReunion(r4);

    agenda.mostrarReuniones();

    System.out.println("Agenda instanciada correctamente con las 4 reuniones (2 iguales).");
}
