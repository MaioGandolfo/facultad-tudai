import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private ArrayList<EncuestaRespondida> encuestaRespondidas;

    public Empleado(String nombre) {
        setNombre(nombre);
        encuestaRespondidas = new ArrayList<>();
    }

    public void agregarEncuestaRespondida(EncuestaRespondida ee, Persona pp){
        if(!encuestaRespondidas.contains(pp)) {
            encuestaRespondidas.add(ee);
        }
    }

    public int getCantEncuestasRealizadas(){
        return encuestaRespondidas.size();
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "N";
    }


}
