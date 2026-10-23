public class FlotaLimitada extends Flota{
    private Condicion cc;

    public FlotaLimitada(Condicion cc){
        super();
        this.cc = cc;
    }

    public void addElemento(Transporte tt, Condicion cc){
        if(cc.cumple(tt))
            super.addElemento(tt);
    }
}
