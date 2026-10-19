public class Archivo extends ElementoSA{
    private String extension;
    private double tamanio;

    public Archivo(String nombre, String extension, double tamanio){
        super(nombre);
        this.extension = extension;
        this.tamanio = tamanio;
    }

    public String toString(){
        return super.toString() + "." + extension;
    }

    @Override
    public double getTamanio() {
        return tamanio;
    }

    @Override
    public int cantidadElementos() {
        return 1;
    }

    protected void imprimirArbol(String prefijo, boolean esUltimo) {
        String conector = esUltimo ? "└── " : "├── ";
        System.out.println(prefijo + conector + this);
    }
}
