public class Persona {
    private String nombre;
    private String mail;
    private int telefono;


    public Persona(String nombre, String mail, int telefono){
        setNombre(nombre);
        setMail(mail);
        setTelefono(telefono);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "no hay nombre";
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        if(mail != null)
            this.mail = mail;
        else
            this.mail = "sin mail";
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
