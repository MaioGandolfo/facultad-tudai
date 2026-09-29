import javax.management.Notification;
import java.util.ArrayList;

public class App {
    private String nombre;
    private ArrayList<Notificacion> notificaciones;

    public App (String nombre){
        setNombre(nombre);
        this.notificaciones = new ArrayList<Notificacion>();
    }

    public void addNotificacion(Notificacion nn){
        notificaciones.add(nn);
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
}
