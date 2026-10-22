import java.util.ArrayList;

public abstract class Coleccionable {
    private String nombre;

    private ArrayList<String> caracteristicas;

    public Coleccionable(String nombre) {
        this.nombre = nombre;
    }

    public void addCaracteristica(String caracteristica){
        if(!caracteristicas.contains(caracteristica))
            caracteristicas.add(caracteristica);
    }

    public boolean tieneCaracteristica(String ss){
        return caracteristicas.contains(ss);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public abstract double getPeso();
    public abstract double getVolumen();
}
