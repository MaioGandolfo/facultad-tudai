import java.util.ArrayList;

public class EmpleadoVenta extends Empleado{
    private ArrayList<Venta> ventas;
    private int porcentajeVenta;

    public EmpleadoVenta (String nombre, int porcentajeVenta){
        super(nombre);
        setPorcentajeVenta(porcentajeVenta);
        ventas = new ArrayList<>();
    }

    public String toString(){
        return super.toString() + '\n' + "porcentaje de ventas: " + porcentajeVenta + '\n' + "ventas totales: " + ventas.size();
    }

    public int pagoTotal(){
        return getSueldoFijo() + (extraVentas());
    }

    public int extraVentas(){
        int suma=0;
        for (Venta v : ventas){
            suma +=v.getPrecioVenta();
        }

        return (int) (suma * (porcentajeVenta / 100.0));
    }

    public void addVenta(Venta vv){
        ventas.add(vv);
    }

    public void setPorcentajeVenta(int porcentajeVenta){
        if(porcentajeVenta > 0)
            this.porcentajeVenta = porcentajeVenta;
        else
            this.porcentajeVenta = 2;
    }



    public int getCantVentas(){
        return ventas.size();
    }

}
