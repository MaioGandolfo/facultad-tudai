public class Colectivo extends Vehiculo{
    private int costoMantenimiento;

    public Colectivo(String patente, int kilometros, int modelo, int asientos, int costoMantenimiento) {
        super(patente, kilometros, modelo, asientos);
        this.costoMantenimiento = costoMantenimiento;
    }

    @Override
    public double getCostoMantenimiento() {
        return costoMantenimiento * this.getAsientos();
    }

    public void setCostoMantenimiento(int costoMantenimiento) {
        this.costoMantenimiento = costoMantenimiento;
    }
}
