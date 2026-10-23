public class CondicionKm extends Condicion{
    private int km;

    public CondicionKm (int km){
        this.km = km;
    }

    public boolean cumple(Transporte tt){
        return tt.getKilometros() < km;
    }
}
