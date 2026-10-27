import java.util.ArrayList;

public class ColeccionRestrictiva extends Coleccion{

    public ColeccionRestrictiva(String nombre){
        super(nombre);
    }

    public ArrayList<Figurita> buscar(Condicion cc){
        return new ArrayList<>();
    }
}
