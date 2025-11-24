
public class FarmaciaAntiLaboratorio extends Farmacia {

	private String laboratorio; //ANTI
	public void addMedicamento(Medicamento med) {
		
		if(!med.getLaboratorio().equalsIgnoreCase(laboratorio))
			super.addMedicamento(med);
	
	}
}
