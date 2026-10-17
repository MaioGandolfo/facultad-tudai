package ej2;

public class CondicionNot extends Condicion{
    private Condicion cc;

    public CondicionNot(Condicion cc){
        this.cc = cc;
    }

    public boolean cumple(Documento dd){
        return !cc.cumple(dd);
    }
}
