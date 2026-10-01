package FarmaciaBusquedas;

import java.util.ArrayList;

public class Farmacia {
    private ArrayList<Medicamento> medicamentos;
    private String nombre;

    public Farmacia(String nombre) {
        setNombre(nombre);
        medicamentos = new ArrayList<>();
    }

    public void addMedicamento(Medicamento mm) {
        if (!medicamentos.contains(mm))
            medicamentos.add(mm);
    }

    public boolean tieneMedicamento(Medicamento mm) {
        return medicamentos.contains(mm);
    }

    public ArrayList<Medicamento> buscarMedicamentos(Condicion cc) {
        ArrayList<Medicamento> salida = new ArrayList<>();
        for (Medicamento mm : medicamentos) {
            if (cc.cumple(mm))
                salida.add(mm);
        }
        return salida;
    }

    public ArrayList<Medicamento> mostrarMedicamentos() {
        return new ArrayList<Medicamento>(medicamentos);
    }

    public void setNombre(String nombre) {
        if (nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "-";
    }

    public String getNombre() {
        return nombre;
    }
}
