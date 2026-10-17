package ej3;

public class CondicionInterior extends Condicion{


    @Override
    public boolean cumple(Planta pp) {
        return pp.getInterior();
    }
}
