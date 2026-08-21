import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Encuesta> encuestas;
    private ArrayList <Empleado> empleados;

    public Empresa (String nombre){
        setNombre(nombre);
        encuestas= new  ArrayList<>();
        empleados= new ArrayList<>();
    }

    public void agregarEncuesta(Encuesta ee){
        if(!encuestas.contains(ee))
            encuestas.add(ee);
    }

    public void addEmpleado(Empleado ee){
        if(!empleados.contains(ee))
            empleados.add(ee);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "N";
    }
}
