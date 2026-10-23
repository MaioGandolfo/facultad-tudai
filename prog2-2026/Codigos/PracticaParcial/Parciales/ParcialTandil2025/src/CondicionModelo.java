public class CondicionModelo extends  Condicion{
    private int minimo;

    public CondicionModelo(int minimo) {
        this.minimo = minimo;
    }

    public boolean cumple(Transporte tt){
        return tt.getModelo() < minimo;
    }
}
