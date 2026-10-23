public class CondicionCaracteristica extends Condicion{
    private String ss;

    public CondicionCaracteristica(String ss){
        this.ss = ss;
    }

    public boolean cumple(Transporte tt){
        return tt.tieneCaracteristica(ss);
    }
}
