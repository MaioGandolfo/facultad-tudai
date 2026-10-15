package ej3;

public class CondicionNombreCientifico extends Condicion{
    private String buscado;

    public CondicionNombreCientifico(String buscado){
        this.buscado = buscado;
    }

    public boolean cumple(Planta pp){
        return pp.getNombreCientifico().contains(buscado);
    }
}
