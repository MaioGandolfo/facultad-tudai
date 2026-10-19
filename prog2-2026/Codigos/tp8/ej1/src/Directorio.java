import java.util.ArrayList;

public class Directorio extends ElementoSA{
    private ArrayList<ElementoSA> elementos;

    public Directorio (String nombre){
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    public void addElemento(ElementoSA elemento) {
        this.elementos.add(elemento);
    }

    public int cantidadElementos(){
        int cantidad = 1;
        for(ElementoSA ee : elementos)
            cantidad += ee.cantidadElementos();

        return cantidad;
    }

    @Override
    public double getTamanio() {
        double salida =0;
        for(ElementoSA ee : elementos)
            salida += ee.getTamanio();

        return salida;
    }

    public ArrayList<ElementoSA> buscarElmentos(Condicion cc){
        ArrayList<ElementoSA> salida = new ArrayList<>();
        for(ElementoSA ee : elementos) {
            if (cc.cumple(ee))
                salida.add(ee);
        }
        return salida;
    }

    protected void imprimirArbol(String prefijo, boolean esUltimo) {
        String conector = esUltimo ? "└── " : "├── ";
        System.out.println(prefijo + conector + "<" + this + ">");

        String prefijoHijos = prefijo + (esUltimo ? "    " : "│   ");
        for (int i = 0; i < elementos.size(); i++) {
            ElementoSA hijo = elementos.get(i);
            boolean ultimoHijo = (i == elementos.size() - 1);
            hijo.imprimirArbol(prefijoHijos, ultimoHijo);
        }
    }
}
