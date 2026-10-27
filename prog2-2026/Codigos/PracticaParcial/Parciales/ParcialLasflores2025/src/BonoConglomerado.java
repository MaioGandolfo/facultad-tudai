import java.util.ArrayList;

public class BonoConglomerado extends BonoBursatil{
    private ArrayList<BonoBursatil> bonos;

    public BonoConglomerado(int cuitEmisor){
        super(cuitEmisor);
        this.bonos = new ArrayList<>();
    }

    public void addBono(BonoBursatil bb){
        bonos.add(bb);
    }
    @Override
    public double calcularRenmiento(CalculadorRendimiento calcrend) {
        double salida =0;
        for(BonoBursatil bo : bonos) {
            salida+= calcrend.calculador(bo);
        }
        return salida;
    }

    @Override
    public double getValor() {
        double salida = 0;
        for(BonoBursatil bb : bonos)
            salida += bb.getValor();
        return salida;
    }

    @Override
    public int getNEmicion() {
        int salida = 0;
        for(BonoBursatil bb : bonos) {
            int aux = bb.getNEmicion();
            if (aux > salida)
                salida = aux;
        }
        return salida;
    }
}
