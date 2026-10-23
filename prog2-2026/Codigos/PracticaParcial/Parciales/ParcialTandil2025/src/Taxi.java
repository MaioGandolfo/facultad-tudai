public class Taxi extends Vehiculo{
    //El costo de mantenimiento
    //diario es de $2.000 por cada kilómetro recorrido. A este costo se le suma un extra de $500, si el año del
    //vehículo es anterior a 2010.
    private int modeloMinimo;
    private double costoDiario, extra;



    public Taxi(String patente, int kilometros, int modelo, int asientos, int modeloMinimo, double costoDiario, double extra) {
        super(patente, kilometros, modelo, asientos);
        this.modeloMinimo = modeloMinimo;
        this.costoDiario = costoDiario;
        this.extra = extra;
    }

    @Override
    public double getCostoMantenimiento() {
        double salida = costoDiario * this.getKilometros();
        if(this.getModelo() <= modeloMinimo)
            return (salida + extra);
        else
            return salida;
    }
}
