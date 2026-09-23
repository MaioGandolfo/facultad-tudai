import java.time.LocalDate;

public class Auto extends ObjetoAlquilable{
    private String marca;
    private int kilometros;
    private String patente;
    private boolean estaAlquilado;
    private String tipoVehiculo;

    public Auto (String marca, int kilometros, String patente, String tipoVehiculo, LocalDate fechaVencimientoAlquiler){
        super(fechaVencimientoAlquiler);
        setMarca(marca);
        setKilometros(kilometros);
        setPatente(patente);
        setTipoVehiculo(tipoVehiculo);
        this.estaAlquilado = false;
    }

    public boolean equals(Object o){
        Auto aux = (Auto) o;
        try {
            return aux.getPatente().equalsIgnoreCase(this.getPatente());
        }
        catch (Exception e){
            return false;
        }
    }

    public String toString(){
        return  "Marca: " + marca + '\n' + "Kilometros: " + kilometros + '\n' + "Patente: " + patente + '\n' + "Tipo de Vehiculo: " + tipoVehiculo + '\n' + "-----------------------------";
    }

    public boolean esAlquilable(){
        return !estaAlquilado;
    }

    public void alquilado(){
        estaAlquilado = true;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca != null)
            this.marca = marca;
        else
            this.marca = "-";
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        if(kilometros >=0)
            this.kilometros = kilometros;
        else
            this.kilometros = 0;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if(patente != null)
            this.patente = patente;
        else
            this.patente = "AA 000 AA";
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        if(tipoVehiculo.equalsIgnoreCase("naftero") || tipoVehiculo.equalsIgnoreCase("electrico") || tipoVehiculo.equalsIgnoreCase("diesel"))
            this.tipoVehiculo = tipoVehiculo;
        else
            this.tipoVehiculo = "naftero";
    }
}
