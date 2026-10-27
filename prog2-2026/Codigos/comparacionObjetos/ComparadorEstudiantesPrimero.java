package comparacionObjetos;

import java.util.Comparator;

public class ComparadorEstudiantesPrimero implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        if (o1.isEsEstudiante() && !o2.isEsEstudiante())
            return -1;
        if (!o1.isEsEstudiante() && o2.isEsEstudiante())
            return 1;
        else return 0;
    }
}
