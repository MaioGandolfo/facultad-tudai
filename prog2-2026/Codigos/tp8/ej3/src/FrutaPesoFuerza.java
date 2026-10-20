public class FrutaPesoFuerza extends FrutaPeso {

    public FrutaPesoFuerza(int fuerza, int pesoMultiplicar){
        super(fuerza, pesoMultiplicar);
    }

    public void comer(Personaje pp){
        pp.setFuerza(this.getFuerza() + (pp.getPeso() * this.getPesoMultiplicar()));
    }
}
