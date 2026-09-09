import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<String> cualidades;
    private ArrayList<String> familiaresEscuela;

    public Alumno(String nombre){
        setNombre(nombre);
        cualidades = new ArrayList<>();
        familiaresEscuela = new ArrayList<>();
    }

    public void addCualidad(String cc){
        if(!cualidades.contains(cc))
            cualidades.add(cc);
    }





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "juan";
    }
}
