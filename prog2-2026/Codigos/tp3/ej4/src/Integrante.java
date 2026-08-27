import java.time.LocalDate;

public class Integrante {
    private String nombre;
    private String apellido;
    private int numeroPasaporte;
    private LocalDate fNac;
    private String estado;

    public Integrante (String nombre, String apellido, int numeroPasaporte, LocalDate fNac, String estado){
        setNombre(nombre);
        setApellido(apellido);
        setNumeroPasaporte(numeroPasaporte);
        setFechaNacimiento(fNac);
        setEstado(estado);
    }

    public int calcularEdad(){
        LocalDate hoy = LocalDate.now();
        int edad = hoy.getYear() - fNac.getYear();

        if(hoy.getDayOfYear() >= fNac.getDayOfYear())
            return edad;
        else
            return edad++;
    }

    public void setNombre(String nombre) {
        if (nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "n";
    }

    public String getNombre(){
        return nombre;
    }

    public void setApellido(String apellido){
        if(apellido != null)
            this.apellido = apellido;
        else
            this.apellido = "n";
    }

    public String getApellido(){
        return apellido;
    }

    public void setNumeroPasaporte(int numeroPasaporte){
        int min = 10000000;
        int max = 99999999;

        if(numeroPasaporte > 1000)
            this.numeroPasaporte = numeroPasaporte;
        else
            this.numeroPasaporte = (int) (Math.random() * (max - min + 1)) + min;
    }

    public int getNumeroPasaporte(){
        return numeroPasaporte;
    }

    public void setFechaNacimiento(LocalDate fNac){
        LocalDate hoy = LocalDate.now();
        if(fNac.getDayOfYear() < hoy.getDayOfYear() && fNac != null);
            this.fNac = fNac;
    }

    public LocalDate getFechaNacimiento(){
        return fNac;
    }

    public void setEstado(String estado){
        if(estado.equalsIgnoreCase("Viajando") || estado.equalsIgnoreCase("En concentración")
                || estado.equalsIgnoreCase("En país de origien"))
            this.estado = estado;
        else
            this.estado = "no disponible";
    }

    public String getEstado(){
        return estado;
    }


}
