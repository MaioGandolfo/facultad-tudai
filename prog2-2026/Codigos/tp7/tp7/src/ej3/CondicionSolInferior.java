package ej3;

public class CondicionSolInferior extends Condicion{
    private int solInferior;

    public CondicionSolInferior(int solInferior){
        this.solInferior = solInferior;
    }

    public boolean cumple(Planta pp) {
        return pp.getSol() < this.getSolInferior();
    }

    public int getSolInferior() {
        return solInferior;
    }

    public void setSolInferior(int solInferior) {
        this.solInferior = solInferior;
    }
}
