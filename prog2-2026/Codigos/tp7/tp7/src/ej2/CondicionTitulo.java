package ej2;

public class CondicionTitulo extends Condicion{
    private String titulo;

    public CondicionTitulo(String titulo){
        this.titulo = titulo;
    }


    public boolean cumple(Documento dd) {
        return dd.getTitulo().equalsIgnoreCase(titulo);
    }
}
