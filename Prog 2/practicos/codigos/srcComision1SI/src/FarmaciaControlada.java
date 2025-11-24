
public class FarmaciaControlada extends Farmacia {

	Condicion control;
	
	public void addMedicamento(Medicamento med) {
		
		if(!control.cumple(med)) {
			super.addMedicamento(med);
		}
	}
}
