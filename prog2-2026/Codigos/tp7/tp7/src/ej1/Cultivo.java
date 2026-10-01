package ej1;

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedadesFrecuentes;

    public Cultivo(String nombre){
        setNombre(nombre);
        this.enfermedadesFrecuentes = new ArrayList<>();
    }

    public void setNombre(String nombre){
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "---";
    }

    public String getNombre(){
        return nombre;
    }
}
