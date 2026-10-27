package comparacionObjetos;

import java.util.Comparator;

public class ComparadorPersonaApellido implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getApellido().compareTo(o2.getApellido());
    }
}
