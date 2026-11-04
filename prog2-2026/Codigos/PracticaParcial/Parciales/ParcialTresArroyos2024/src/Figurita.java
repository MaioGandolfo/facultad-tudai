import java.util.ArrayList;

public class Figurita extends Coleccionable implements Comparable<Figurita> {
    private String album;
    private int numero;
    private double precio;

    public Figurita(String nombre, String album, int numero, double precio){
        super(nombre);
        this.album = album;
        this.numero = numero;
        this.precio = precio;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public ArrayList<Figurita> buscar(Condicion cc) {
        ArrayList<Figurita> salida = new ArrayList<>();
        if(cc.cumple(this))
            salida.add(this);
        return salida;
    }

    //Los listados se ordenan siempre
    //por el precio de la figurita y en caso de dos figuritas con el mismo precio, se ordenan alfabéticamente por su
    //nombre.

    public int compareTo(Figurita ff){
        int aux = Double.compare(this.getPrecio(), ff.getPrecio());
        if(aux == 0)
            return this.getNombre().compareTo(ff.getNombre());
        return aux;
    }
}
