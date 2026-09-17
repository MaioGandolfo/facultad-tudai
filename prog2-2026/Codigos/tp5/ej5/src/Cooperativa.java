import java.util.ArrayList;

public class Cooperativa {
    private String nombre;
    private ArrayList<Lote> lotes;
    private ArrayList<Lote> lotesEspeciales;
    private ArrayList<Lote> lotesComunes;


    public Cooperativa (String nombre){
        setNombre(nombre);
        lotes = new ArrayList<>();
        lotesEspeciales = new ArrayList<>();
        lotesComunes = new ArrayList<>();
    }

    public void addLote(Lote ll){
        lotes.add(ll);
    }


    public void setNombre(String nombre){
        String prederteminado = "Cooperativa ";
        if(nombre != null)
            this.nombre = prederteminado + nombre;
        else
            this.nombre = prederteminado + "del estado";
    }

    public String getNombre(){
        return nombre;
    }
}
