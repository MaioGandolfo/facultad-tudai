package FarmaciaBusquedas;

public class CondicionNombre extends Condicion {
    private String buscdado;

    public CondicionNombre(String nombre) {
        this.buscdado = nombre;
    }

    public boolean cumple(Medicamento mm) {
        return mm.getNombre().contains(buscdado);
    }

    public String getBuscdado() {
        return buscdado;
    }

    public void setBuscdado(String buscdado) {
        this.buscdado = buscdado;
    }
}
