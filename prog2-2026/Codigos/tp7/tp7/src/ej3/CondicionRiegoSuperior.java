package ej3;

public class CondicionRiegoSuperior extends Condicion{
    private int riegoSuperior;

    public CondicionRiegoSuperior(int riegoSuperior){
        this.riegoSuperior = riegoSuperior;
    }

    public boolean cumple(Planta pp) {
        return pp.getRiego() > riegoSuperior;
    }
}
