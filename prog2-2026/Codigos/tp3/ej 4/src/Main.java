//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Agenda agenda = new Agenda();

    // 2. Instanciamos 10 Contactos con el constructor:
    // (nombre, apellido, fechaNac, direccion, mail, numeroTelefono, ciudad)[cite: 2]

    // --- GRUPO 1: 3 Contactos IGUALES (Mismo nombre, apellido y teléfono) ---
    Contacto c1 = new Contacto("Juan", "Pérez", LocalDate.of(1995, 5, 12), "Av. Colón 123", "juan@mail.com", 249411111, "Tandil");
    Contacto c2 = new Contacto("Juan", "Pérez", LocalDate.of(1995, 5, 12), "Av. Colón 123", "juan@mail.com", 249411111, "Tandil");
    Contacto c3 = new Contacto("Juan", "Pérez", LocalDate.of(1990, 1, 1), "Otra Calle 999", "otro@mail.com", 249411111, "Tandil");

    // --- GRUPO 2: Contactos con el MISMO TELÉFONO pero DISTINTO nombre/apellido ---
    Contacto c4 = new Contacto("María", "Gómez", LocalDate.of(1998, 8, 20), "Belgrano 456", "maria@mail.com", 249422222, "Tandil");
    Contacto c5 = new Contacto("Carlos", "Gómez", LocalDate.of(2000, 3, 15), "Belgrano 456", "carlos@mail.com", 249422222, "Tandil"); // Mismo teléfono que c4[cite: 2]

    // --- GRUPO 3: Contactos con datos variados e independientes ---
    Contacto c6 = new Contacto("Lucía", "López", LocalDate.of(2002, 11, 5), "Mitre 789", "lucia@mail.com", 249433333, "Azul");
    Contacto c7 = new Contacto("Pedro", "Rodríguez", LocalDate.of(1988, 4, 18), "Pinto 321", "pedro@mail.com", 249444444, "Tandil");
    Contacto c8 = new Contacto("Ana", "Martínez", LocalDate.of(1993, 9, 30), "Sarmiento 654", "ana@mail.com", 249455555, "Rauch");
    Contacto c9 = new Contacto("Sofia", "Fernández", LocalDate.of(2001, 2, 14), "Alem 147", "sofia@mail.com", 249466666, "Tandil");
    Contacto c10 = new Contacto("Diego", "Alvarez", LocalDate.of(1997, 7, 22), "España 258", "diego@mail.com", 249477777, "Tandil");

    // 3. Agregamos los 10 contactos a la Agenda
    // (Nota: como c1, c2 y c3 son iguales por equals, tu metodo addContacto no agregara los duplicados)[cite: 1, 2]
    agenda.addContacto(c1);
    agenda.addContacto(c2);
    agenda.addContacto(c3);
    agenda.addContacto(c4);
    agenda.addContacto(c5);
    agenda.addContacto(c6);
    agenda.addContacto(c7);
    agenda.addContacto(c8);
    agenda.addContacto(c9);
    agenda.addContacto(c10);

    //System.out.println(agenda.imprimirContactos());

    agenda.imprimirContactos();

    System.out.println("Promedio de edad: " + agenda.getEdadPromedio());


}
