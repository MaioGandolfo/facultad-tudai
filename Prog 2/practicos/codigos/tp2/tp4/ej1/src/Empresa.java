import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Encuesta> encuestas;
    private ArrayList<Empleado> empleados;

    public Empresa (String nombre){
        this.nombre = nombre;
        encuestas = new ArrayList<>();
        empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addEncuesta(Encuesta e1){
        if (!encuestas.contains(e1)){
            encuestas.add(e1);
        }
    }

    public ArrayList<Encuesta> mostrarEncuestas(){
        return new ArrayList<Encuesta>(encuestas);
    }

    public void addEmpleado(Empleado emple) {
        if (!empleados.contains(emple)) {
            empleados.add(emple);
        }
    }


}
