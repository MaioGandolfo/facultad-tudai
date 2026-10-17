package ej2;

public class CondicionOr extends Condicion{
    private Condicion c1, c2;

    public CondicionOr(Condicion c1, Condicion c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(Documento dd){
        return c1.cumple(dd) || c2.cumple(dd);
    }
}
