public abstract class CalculadorAura {
    private int multi;

    public CalculadorAura(int multi) {
        this.multi = multi;
    }

    public int getMulti() {
        return multi;
    }

    public void setMulti(int multi) {
        this.multi = multi;
    }

    public abstract int calcular(Jugador jj);
}
