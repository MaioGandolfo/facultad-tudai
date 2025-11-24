import java.util.ArrayList;

public class Establecimiento {
    private String nombre;
    private ArrayList<Cancha> canchas;
    private ArrayList<Persona> personas;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Establecimiento(String nombre) {
        this.nombre = nombre;
        this.canchas = new ArrayList<>();
    }

    public void registrarTurno (Persona usuario, Cancha cc) {
        if (cc.getTieneTurno()==false)

    }
}
