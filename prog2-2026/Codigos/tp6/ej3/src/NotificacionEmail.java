public class NotificacionEmail extends Notificacion{
    private String email;

    public NotificacionEmail(String mensaje, String nombreDestinatario, String apellidoDestinatario, String email){
        super(mensaje, nombreDestinatario , apellidoDestinatario);
        setEmail(email);
    }

    @Override
    public void enviarMensaje() {
        this.prepararNotificacion();
        System.out.println("Enviando Email a " + email + " : " + this.getMensaje());
    }

    public void setEmail(String email){
        if(email.contains("@"))
            this.email = email;
        else
            this.email = "exactas@gmail.com";
    }

    public String getEmail() {
        return email;
    }
}
