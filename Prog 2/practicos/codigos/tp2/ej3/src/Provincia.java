import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList<Ciudad> ciudades;
    private final int MINHAB = 100000;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addCiudad (Ciudad c1) {
        this.ciudades.add(c1);
    }

    public ArrayList<Ciudad> getCiudadesValidas() {
        ArrayList<Ciudad> ciudadX = new ArrayList<>();
        for (Ciudad c : this.ciudades) {
            if (c.getCantHabitantes() > MINHAB && c.gastoTotal()) {
                ciudadX.add(c);
            }
        }
        return ciudadX;
    }

    public boolean provDeficit () {
        return getCiudadesValidas().size() > ciudades.size()/2;
    }

    @Override
    public String toString() {
        return "Provincia{" + "nombre=" + nombre + '}';
    }


}
