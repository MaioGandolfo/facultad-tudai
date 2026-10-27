public abstract class BonoBursatil {
    private int cuitEmisor;
    private CalculadorRendimiento calcrend;
    public BonoBursatil(int cuitEmisor) {
        this.cuitEmisor = cuitEmisor;
    }

    public double calcularRenmiento(CalculadorRendimiento calcrend) {
        return calcrend.calculador(this);
    }

    public int getCuitEmisor() {
        return cuitEmisor;
    }

    public void setCuitEmisor(int cuitEmisor) {
        this.cuitEmisor = cuitEmisor;
    }

    public abstract double getValor();
    public abstract int getNEmicion();
}
