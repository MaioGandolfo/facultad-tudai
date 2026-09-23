import java.time.LocalDate;

public class Pelicula extends ObjetoAlquilable{
    private String nombre;
    private String infoFilmografica;
    private int copias;

    public Pelicula(String nombre, String infoFilmografica, int copias, LocalDate fechaVencimietoAlquiler){
        super(fechaVencimietoAlquiler);
        setNombre(nombre);
        setInfoFilmografica(infoFilmografica);
        setCopias(copias);
    }

    public boolean esAlquilable(){
        return getCopias() > 0;
    }

    public boolean equals(Object o){
        Pelicula aux = (Pelicula) o;
        try {
            return aux.getNombre().equalsIgnoreCase(this.getNombre());
        } catch (Exception e) {
            return false;
        }
    }

    public String toString() {
        return "nombre" + nombre + '\n' + "info Filmografica: " + infoFilmografica + '\n' + "copias: " + copias + '\n' + "---------------------------------" ;
    }

    public void alquilado(){
        this.copias--;
    }

    public void setNombre(String nombre){
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "-";
    }

    public String getNombre(){
        return nombre;
    }

    public void setInfoFilmografica(String infoFilmografica){
        if(infoFilmografica != null)
            this.infoFilmografica = infoFilmografica;
        else
            this.infoFilmografica = "-";
    }

    public String getInfoFilmografica(){
        return infoFilmografica;
    }

    public void setCopias(int copias){
        if(copias >0)
            this.copias = copias;
        else
            this.copias = 1;
    }

    public int getCopias(){
        return copias;
    }

}
