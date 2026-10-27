package filesystem;

import java.util.ArrayList;

public class Archivo extends ElementoSA{
    private double tamanio;
    private String extension;


    public Archivo(String nombre, String extension, double tamanio) {
        super(nombre);
        this.tamanio = tamanio;
        this.extension = extension;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public int cantidadElementos() {
        return 1;
    }

    public String toString() {
        return super.toString() + "." + extension;
    }

    @Override
    public ArrayList<Archivo> buscar(Condicion condicion) {
        ArrayList<Archivo> resultado = new ArrayList<>();
        if (condicion.cumple(this))
            resultado.add(this);
        return resultado;
    }

    @Override
    protected void imprimirArbol(String prefijo, boolean esUltimo) {
        //String conector = esUltimo ? "└── " : "├── ";
        String conector = "";
        if (esUltimo)
            conector = "└── ";
        else conector = "├── ";

        System.out.println(prefijo + conector + this);
    }

    @Override
    public boolean equals(Object obj) {
        return this.getNombre().equals(((Archivo)obj).getNombre());
    }
}
