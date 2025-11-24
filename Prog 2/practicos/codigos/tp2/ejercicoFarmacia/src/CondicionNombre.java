public class CondicionNombre extends Condicion {
    String buscado;

    public CondicionNombre (String buscado){
        this.buscado = buscado;
    }

    public String getBuscado() {
        return buscado;
    }

    public void setBuscado(String buscado) {
        this.buscado = buscado;
    }

    public boolean cumple (Medicamento med){
        return med.getNombre().contains(buscado);
    }
}
