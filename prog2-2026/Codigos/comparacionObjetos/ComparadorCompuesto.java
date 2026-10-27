package comparacionObjetos;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Persona> {
    Comparator<Persona> comparador1;
    Comparator<Persona> comparador2;

    public ComparadorCompuesto(Comparator<Persona> comparador1, Comparator<Persona> comparador2) {
        this.comparador1 = comparador1;
        this.comparador2 = comparador2;
    }

    @Override
    public int compare(Persona o1, Persona o2) {
        int resultado = comparador1.compare(o1, o2);
        if (resultado == 0)
            resultado = comparador2.compare(o1, o2);
        return resultado;
    }
}
