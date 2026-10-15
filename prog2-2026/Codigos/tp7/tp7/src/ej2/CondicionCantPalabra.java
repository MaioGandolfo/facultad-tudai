package ej2;

public class CondicionCantPalabra extends Condicion{
    private int cantPalabras;

    public CondicionCantPalabra(int cantPalabras){
        this.cantPalabras = cantPalabras;
    }

    @Override
    public boolean cumple(Documento dd) {
        return dd.getContenidoTextual().length() < cantPalabras;
    }
}
