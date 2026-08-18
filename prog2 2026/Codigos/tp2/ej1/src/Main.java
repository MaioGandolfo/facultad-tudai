//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main (String[] args){
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

}
