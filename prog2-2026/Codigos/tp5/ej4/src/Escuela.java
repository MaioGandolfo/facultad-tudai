import java.util.ArrayList;

public class Escuela {
    private String nombre;
    private ArrayList <Casa> casas;

    public Escuela (String nombre){
        setNombre(nombre);
        casas = new ArrayList<>();
    }



    public void addCasa(Casa cc){
        if(!casas.contains(cc))
            casas.add(cc);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "sin nombre";
    }
}
