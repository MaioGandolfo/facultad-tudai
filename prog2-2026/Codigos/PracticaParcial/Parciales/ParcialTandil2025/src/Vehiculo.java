import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public abstract class Vehiculo extends Transporte{
    //patente, un modelo (año), los kilómetros recorridos y una determinada cantidad de asientos.
    private int kilometros, modelo, asientos;
    private String patente;
    private ArrayList<String> caracteristicas;

    public Vehiculo(String patente, int kilometros, int modelo, int asientos){
        this.patente = patente;
        this.kilometros = kilometros;
        this.modelo = modelo;
        this.asientos = asientos;
        this.caracteristicas = new ArrayList<>();
    }

    public ArrayList<Vehiculo>buscar(Condicion cc){
        ArrayList<Vehiculo> salida = new ArrayList<>();
        if(cc.cumple(this))
            salida.add(this);
        return salida;
    }

    public void addCaracteristica(String ss){
        if(!caracteristicas.contains(ss))
            caracteristicas.add(ss);
    }

    public boolean tieneCaracteristica(String ss){
        return caracteristicas.contains(ss);
    }

    @Override
    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    @Override
    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
