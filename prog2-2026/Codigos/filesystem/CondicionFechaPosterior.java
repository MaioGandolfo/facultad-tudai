package filesystem;

import java.time.LocalDate;

public class CondicionFechaPosterior extends Condicion {
    private LocalDate fechaMinima;

    public CondicionFechaPosterior(ElementoSA fechaMinima) {
        this.fechaMinima = fechaMinima;
    }

    @Override
    public boolean cumple(Archivo elemento) {
        return elemento.getfCreacion().isAfter(fechaMinima);
    }
}
