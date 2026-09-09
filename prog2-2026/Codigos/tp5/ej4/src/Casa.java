import javax.swing.*;
import java.util.ArrayList;

public class Casa {
    private String nombre;
    protected ArrayList<Alumno> alumnos;
    protected ArrayList<String> cualidadesAceptadas;
    private int cantAlumnosMax;

    public Casa(String nombre, int cantAlumnosMax){
        setNombre(nombre);
        setCantAlumnosMax(cantAlumnosMax);
        alumnos = new ArrayList<>();
        cualidadesAceptadas = new ArrayList<>();
    }




    public void addCualidades(String cualidad){
        if(!cualidadesAceptadas.contains(cualidad))
            cualidadesAceptadas.add(cualidad);
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

    public void setCantAlumnosMax(int cantAlumnosMax){
        if(cantAlumnosMax > 0)
            this.cantAlumnosMax = cantAlumnosMax;
        else
            this.cantAlumnosMax = 1;
    }

    public int getCantAlumnosMax() {
        return cantAlumnosMax;
    }
}
