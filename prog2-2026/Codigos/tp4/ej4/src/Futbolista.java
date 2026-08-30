import java.time.LocalDate;

public class Futbolista extends Integrante{
    private String posicion;
    private String pieHabil;
    private int cantGoles;

    public Futbolista (String nombre, String apellido, int numeroPasaporte, LocalDate fNac, String estado, String posicion, String pieHabil, int cantGoles){
        super(nombre, apellido, numeroPasaporte, fNac, estado);
        setPosicion(posicion);
        setPieHabil(pieHabil);
        setCantGoles(cantGoles);
    }

    public void setPosicion (String posicion){
        if(posicion != null)
            this.posicion = posicion;
        else
            this.posicion = "arquero";
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPieHabil(String pieHabil){
        if(pieHabil.equalsIgnoreCase("zurdo") || pieHabil.equalsIgnoreCase("derecho"))
            this.pieHabil = pieHabil;
        else
            this.pieHabil = "derecho";
    }

    public String getPieHabil() {
        return pieHabil;
    }

    public void setCantGoles(int cantGoles){
        if(cantGoles >= 0)
            this.cantGoles = cantGoles;
        else
            this.cantGoles = 0;
    }

    public int getCantGoles() {
        return cantGoles;
    }

    public String toString(){
        return super.toString() + '\n' + "posición: " + posicion + '\n' + "píe habil: " + pieHabil + '\n' + "cantidad de goles: " + cantGoles;
    }
}
