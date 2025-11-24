public class CondicionSintoma extends Condicion{

    String sintoma;

    public CondicionSintoma (String sintoma){
        this.sintoma = sintoma;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    @Override
    public boolean cumple(Medicamento med) {
        return med.tieneSintoma(sintoma);
    }
}
