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

    public void alquilarObjeto(ObjetoAlquilable oo){
        if(oo.esAlquilable()) {
            this.objetoAlquilado = oo;
            oo.alquilado();
            addHistorialAlquiler(oo);
        }
    }

    public boolean alquilerPorVencer(int dias){
        return objetoAlquilado.estaPorVencer(dias);
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
        oo.alquilado();
        addHistorialAlquiler(oo);
    }

    public ObjetoAlquilable getObjetoAlquilado(){
        return objetoAlquilado;
    }

    private void addHistorialAlquiler(ObjetoAlquilable oo){
        historialAlquiler.add(oo);
    }


}
