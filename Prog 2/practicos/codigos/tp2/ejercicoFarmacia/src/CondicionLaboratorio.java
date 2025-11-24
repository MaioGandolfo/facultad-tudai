public class CondicionLaboratorio extends Condicion{

    private String lab;

    public CondicionLaboratorio (String lab){
        this.lab = lab;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public boolean cumple (Medicamento med){
        return med.getLaboratorio().equalsIgnoreCase(lab);//le pido el lab, despues evaluo que sea igual al lab
    }
}
