import java.lang.foreign.AddressLayout;
import java.util.ArrayList;

public class Persona {
    private String nombre;
    private static int contadorId;
    private int id;
    private ObjetoAlquilable objetoAlquilado;
    private ArrayList<ObjetoAlquilable> historialAlquiler;

    public Persona(String nombre){
        setNombre(nombre);
        contadorId ++;
        this.id = contadorId;
        historialAlquiler = new ArrayList<>();
    }

    public void setNombre(String nombre){
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = " ";
    }

    public String getNombre(){
        return nombre;
    }

    public void setObjetoAlquilado(ObjetoAlquilable oo){
        this.objetoAlquilado = oo;
        addHistorialAlquiler(oo);
    }

    private void addHistorialAlquiler(ObjetoAlquilable oo){
        historialAlquiler.add(oo);
    }


}
