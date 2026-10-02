package ej1;

public class CondicionEnfermedadDeterminada extends Condicion {
    private Enfermedad ee;

    public CondicionEnfermedadDeterminada(Enfermedad ee) {
        this.ee = ee;
    }

    @Override
    public boolean cumple(Agroquimico aa) {
        return aa.trataEnfermedad(ee);
    }

}
