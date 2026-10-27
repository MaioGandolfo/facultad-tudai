package filesystem;

public class CondicionPrefijo extends  Condicion {
    private String prefijo;

    public CondicionPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    @Override
    public boolean cumple(ElementoSA elemento) {
        return elemento.getNombre().startsWith(prefijo);
    }
}
