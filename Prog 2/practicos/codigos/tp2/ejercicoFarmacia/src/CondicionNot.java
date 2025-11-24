public class CondicionNot extends Condicion{

    Condicion c1;

    public CondicionNot (Condicion c1){
        this.c1 = c1;
    }

    public boolean cumple(Medicamento med){
        return !c1.cumple(med);
    }
}
