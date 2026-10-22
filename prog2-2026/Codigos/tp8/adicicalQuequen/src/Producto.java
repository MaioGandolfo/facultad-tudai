public class Producto extends Coleccionable{
    private double peso, volumen;

    public Producto(String nombre, double peso, double volumen){
        super(nombre);
        this.peso = peso;
        this.volumen = volumen;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }
}
