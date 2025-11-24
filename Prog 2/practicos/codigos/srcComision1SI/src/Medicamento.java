 - newimport java.util.ArrayList;

public class Medicamento {

	private String nombre;//get y set
	private double precio;//get y set
	private String laboratorio; //get y set
	private ArrayList<String> sintomas;//add contine borrar
	
	public Medicamento(String nombre, double precio, String laboratorio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.laboratorio = laboratorio;
		sintomas = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	
	public void addSintoma(String sin) {
		if (!sintomas.contains(sin.toLowerCase())) {
			sintomas.add(sin.toLowerCase());
		}
	}
	
	public boolean tieneSintoma(String sin) {
		return sintomas.contains(sin.toLowerCase());
	}  //pregunto con un STRING ya tiene implementado el equals
	
	public void borrarSintoma(String ss) {
	   sintomas.remove(ss.toLowerCase());
	}
	
	public boolean equals(Object o1) {
		try {
			Medicamento md = (Medicamento) o1;
			
			return nombre.equalsIgnoreCase(md.getNombre()) && 
					laboratorio.equalsIgnoreCase(md.getLaboratorio());
		} catch(Exception e) {
			return false;
		}
		

	}
	public String toString() {
		return "<" + nombre +"-" +laboratorio + "-" + precio +">";
	}
}
