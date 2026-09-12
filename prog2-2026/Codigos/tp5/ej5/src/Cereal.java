import java.util.ArrayList;

public class Cereal {
    private String nombre;
    protected ArrayList<String> mineralesCereal;

    public Cereal (String nombre){
        setNombre(nombre);
        mineralesCereal = new ArrayList<>();
    }

    public boolean cumpleCondicion(Lote ll ,int pos ){
        return mineralesCereal.contains(ll.mineralesLote.get(pos));
    }

    public void setNombre(String nombre){
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "n";
    }

    public String getNombre(){
        return nombre;
    }
}
