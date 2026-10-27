package filesystem;

public class CondicionNombreContiene extends Condicion {

    private String nombreContiene;
    public CondicionNombreContiene(String nombreContiene) {
        this.nombreContiene = nombreContiene;
    }

    @Override
    public boolean cumple(ElementoSA elemento) {
        return elemento.getNombre().contains(nombreContiene);
    }
}
