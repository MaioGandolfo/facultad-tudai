public abstract class Fruta {
    private int fuerza;

    public Fruta(int fuerza){
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public abstract void comer(Personaje pp);


}
