public class CondicionOr extends Condicion {
    Condicion c1;
    Condicion c2;

    public CondicionOr (Condicion c1, Condicion c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple (Medicamento med){
        return c1.cumple(med) || c2.cumple(med);
    }
}
