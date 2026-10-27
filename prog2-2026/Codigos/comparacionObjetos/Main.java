package comparacionObjetos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main() {
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Tandil");
        ciudades.add("Mar del Plata");
        ciudades.add("Azul");
        ciudades.add("Olavarría");
        ciudades.add("Tapalqué");
        ciudades.add("Rauch");
        ciudades.add("Ayacucho");
        System.out.println("Las ciudades cargadas son: ");
        System.out.println(ciudades);

        Collections.sort(ciudades);
        System.out.println("Las ciudades ordenadas alfebéticamente son: ");
        System.out.println(ciudades);


        ArrayList<String> ciudades2 = new ArrayList<>(ciudades);
        Collections.sort(ciudades2, Collections.reverseOrder());
        System.out.println("Las ciudades ordenadas desdendentemente son: ");
        System.out.println(ciudades2);

        Collections.sort(ciudades2, new ComparadorStringLongitud().reversed());
        ciudades2.sort(new ComparadorStringLongitud());
        ciudades2.sort(null);

        System.out.println("Las ciudades ordenadas por longitud del nombre son: ");
        Collections.sort(ciudades, new ComparadorStringLongitud());
        System.out.println(ciudades);

        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(15);
        numeros.add(1);
        numeros.add(5);
        numeros.add(10);

        Collections.sort(numeros);
        System.out.println(numeros);

        List<Persona> personas = new ArrayList<>();
        Persona juan = new Persona("Juan",    "Pérez",     LocalDate.of(1980, 5, 12), 1.75, false);
        Persona ana = new Persona("Ana",     "Gómez",     LocalDate.of(1990, 3, 20), 1.62, false);
        personas.add(juan);
        personas.add(ana);
        personas.add(new Persona("Carlos",  "Pérez",     LocalDate.of(1975, 8,  2), 1.80, true));
        personas.add(new Persona("Ana",     "Pérez",     LocalDate.of(1990, 3, 20), 1.68, false));
        personas.add(new Persona("Pedro",   "Gómez",     LocalDate.of(1985, 1, 15), 1.75, false));
        personas.add(new Persona("Lucía",   "Fernández", LocalDate.of(2000, 7, 10), 1.65, false));
        personas.add(new Persona("Juan",    "Gómez",     LocalDate.of(1980, 5, 12), 1.72, true));
        personas.add(new Persona("María",   "Pérez",     LocalDate.of(1975, 8,  2), 1.60, true));
        personas.add(new Persona("Carlos",  "Gómez",     LocalDate.of(1995, 11, 30), 1.80, false));
        personas.add(new Persona("Ana",     "Fernández", LocalDate.of(1985, 1, 15), 1.62, true));
        personas.add(new Persona("Pedro",   "Pérez",     LocalDate.of(2000, 7, 10), 1.75, false));
        personas.add(new Persona("Lucía",   "Gómez",     LocalDate.of(1990, 3, 20), 1.65, false));
        personas.add(new Persona("Juan",    "Pérez",     LocalDate.of(1970, 5, 12), 1.75, false));

        System.out.println(personas);
        System.out.println("Ahora las ordeno...");
        Collections.sort(personas);
        System.out.println(personas);

        System.out.println(juan.compareTo(ana));

        Comparator<Persona> porApellido = new ComparadorPersonaApellido();
        Comparator<Persona> porNombre = new ComparadorPersonaNombre();
        Comparator<Persona> porApellidoYNnombre  = new ComparadorCompuesto(porApellido, porNombre);
        Collections.sort(personas, porApellidoYNnombre);

        Comparator<Persona> porEstudiante = new ComparadorEstudiantesPrimero();
        Comparator<Persona> porEstudianteApelYNnom = new ComparadorCompuesto(porEstudiante, porApellidoYNnombre);

        Collections.sort(personas, porEstudianteApelYNnom);
    }
}
