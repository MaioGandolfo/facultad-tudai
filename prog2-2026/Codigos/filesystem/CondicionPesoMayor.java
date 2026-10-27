package filesystem;

public class CondicionPesoMayor extends Condicion  {
    private double pesoMinimo;

    public CondicionPesoMayor(double pesoMinimo) {
        this.pesoMinimo = pesoMinimo;
    }

    @Override
    public boolean cumple(ElementoSA elemento) {
        return elemento.getTamanio() > pesoMinimo;
    }

}
