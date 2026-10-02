package ej1;

public class CondicionCultivo extends Condicion{
    private Cultivo cc;

    public CondicionCultivo(Cultivo cc){
        this.cc = cc;
    }

    @Override
    public boolean cumple(Agroquimico aa) {
        return cc.agroquimicoCompatible(aa);
    }
}
