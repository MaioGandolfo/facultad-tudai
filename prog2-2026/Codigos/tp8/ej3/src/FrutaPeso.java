public class FrutaPeso extends Fruta {
    private int pesoMultiplicar;

    public FrutaPeso(int fuerza, int pesoMultiplicar){
        super(fuerza);
        this.pesoMultiplicar = pesoMultiplicar;
    }

    @Override
    public void comer(Personaje pp) {
        pp.setFuerza(pp.getPeso() * this.pesoMultiplicar);
    }

    public int getPesoMultiplicar() {
        return pesoMultiplicar;
    }

    public void setPesoMultiplicar(int pesoMultiplicar) {
        this.pesoMultiplicar = pesoMultiplicar;
    }
}
