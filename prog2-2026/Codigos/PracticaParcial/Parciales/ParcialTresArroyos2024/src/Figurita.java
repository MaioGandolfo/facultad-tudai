import java.util.ArrayList;

public class Figurita extends Coleccionable{
    private String album;
    private int numero;
    private double precio;

    public Figurita(String nombre, String album, int numero, double precio){
        super(nombre);
        this.album = album;
        this.numero = numero;
        this.precio = precio;
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
}
