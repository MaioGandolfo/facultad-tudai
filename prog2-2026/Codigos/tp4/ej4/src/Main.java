//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // 1. Instanciar la Selección de Fútbol
    SeleccionFutbol seleccion = new SeleccionFutbol("Argentina");

    // 2. Instanciar 1 Director Técnico
    DirectorTecnico dt = new DirectorTecnico(
            "Lionel", "Scaloni", 12345678, LocalDate.of(1978, 5, 16), "En país de origen", 101
    );

    // 3. Instanciar 32 Futbolistas (6 con estado 'Viajando' o 'En concentración')
    Futbolista f1 = new Futbolista("Emiliano", "Martínez", 11111101, LocalDate.of(1992, 9, 2), "VIAJANDO", "arquero", "derecho", 0);
    Futbolista f2 = new Futbolista("Franco", "Armani", 11111102, LocalDate.of(1986, 10, 16), "En concentración", "arquero", "derecho", 0);
    Futbolista f3 = new Futbolista("Geronimo", "Rulli", 11111103, LocalDate.of(1992, 5, 20), "Viajando", "arquero", "derecho", 0);
    Futbolista f4 = new Futbolista("Juan", "Musso", 11111104, LocalDate.of(1994, 5, 6), "En concentración", "arquero", "derecho", 0);
    Futbolista f5 = new Futbolista("Nahuel", "Molina", 11111105, LocalDate.of(1998, 4, 6), "Viajando", "defensor", "derecho", 1);
    Futbolista f6 = new Futbolista("Gonzalo", "Montiel", 11111106, LocalDate.of(1997, 1, 1), "En concentración", "defensor", "derecho", 1);

    Futbolista f7 = new Futbolista("Cristian", "Romero", 11111107, LocalDate.of(1998, 4, 27), "En país de origen", "defensor", "derecho", 3);
    Futbolista f8 = new Futbolista("Nicolas", "Otamendi", 11111108, LocalDate.of(1988, 2, 12), "En país de origen", "defensor", "derecho", 6);
    Futbolista f9 = new Futbolista("Lisandro", "Martínez", 11111109, LocalDate.of(1998, 1, 18), "En país de origen", "defensor", "zurdo", 1);
    Futbolista f10 = new Futbolista("Germán", "Pezzella", 11111110, LocalDate.of(1991, 6, 27), "En país de origen", "defensor", "derecho", 3);
    Futbolista f11 = new Futbolista("Nicolas", "Tagliafico", 11111111, LocalDate.of(1992, 8, 31), "En país de origen", "defensor", "zurdo", 1);
    Futbolista f12 = new Futbolista("Marcos", "Acuña", 11111112, LocalDate.of(1991, 10, 28), "En país de origen", "defensor", "zurdo", 0);
    Futbolista f13 = new Futbolista("Lucas", "Martínez Quarta", 11111113, LocalDate.of(1996, 5, 10), "En país de origen", "defensor", "derecho", 0);
    Futbolista f14 = new Futbolista("Leonardo", "Balerdi", 11111114, LocalDate.of(1999, 1, 26), "En país de origen", "defensor", "derecho", 0);
    Futbolista f15 = new Futbolista("Rodrigo", "De Paul", 11111115, LocalDate.of(1994, 5, 24), "En país de origen", "mediocampista", "derecho", 2);
    Futbolista f16 = new Futbolista("Enzo", "Fernández", 11111116, LocalDate.of(2001, 1, 17), "En país de origen", "mediocampista", "derecho", 4);
    Futbolista f17 = new Futbolista("Alexis", "Mac Allister", 11111117, LocalDate.of(1998, 12, 24), "En país de origen", "mediocampista", "derecho", 3);
    Futbolista f18 = new Futbolista("Leandro", "Paredes", 11111118, LocalDate.of(1994, 6, 29), "En país de origen", "mediocampista", "derecho", 5);
    Futbolista f19 = new Futbolista("Guido", "Rodríguez", 11111119, LocalDate.of(1994, 4, 12), "En país de origen", "mediocampista", "derecho", 1);
    Futbolista f20 = new Futbolista("Giovani", "Lo Celso", 11111120, LocalDate.of(1996, 4, 9), "En país de origen", "mediocampista", "zurdo", 3);
    Futbolista f21 = new Futbolista("Exequiel", "Palacios", 11111121, LocalDate.of(1998, 10, 5), "En país de origen", "mediocampista", "derecho", 0);
    Futbolista f22 = new Futbolista("Thiago", "Almada", 11111122, LocalDate.of(2001, 4, 26), "En país de origen", "mediocampista", "derecho", 1);
    Futbolista f23 = new Futbolista("Facundo", "Buonanotte", 11111123, LocalDate.of(2004, 12, 23), "En país de origen", "mediocampista", "zurdo", 0);
    Futbolista f24 = new Futbolista("Lionel", "Messi", 11111124, LocalDate.of(1987, 6, 24), "En país de origen", "delantero", "zurdo", 106);
    Futbolista f25 = new Futbolista("Julian", "Álvarez", 11111125, LocalDate.of(2000, 1, 31), "En país de origen", "delantero", "derecho", 9);
    Futbolista f26 = new Futbolista("Lautaro", "Martínez", 11111126, LocalDate.of(1997, 8, 22), "En país de origen", "delantero", "derecho", 28);
    Futbolista f27 = new Futbolista("Angel", "Di María", 11111127, LocalDate.of(1988, 2, 14), "En país de origen", "delantero", "zurdo", 31);
    Futbolista f28 = new Futbolista("Nicolas", "González", 11111128, LocalDate.of(1998, 4, 6), "En país de origen", "delantero", "zurdo", 5);
    Futbolista f29 = new Futbolista("Paulo", "Dybala", 11111129, LocalDate.of(1993, 11, 15), "En país de origen", "delantero", "zurdo", 4);
    Futbolista f30 = new Futbolista("Alejandro", "Garnacho", 11111130, LocalDate.of(2004, 7, 1), "En país de origen", "delantero", "derecho", 0);
    Futbolista f31 = new Futbolista("Valentin", "Carboni", 11111131, LocalDate.of(2005, 3, 5), "En país de origen", "delantero", "zurdo", 0);
    Futbolista f32 = new Futbolista("Giuliano", "Simeone", 11111132, LocalDate.of(2002, 12, 18), "En país de origen", "delantero", "derecho", 0);

    // 4. Instanciar 15 Masajistas
    Masajista m1 = new Masajista("Carlos", "Pérez", 22222201, LocalDate.of(1980, 1, 1), "En país de origen", "Masajista", 10);
    Masajista m2 = new Masajista("Juan", "Gómez", 22222202, LocalDate.of(1981, 2, 2), "En país de origen", "Masajista", 8);
    Masajista m3 = new Masajista("Pedro", "López", 22222203, LocalDate.of(1982, 3, 3), "En país de origen", "Masajista", 5);
    Masajista m4 = new Masajista("Luis", "Díaz", 22222204, LocalDate.of(1983, 4, 4), "En país de origen", "Masajista", 7);
    Masajista m5 = new Masajista("Mario", "Fernández", 22222205, LocalDate.of(1984, 5, 5), "En país de origen", "Masajista", 12);
    Masajista m6 = new Masajista("Jorge", "Rodríguez", 22222206, LocalDate.of(1985, 6, 6), "En país de origen", "Masajista", 4);
    Masajista m7 = new Masajista("Diego", "Sánchez", 22222207, LocalDate.of(1986, 7, 7), "En país de origen", "Masajista", 6);
    Masajista m8 = new Masajista("Gabriel", "Romero", 22222208, LocalDate.of(1987, 8, 8), "En país de origen", "Masajista", 9);
    Masajista m9 = new Masajista("Esteban", "Torres", 22222209, LocalDate.of(1988, 9, 9), "En país de origen", "Masajista", 11);
    Masajista m10 = new Masajista("Hernán", "Sosa", 22222210, LocalDate.of(1989, 10, 10), "En país de origen", "Masajista", 3);
    Masajista m11 = new Masajista("Pablo", "Ruiz", 22222211, LocalDate.of(1990, 11, 11), "En país de origen", "Masajista", 2);
    Masajista m12 = new Masajista("Sergio", "Benítez", 22222212, LocalDate.of(1991, 12, 12), "En país de origen", "Masajista", 5);
    Masajista m13 = new Masajista("Andrés", "Ramírez", 22222213, LocalDate.of(1980, 2, 15), "En país de origen", "Masajista", 14);
    Masajista m14 = new Masajista("Roberto", "Flores", 22222214, LocalDate.of(1981, 3, 16), "En país de origen", "Masajista", 6);
    Masajista m15 = new Masajista("Claudio", "Acosta", 22222215, LocalDate.of(1982, 4, 17), "En país de origen", "Masajista", 8);

    // 5. Cargar los 48 integrantes en la preLista de SeleccionFutbol
    // (Asegúrate de agregar este método public void agregarAPreLista(Integrante i) en SeleccionFutbol)
    seleccion.agregarAPreLista(dt);

    seleccion.agregarAPreLista(f1);  seleccion.agregarAPreLista(f2);  seleccion.agregarAPreLista(f3);
    seleccion.agregarAPreLista(f4);  seleccion.agregarAPreLista(f5);  seleccion.agregarAPreLista(f6);
    seleccion.agregarAPreLista(f7);  seleccion.agregarAPreLista(f8);  seleccion.agregarAPreLista(f9);
    seleccion.agregarAPreLista(f10); seleccion.agregarAPreLista(f11); seleccion.agregarAPreLista(f12);
    seleccion.agregarAPreLista(f13); seleccion.agregarAPreLista(f14); seleccion.agregarAPreLista(f15);
    seleccion.agregarAPreLista(f16); seleccion.agregarAPreLista(f17); seleccion.agregarAPreLista(f18);
    seleccion.agregarAPreLista(f19); seleccion.agregarAPreLista(f20); seleccion.agregarAPreLista(f21);
    seleccion.agregarAPreLista(f22); seleccion.agregarAPreLista(f23); seleccion.agregarAPreLista(f24);
    seleccion.agregarAPreLista(f25); seleccion.agregarAPreLista(f26); seleccion.agregarAPreLista(f27);
    seleccion.agregarAPreLista(f28); seleccion.agregarAPreLista(f29); seleccion.agregarAPreLista(f30);
    seleccion.agregarAPreLista(f31); seleccion.agregarAPreLista(f32);

    seleccion.agregarAPreLista(m1);  seleccion.agregarAPreLista(m2);  seleccion.agregarAPreLista(m3);
    seleccion.agregarAPreLista(m4);  seleccion.agregarAPreLista(m5);  seleccion.agregarAPreLista(m6);
    seleccion.agregarAPreLista(m7);  seleccion.agregarAPreLista(m8);  seleccion.agregarAPreLista(m9);
    seleccion.agregarAPreLista(m10); seleccion.agregarAPreLista(m11); seleccion.agregarAPreLista(m12);
    seleccion.agregarAPreLista(m13); seleccion.agregarAPreLista(m14); seleccion.agregarAPreLista(m15);

    // 6. Ejecutar el armado de la lista
    seleccion.convocar();

    // 7. Imprimir listas resultantes
    //System.out.println("=== INTEGRANTES CONVOCADOS ===");
    seleccion.preLista();

    seleccion.listaConvocados();

    //System.out.println("\n=== INTEGRANTES NO CONVOCADOS ===");
    seleccion.listaNoConvocados();
}
