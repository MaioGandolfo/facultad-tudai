import java.util.ArrayList;

public class Provincia {
    private ArrayList <Ciudad> ciudades;
    private double totalRecaudado;
    private String nombre;
    private int cantCiudadesDeficit;

    public Provincia (String nn){
        setNombre(nn);
        this.ciudades = new ArrayList<>();
    }

    public void setTotalRecaudado(double totalRecaudado){
        if(totalRecaudado >0)
            this.totalRecaudado=totalRecaudado;
        else
            this.totalRecaudado=1;
    }

    public boolean estoyDeficit(){
        return this.cantCiudadesDeficit > (ciudades.size()/2);
    }

    public double getTotalRecaudado(){
        return totalRecaudado;
    }

    public void agregarCiudad(Ciudad c1){
        if(!ciudades.contains(c1))
            ciudades.add(c1);
    }

    public ArrayList<Ciudad> ciudadesDeficit(int minimosHabitantes){
        ArrayList <Ciudad> aux = new ArrayList<>();
        for(int i=0; i<ciudades.size(); i++){
            if(ciudades.get(i).getCantHabitantes()> minimosHabitantes) {
                if (ciudades.get(i).estaDeficit())
                    aux.add(ciudades.get(i));
            }
        }
        cantCiudadesDeficit=aux.size();
        return aux;
    }


    public boolean equals (Object o1){
            Provincia aux = (Provincia) o1;
        try {
                return aux.getNombre().equals(this.getNombre());
        } catch (Exception e) {
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Provincia{" + "nombre=" + nombre + '}';
    }
}
