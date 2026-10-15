package ej3;

public class CondicionNombreVulgar extends  Condicion{
    private String nombreVulgar;

    public CondicionNombreVulgar(String nombreVulgar){
        this.nombreVulgar = nombreVulgar;
    }

    @Override
    public boolean cumple(Planta pp) {
        return pp.getNombresVulgares().contains(nombreVulgar);
    }
}
