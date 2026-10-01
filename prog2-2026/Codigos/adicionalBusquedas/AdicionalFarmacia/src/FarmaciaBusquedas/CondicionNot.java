package FarmaciaBusquedas;

public class CondicionNot extends Condicion {
    private Condicion cc;

    public CondicionNot(Condicion cc) {
        this.cc = cc;
    }

    public boolean cumple(Medicamento mm) {
        return !cc.cumple(mm);
    }

}
