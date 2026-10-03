package ej2;

public class CondiconPalabraClave extends Condicion{
    private String palabra;

    public CondiconPalabraClave(String palabra){
        this.palabra = palabra;
    }

    public boolean cumple(Documento dd){
        return dd.tienePalabraClave(palabra);
    }
}
