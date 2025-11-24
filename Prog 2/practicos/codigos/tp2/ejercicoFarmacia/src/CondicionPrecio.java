public class CondicionPrecio extends Condicion{

    double precio;

    public CondicionPrecio (double precio){
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean cumple (Medicamento med){
        return med.getPrecio() < precio;
    }
}
