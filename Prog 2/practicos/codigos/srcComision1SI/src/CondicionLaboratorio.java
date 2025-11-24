
public class CondicionLaboratorio extends Condicion {

	private String lab;
	
	public CondicionLaboratorio(String lab) {
		super();
		this.lab = lab;
	}

	public boolean cumple(Medicamento med) {
		// TODO Auto-generated method stub
		return med.getLaboratorio().equalsIgnoreCase(lab);
	}

}
