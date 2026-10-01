package FarmaciaBusquedas;

public class CondicionSintoma extends Condicion {
    private String sintoma;

    public CondicionSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    @Override
    public boolean cumple(Medicamento mm) {
        return mm.tieneSintoma(sintoma);
    }


    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }


}
