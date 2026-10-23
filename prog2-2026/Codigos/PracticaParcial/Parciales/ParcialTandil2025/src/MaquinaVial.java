public class MaquinaVial extends  Vehiculo{
    private int horas;
    private static double costo = 3200;

    public MaquinaVial(String patente, int kilometros, int modelo, int asientos, int horas) {
        super(patente, kilometros, modelo, asientos);
        this.horas = horas;
    }

    @Override
    public double getCostoMantenimiento() {
        return costo * horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public static double getCosto() {
        return costo;
    }

    public static void setCosto(double costo) {
        MaquinaVial.costo = costo;
    }


}
