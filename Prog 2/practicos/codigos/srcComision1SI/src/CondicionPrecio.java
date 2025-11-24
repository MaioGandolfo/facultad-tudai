
public class CondicionPrecio extends Condicion {

	double precio;
	
	public CondicionPrecio(double precio) {
		super();
		this.precio = precio;
	}

	public boolean cumple(Medicamento med) {
		
		return med.getPrecio()<precio;
	}

}
