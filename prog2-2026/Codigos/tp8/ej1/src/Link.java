public class Link extends ElementoSA{
    private ElementoSA loQueApunta;
    private final static String PREFIJO = "Acceso directo a ";
    private final static double TAMANIO_FIJO = 1;

    public Link(ElementoSA loQueApunta){
        super(PREFIJO + loQueApunta.getNombre());
        this.loQueApunta = loQueApunta;
    }

    public double getTamanio() {
        return TAMANIO_FIJO;
    }

    @Override
    public int cantidadElementos() {
        return 1;
    }

    @Override
    public String toString() {
        return "@" + super.toString();
    }

    protected void imprimirArbol(String prefijo, boolean esUltimo) {

    }
}
