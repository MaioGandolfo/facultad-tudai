import java.util.ArrayList;

public class Pais {
    private String nombre;
    private ArrayList<Provincia> provincias;

    public Pais (String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
    }

    public void addProvincia (Provincia p1) {
        this.provincias.add(p1);
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Ciudad> ciudadesDeficit () {
        ArrayList<Ciudad> ciudadesEncontradas =  new ArrayList<>();
        for (Provincia p : this.provincias ) {
            ciudadesEncontradas.addAll(p.getCiudadesValidas());
        }
        return ciudadesEncontradas;
    }

    public ArrayList<Provincia> provinciasDeficit () {
        ArrayList<Provincia> provinciasEncontradas =  new ArrayList<>();
        for (Provincia p : this.provincias ) {
            if (p.provDeficit()) {
                provinciasEncontradas.add(p);
            }
        }
        return provinciasEncontradas;
    }
}
