import java.util.ArrayList;

public class Farmacia {

	private ArrayList<Medicamento> remedios;

	public Farmacia() {
		super();
		this.remedios = new ArrayList<Medicamento>();
	}
	
	public void addMedicamento(Medicamento med) {
		if (!remedios.contains(med))
			remedios.add(med);
	}// como pregunto contains con Medicamento hay que implementar equals en Medicamento
	
	public boolean tieneMedicamento(Medicamento med) {
		return remedios.contains(med);
	}
	public void removeMedicamento(Medicamento med) {
		remedios.remove(med);
	} //el remove tambien obliga al equals
	
	
	public ArrayList<Medicamento> buscarTodos(Condicion cond){
		ArrayList<Medicamento> salida = new ArrayList<Medicamento>();
		for(int i = 0; i<remedios.size(); i++) {
			Medicamento auxi = remedios.get(i);
			if (cond.cumple(auxi)) {
				salida.add(auxi);
			}
		}
		
		return salida;
	}

}
