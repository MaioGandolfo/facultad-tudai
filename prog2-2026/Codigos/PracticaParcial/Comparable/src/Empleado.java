import java.util.Comparator;

public class Empleado implements Comparable<Empleado> {
    private String nombre, apellido;
    private int legajo;
    private double sueldo;

    public Empleado(int legajo, String nombre, String apellido  ,double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.legajo = legajo;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return this.legajo + "-" + this.apellido + ", " + this.nombre + "(" + this.getSueldo() + ") |" ;
    }


    public int compareTo1(Empleado o) {
        return this.legajo - o.getLegajo();
    }

    public int compareTo(Empleado ee){
        double resta = this.getSueldo() - ee.getSueldo();
        if(resta < 0)
            return -1;
        else if(resta > 0)
            return 1;
        else
           return this.getNombre().compareTo(ee.getNombre());
    }
}
