import java.util.ArrayList;
import java.util.concurrent.locks.Condition;

public abstract class ObjAura {
    private String nombre;

    public ObjAura(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int getTemDebut();
    public abstract int getCantVictorias();
    public abstract boolean tieneMoviemiento(String ss);
    public abstract ArrayList<Jugador>buscar(Condicion cc);
    public abstract int getXp();
    public abstract int calcularAura();
}
