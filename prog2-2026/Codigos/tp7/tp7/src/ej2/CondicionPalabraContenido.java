package ej2;

public class CondicionPalabraContenido extends Condicion{
    private String palabra;

    public CondicionPalabraContenido(String palabra){
        this.palabra = palabra;
    }

    public boolean cumple(Documento dd){
        return dd.getContenidoTextual().contains(palabra);
    }

}
