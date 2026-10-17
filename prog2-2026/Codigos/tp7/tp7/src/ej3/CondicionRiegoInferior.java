package ej3;

public class CondicionRiegoInferior extends Condicion{
    private int riegoInferior;

    public CondicionRiegoInferior(int riegoInferior){
        this.riegoInferior = riegoInferior;
    }

    public boolean cumple(Planta pp) {
        return pp.getRiego() < riegoInferior;
    }
}
