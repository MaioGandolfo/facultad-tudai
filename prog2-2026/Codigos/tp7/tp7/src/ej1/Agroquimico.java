package ej1;

import java.util.ArrayList;

public class Agroquimico {
    private String nombre;
    private ArrayList<Cultivo> cultivosAconsejados;
    private ArrayList<String> sintomasCompatibles;

    public Agroquimico(String nombre){
        setNombre(nombre);
        this.cultivosAconsejados = new ArrayList<>();
        this.sintomasCompatibles = new ArrayList<>();
    }

    public void addSintoma(String ss){
        if(!sintomasCompatibles.contains(ss))
            sintomasCompatibles.add(ss.toLowerCase());
    }

    public void addCultivoAconsejado(String cultivo){
        //if(!cultivosAconsejados.contains(cultivo))
        //    cultivosAconsejados.add(cultivo.toLowerCase());
    }

    public boolean trataSintoma(String ss){
        return sintomasCompatibles.contains(ss.toLowerCase());
    }

    public boolean tieneCultivo(String cultivo){
        return cultivosAconsejados.contains(cultivo.toLowerCase());
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
