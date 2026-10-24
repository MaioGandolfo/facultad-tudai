import java.util.ArrayList;

public class Coleccion extends Coleccionable{
    ArrayList<Coleccionable> coleccion;

    public Coleccion(String nombre){
        super(nombre);
        this.coleccion = new ArrayList<>();
    }

    public double getPrecio(){
        double salida = 0;
        for(Coleccionable cc : coleccion)
            salida += cc.getPrecio();
        return salida;
    }

    public ArrayList<Figurita>buscar(Condicion cc){
        ArrayList<Figurita> salida = new ArrayList<>();
        for(Coleccionable colec : coleccion){
            ArrayList<Figurita> aux = colec.buscar(cc);
            salida.addAll(aux);
        }
        return salida;
    }
}
