
public class CondicionNombreContiene extends Condicion {

	String buscado;//get set y constructor
	
	
	
	public CondicionNombreContiene(String buscado) {
		super();
		this.buscado = buscado;
	}



	public boolean cumple(Medicamento med) {
		
		return med.getNombre().contains(buscado);
	}

}
