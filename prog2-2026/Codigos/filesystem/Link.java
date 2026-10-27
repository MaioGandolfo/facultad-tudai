package filesystem;

import java.util.ArrayList;

public class Link extends ElementoSA{
    private ElementoSA loQueApunta;
    private final static String PREFIJO = "Acceso directo a ";
    private final static int TAMANIO_FIJO = 1;

    public Link(ElementoSA loQueApunta){
        super(PREFIJO+loQueApunta.getNombre());
        this.loQueApunta = loQueApunta;
    }

    @Override
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

    @Override
    public ArrayList<Archivo> buscar(Condicion condicion) {
        return new ArrayList<>();
    }

    @Override
    protected void imprimirArbol(String prefijo, boolean esUltimo) {
        String conector = esUltimo ? "└── " : "├── ";
        // Ejemplo: "@Documento -> DocumentoReal"
        String apuntadoStr = (loQueApunta != null) ? (" -> " + loQueApunta) : "";
        System.out.println(prefijo + conector + this + apuntadoStr);
    }
}
