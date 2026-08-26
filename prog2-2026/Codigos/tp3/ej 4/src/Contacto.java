import java.time.LocalDate;

public class Contacto {
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private String direccion;
    private String mail;
    private int numeroTelefono;
    private String ciudad;

    public Contacto (String nombre, String apellido, LocalDate fechaNac, String direccion, String mail, int numeroTelefono, String ciudad){
        setNombre(nombre);
        setApellido(apellido);
        setFechaNac(fechaNac);
        setDireccion(direccion);
        setMail(mail);
        setNumeroTelefono(numeroTelefono);
        setCiudad(ciudad);
    }

    public boolean equals (Object o1){
        Contacto aux = (Contacto) o1;
        try {
            return aux.getNombre().equals(this.getNombre()) && aux.getApellido().equals(this.getApellido()) && aux.getNumeroTelefono() == this.getNumeroTelefono();
        } catch (Exception e) {
            return false;
        }
    }

    public String toString(){
        return "nombre: " + nombre + '\n' + "apellido :" + apellido + '\n' + "fecha de nacimiento :" + fechaNac + '\n' +
                "edad :" + getEdad() +'\n' +"dirección :" + direccion + '\n' + "mail :" + mail + '\n' +
                "numero de telefono :" + numeroTelefono + '\n' + "ciudad :" + ciudad + '\n' + "-------------------------";
    }


    public int getEdad(){
        LocalDate hoy = LocalDate.now();
        int edad = hoy.getYear() - fechaNac.getYear();
        if(hoy.getDayOfYear() >= fechaNac.getDayOfYear())
            return edad;
        else
            return edad++;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "";
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if(apellido !=  null)
            this.apellido = apellido;
        else
            this.apellido = "";
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        LocalDate aux = LocalDate.now();
        if(fechaNac.getYear() <  aux.getYear())
            this.fechaNac = fechaNac;
        else
            this.fechaNac = LocalDate.now() ;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if(direccion != null)
            this.direccion = direccion;
        else
            this.direccion = "";
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        if(mail != null)
            this.mail = mail;
        else
            this.mail = "";
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
            this.numeroTelefono = numeroTelefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        if(ciudad != null)
            this.ciudad = ciudad;
        else
            this.ciudad = "";
    }
}
