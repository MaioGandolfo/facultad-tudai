import java.util.ArrayList;

public class ColeccionRestrictiva extends Coleccion{

    public ColeccionRestrictiva(String nombre, int descuento){
        super(nombre, descuento);
    }

    public ArrayList<Figurita> buscar(Condicion cc){
        return new ArrayList<>();
    }
}
