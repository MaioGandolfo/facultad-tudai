//NO SIRVE PORQUE SI AHORA VOY CONTRA BAYER ES CLASE NUEVA
public class FarmaciaAntiBago extends Farmacia {
//MAL NO USAR
	public void addMedicamento(Medicamento med) {
		//CONSTANTE EN CODIGO
		if(!med.getLaboratorio().equalsIgnoreCase("Bago"))
			super.addMedicamento(med);//ANTI OBJETOS
		//MARCELO LOS DESAPRUEBA
	}
}
