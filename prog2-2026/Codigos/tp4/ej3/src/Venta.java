public class Venta {
    private int precioVenta;

    public Venta (int precioVenta){
        setPrecioVenta(precioVenta);
    }

    public void setPrecioVenta(int precioVenta){
        this.precioVenta = precioVenta;
    }

    public int getPrecioVenta(){
        return precioVenta;
    }
}
