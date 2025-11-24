import java.util.ArrayList;
import java.util.Objects;

public class Medicamento {
    private String nombre;
    private String laboratorio;
    private double precio;
    private ArrayList<String> sintomas;

    public Medicamento(String nombre, double precio, String laboratorio) {
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.precio = precio;
        sintomas = new ArrayList<String>();
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void addSintoma(String sin) {
        if (!sin.contains(sin.toLowerCase())) {
            sintomas.add(sin.toLowerCase());
        }
    }

    public boolean tieneSintoma(String sin) {
        return sintomas.contains(sin.toLowerCase());
    }

    public void removeSintoma(String sin) {
        sintomas.remove(sin.toLowerCase());
    }

    public boolean equals(Object o1) {
        try {
            Medicamento md = (Medicamento) o1;

            return nombre.equalsIgnoreCase(md.getNombre()) && laboratorio.equalsIgnoreCase(md.getLaboratorio());
        } catch (Exception e) {
            return false;
        }
    }

    public String toString() {
        return "<" + nombre + "/" + laboratorio + "/$" + precio + ">";
    }
}