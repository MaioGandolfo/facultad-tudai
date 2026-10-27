import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class ObjBrigada {
    private String nombre;

    public ObjBrigada(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int GetaniosExperiencia();
    public abstract int getVelocidadReaccion();
    public abstract int getIngenio();
    public abstract ArrayList<Agente>buscar(Condicion cc);

}
