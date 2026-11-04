import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Coleccion extends Coleccionable{
    ArrayList<Coleccionable> coleccion;
    private int descuento;

    public Coleccion(String nombre, int descuento){
        super(nombre);
        this.descuento = descuento;
        this.coleccion = new ArrayList<>();
    }

    public double getPrecio(){
        double salida = 0;
        for(Coleccionable cc : coleccion)
            salida += cc.getPrecio();
        return salida - (salida * descuento / 100);
    }

    public ArrayList<Figurita>buscar(Condicion cc){
        ArrayList<Figurita> salida = new ArrayList<>();
        for(Coleccionable colec : coleccion){
            ArrayList<Figurita> aux = colec.buscar(cc);
            salida.addAll(aux);
        }
        Collections.sort(salida);
        return salida;
    }
}
