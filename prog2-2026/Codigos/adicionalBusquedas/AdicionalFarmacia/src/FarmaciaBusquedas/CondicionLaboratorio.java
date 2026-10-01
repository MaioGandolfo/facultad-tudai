package FarmaciaBusquedas;

public class CondicionLaboratorio extends Condicion {
    private String lab;

    public CondicionLaboratorio(String lab) {
        this.lab = lab;
    }

    public boolean cumple(Medicamento mm) {
        return mm.getLaboratorio().equalsIgnoreCase(lab);
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }
}
