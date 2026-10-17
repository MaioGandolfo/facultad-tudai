package ej3;

public class CondicionSolSuperior extends Condicion{
    private int solSuperior;

    public CondicionSolSuperior(int solSuperior){
        this.solSuperior = solSuperior;
    }

    public boolean cumple(Planta pp){
        return pp.getSol() > solSuperior;
    }
}
