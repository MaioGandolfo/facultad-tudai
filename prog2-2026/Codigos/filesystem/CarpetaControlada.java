package filesystem;

import java.time.LocalDate;

public class CarpetaControlada extends Directorio {
    private Condicion elementosQueAcepta;

    public CarpetaControlada(String nombre, Condicion cond) {
        super(nombre);
        this.elementosQueAcepta = cond;
    }

    @Override
    public void addElemento(ElementoSA elemento) {
        if (elementosQueAcepta.cumple(elemento))
            super.addElemento(elemento);
    }
}
