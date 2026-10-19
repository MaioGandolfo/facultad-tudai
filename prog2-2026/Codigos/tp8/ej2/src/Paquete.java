public class Paquete extends Item{
    private int peso;

    public Paquete(String ciudadDestino, int peso){
        super(ciudadDestino);
        this.peso = peso;
    }

    @Override
    public int getPeso() {
        return peso;
    }
}
