package FarmaciaBusquedas;

public class CondicionPrecio extends Condicion {
    private int precio;

    public CondicionPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(Medicamento mm) {
        return mm.getPrecio() < precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
