public class Comprimido extends Directorio{
    private double tasaCompresion;

    public Comprimido(String nombre, double tasaCompresion){
        super(nombre);
        this.tasaCompresion = tasaCompresion;
    }

    @Override
    public double getTamanio() {
        return super.getTamanio() * this.getTasaCompresion();
    }

    public String toString() {
        return "#" + super.toString() + "#";
    }

    public double getTasaCompresion() {
        return tasaCompresion;
    }

    public void setTasaCompresion(int tasaCompresion) {
        this.tasaCompresion = tasaCompresion;
    }
}
