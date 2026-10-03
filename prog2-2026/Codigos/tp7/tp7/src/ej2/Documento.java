package ej2;
import java.util.ArrayList;

public class Documento {
    private String titulo;
    private String contenidoTextual;
    private ArrayList<String> autores;
    private ArrayList<String> palabrasClave;

    public Documento(String titulo, String contenidoTextual){
        setTitulo(titulo);
        setContenidoTextual(contenidoTextual);
        this.autores = new ArrayList<>();
        this.palabrasClave = new ArrayList<>();
    }

    public void addAutor(String aa){
        if(!autores.contains(aa))
            autores.add(aa);
    }

    public void addPalabraClave(String pp){
        if(!palabrasClave.contains(pp))
            palabrasClave.add(pp);
    }

    public boolean tienePalabraClave(String pp){
        return palabrasClave.contains(pp);
    }

    ////gets y sets

    private String esValido(String ss){
        if(ss != null)
            return ss;
        else
            return "--";
    }

    public void setTitulo(String nombre){
        this.titulo = esValido(nombre);
    }

    public void setContenidoTextual(String contenidoTextual){
        this.contenidoTextual = esValido(contenidoTextual);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenidoTextual() {
        return contenidoTextual;
    }

    //// fin de gets y sets

}
