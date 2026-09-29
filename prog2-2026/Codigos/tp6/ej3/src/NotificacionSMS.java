import java.util.SortedMap;

public class NotificacionSMS extends Notificacion{
    private long nroTelefono;

    public NotificacionSMS (String mensaje, String nombreDestinatario, String apellidoDestinatario, long nroTelefono){
        super(mensaje, nombreDestinatario, apellidoDestinatario);
        setNroTelefono(nroTelefono);
    }

    public void enviarMensaje(){
        this.prepararNotificacion();
        System.out.println("Enviando SMS al numero: <" + nroTelefono + "> perteneciente a <" +
                getNombreDestinatario() + " " + getApellidoDestinatario() + "> : " + getMensaje());
    }

    public void setNroTelefono(long nroTelefono){
        if(nroTelefono > 0)
            this.nroTelefono = nroTelefono;
        else
            this.nroTelefono = 24944949449L;
    }

    public long getNroTelefono(){
        return nroTelefono;
    }
}
