//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main (String[] args){
    Serie serie = new Serie();
    serie.setNombre("Dark");
    serie.setDescripcion("Viajes en el tiempo");
    serie.setCreador("Baran bo Odar");
    serie.setGenero("Ciencia Ficción");

    // Reservamos espacio para 3 temporadas
    serie.agregarTemporada(3);

    // ----------------------------------------------------
    // TEMPORADA 0 (3 Capítulos - Todos Vistos)
    // ----------------------------------------------------
    Temporada t0 = new Temporada(3);

    Capitulo ep0 = new Capitulo();
    ep0.setNombre("Secretos");
    ep0.ingresarCalificacion(5); // Visto

    Capitulo ep1 = new Capitulo();
    ep1.setNombre("Mentiras");
    ep1.ingresarCalificacion(4); // Visto

    Capitulo ep2 = new Capitulo();
    ep2.setNombre("Past and Present");
    ep2.ingresarCalificacion(5); // Visto

    // ----------------------------------------------------
    // TEMPORADA 1 (3 Capítulos - 2 Vistos, 1 SIN VER)
    // ----------------------------------------------------
    Temporada t1 = new Temporada(3);

    Capitulo ep3 = new Capitulo();
    ep3.setNombre("Double Lives");
    ep3.ingresarCalificacion(3); // Visto

    Capitulo ep4 = new Capitulo();
    ep4.setNombre("Truths");
    ep4.ingresarCalificacion(4); // Visto

    Capitulo ep5 = new Capitulo();
    ep5.setNombre("Sic Mundus Creatus Est");
    // Queda SIN VER (mantiene calificación -1)

    // ----------------------------------------------------
    // TEMPORADA 2 (4 Capítulos - 2 Vistos, 2 SIN VER)
    // ----------------------------------------------------
    Temporada t2 = new Temporada(4);

    Capitulo ep6 = new Capitulo();
    ep6.setNombre("Crossroads");
    ep6.ingresarCalificacion(5); // Visto

    Capitulo ep7 = new Capitulo();
    ep7.setNombre("Lost and Found");
    ep7.ingresarCalificacion(4); // Visto

    Capitulo ep8 = new Capitulo();
    ep8.setNombre("Endless Dark");
    // Queda SIN VER (mantiene calificación -1)

    Capitulo ep9 = new Capitulo();
    ep9.setNombre("The Paradise");
    // Queda SIN VER (mantiene calificación -1)


    // Total capítulos: 3 + 3 + 4 = 10
    // Capítulos vistos: 3 (Temp 0) + 2 (Temp 1) + 2 (Temp 2) = 7
    // Capítulos sin ver: 3 (ep5, ep8 y ep9)


    // ----------------------------------------------------
    // PRUEBA DE RESULTADOS
    // ----------------------------------------------------
    System.out.println("Serie: " + serie.getNombre());
    System.out.println("Cantidad de temporadas: " + serie.getTemporada());
    System.out.println("---------------------------------------------");

    System.out.println("Total capítulos vistos en toda la serie: " + serie.vistosTotal() + " / 10");
    System.out.println("Promedio general de calificaciones: " + serie.promedioTemp());
           /*
            // 1. Crear la serie
            Serie serie = new Serie("Dark", "Viajes en el tiempo", "Baran bo Odar", "Ciencia Ficción");

            // 2. Crear las 3 temporadas con sus capítulos

            // Temporada 1 (2 capítulos)
            Temporada t1 = new Temporada(2);
            Capitulo ep1_1 = new Capitulo("Secretos", "Desaparición en Winden");
            Capitulo ep1_2 = new Capitulo("Mentiras", "Búsqueda en la cueva");
            t1.agregarCapitulos(ep1_1);
            t1.agregarCapitulos(ep1_2);

            // Temporada 2 (2 capítulos)
            Temporada t2 = new Temporada(2);
            Capitulo ep2_1 = new Capitulo("Materia oscura", "El futuro desolado");
            Capitulo ep2_2 = new Capitulo("Materia roja", "Viajes a los 80");
            t2.agregarCapitulos(ep2_1);
            t2.agregarCapitulos(ep2_2);

            // Temporada 3 (2 capítulos)
            Temporada t3 = new Temporada(2);
            Capitulo ep3_1 = new Capitulo("Deja-vu", "Un mundo paralelo");
            Capitulo ep3_2 = new Capitulo("El origen", "El ciclo se cierra");
            t3.agregarCapitulos(ep3_1);
            t3.agregarCapitulos(ep3_2);

            // 3. Vincular las temporadas a la serie
            serie.agregarTemporada(t1);
            serie.agregarTemporada(t2);
            serie.agregarTemporada(t3);

            // 4. Cargar calificaciones de prueba (incluyendo una inválida para testear)
            System.out.println("--- PRUEBAS DE CALIFICACIÓN ---");
            ep1_1.setCalificacion(4.5);
            ep1_2.setCalificacion(5.0);
            ep2_1.setCalificacion(3.0);

            // Calificación inválida (debe mostrar el mensaje de error y no cambiar el valor)
            ep2_2.setCalificacion(8.0);

            // 5. Imprimir resultados probando los métodos requeridos
            System.out.println("\n--- RESULTADOS DE LOS SERVICIOS ---");
            System.out.println("Episodios vistos en Temporada 1: " + t1.capVistos());
            System.out.println("Promedio de calificación Temporada 1: " + t1.promedioCalifCap());

            System.out.println("Total episodios vistos en la serie: " + serie.vistosTotal());
            System.out.println("Promedio general de la serie: " + serie.promedioTemp());

            // Marcar los que faltan para validar cuando esté completa
            ep2_2.setCalificacion(4.0);
            ep3_1.setCalificacion(5.0);
            ep3_2.setCalificacion(4.0);

            System.out.println("\n--- LUEGO DE VER TODOS LOS EPISODIOS ---");
            System.out.println("Nuevo promedio general de la serie: " + serie.promedioTemp());
            */
}
