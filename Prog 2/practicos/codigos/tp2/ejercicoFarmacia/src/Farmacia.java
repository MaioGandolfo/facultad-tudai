import java.util.ArrayList;

public class Farmacia {
    private ArrayList<Medicamento> medicamentos;

    public Farmacia(){
        medicamentos = new ArrayList<>();
    }

    public void addMedicamento(Medicamento med){
        if (!medicamentos.contains(med)) {
            medicamentos.add(med);
        }
    }

    public boolean tieneMedicamento(Medicamento med){
        return medicamentos.contains(med);
    }

    public void removeMedicamento(Medicamento med){
        medicamentos.remove(med);
    }

    public ArrayList<Medicamento> buscarMedicamentos (Condicion cc){ // la condicion es and or o not, se la pasa el user por parametro
        ArrayList<Medicamento> salida = new ArrayList<Medicamento>();
        for (int i = 0; i<medicamentos.size(); i++) {
            Medicamento aux = medicamentos.get(i);
            if (cc.cumple(aux)) {
                salida.add(aux);
            }
        }
        return salida;
    }

    public ArrayList<Medicamento> mostrarMedicamentos(){
        return new ArrayList<Medicamento>(medicamentos);
    }
}
