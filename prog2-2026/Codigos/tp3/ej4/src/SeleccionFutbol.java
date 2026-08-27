import java.util.ArrayList;

public class SeleccionFutbol {
    private ArrayList<Integrante> integrantes;
    private String nombre;

    public SeleccionFutbol (String nombre){
        setNombre(nombre);
        integrantes = new ArrayList<>();
    }

    public void setNombre(String nombre){
        if(nombre != null)
            this.nombre = "selección " + nombre;
        else
            this.nombre = "";
    }

    public String getNombre(){
        return nombre;
    }

}
