import java.util.ArrayList;

public abstract class Transporte {

    public abstract int getModelo();
    public abstract int getAsientos();
    public abstract int getKilometros();
    public abstract double getCostoMantenimiento();
    public abstract boolean tieneCaracteristica(String ss);
    public abstract ArrayList<Vehiculo>buscar(Condicion cc);
}
