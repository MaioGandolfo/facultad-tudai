package FarmaciaBusquedas;

import java.util.ArrayList;
import java.util.Locale;

public class Medicamento {
    private String nombre;
    private String laboratorio;
    private ArrayList<String> sintomasCompatible;
    private int precio;

    public Medicamento(String nombre, int precio, String laboratorio) {
        setNombre(nombre);
        setLaboratorio(laboratorio);
        setPrecio(precio);
        this.sintomasCompatible = new ArrayList<>();
    }

    public void addSintoma(String sintoma) {
        if (!sintomasCompatible.contains(sintoma.toLowerCase()))
            sintomasCompatible.add(sintoma.toLowerCase());
    }

    public boolean equals(Object oo) {
        try {
            Medicamento aux = (Medicamento) oo;
            return this.getLaboratorio().equalsIgnoreCase(aux.getLaboratorio()) && this.getNombre().equalsIgnoreCase(aux.getNombre());
        } catch (Exception e) {
            return false;
        }
    }

    public boolean tieneSintoma(String sintoma) {
        return sintomasCompatible.contains(sintoma.toLowerCase());
    }

    public void removerSintoma(String sin) {
        sintomasCompatible.remove(sin.toLowerCase());
    }

    public String toString() {
        return "<" + nombre + "/" + laboratorio + "/$" + precio + ">";
    }

    public void setNombre(String nombre) {
        if (nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "Medicamento sin nombre";
    }

    public void setLaboratorio(String laboratorio) {
        if (laboratorio != null)
            this.laboratorio = laboratorio;
        else
            this.laboratorio = "--";
    }

    public void setPrecio(int precio) {
        if (precio > 0)
            this.precio = precio;
        else
            this.precio = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public int getPrecio() {
        return precio;
    }


}
