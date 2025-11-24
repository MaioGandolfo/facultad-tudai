
public class CondicionNot extends Condicion {

	Condicion c1;
	
	public CondicionNot(Condicion c1) {
		super();
		this.c1 = c1;
	}

	public boolean cumple(Medicamento med) {
		// TODO Auto-generated method stub
		return !c1.cumple(med);
	}

}
