public class Ciudad {
    private String nombre;
    private double cantHabitantes;
    private double gasto;
    private double imp1;
    private double imp2;
    private double imp3;
    private double imp4;

    public Ciudad (String nombre, double cantHabitantes, double gasto, double imp1,  double imp2, double imp3, double imp4) {
        this.nombre = nombre;
        this.cantHabitantes = cantHabitantes;
        this.gasto = gasto;
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getCantHabitantes() {
        return cantHabitantes;
    }

    public double recuadado () {
        return imp1 + imp2 + imp3 + imp4;
    }

    public boolean gastoTotal() {
        return recuadado() < gasto;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", cantHabitantes=" + cantHabitantes +
                ", gasto=" + gasto +
                ", imp1=" + imp1 +
                ", imp2=" + imp2 +
                ", imp3=" + imp3 +
                ", imp4=" + imp4 +
                '}';
    }
}
