public abstract class Notificacion {
    private String mensaje;
    private String nombreDestinatario, apellidoDestinatario;

    public Notificacion(String mensaje, String nombreDestinatario, String apellidoDestinatario){
        setMensaje(mensaje);
        setNombreDestinatario(nombreDestinatario);
        setApellidoDestinatario(apellidoDestinatario);
    }

    public void prepararNotificacion(){
        System.out.println("Preparando notificación para " + nombreDestinatario + " " + apellidoDestinatario);
    }

    public abstract void enviarMensaje();







    private String esValido(String x){
        if(x != null)
            return x;
        else
            return "-";
    }

    public void setMensaje(String mensaje){
        this.mensaje = esValido(mensaje);
    }

    public void setNombreDestinatario(String nombreDestinatario){
        this.nombreDestinatario = esValido(nombreDestinatario);
    }

    public void  setApellidoDestinatario(String apellidoDestinatario){
        this.apellidoDestinatario = esValido(apellidoDestinatario);
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public String getApellidoDestinatario() {
        return apellidoDestinatario;
    }
}
