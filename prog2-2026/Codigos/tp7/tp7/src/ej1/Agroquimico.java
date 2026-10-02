package ej1;

import java.util.ArrayList;

public class Agroquimico {
    private String nombre;
    private ArrayList<Cultivo> cultivosNoAconsejados;
    private ArrayList<String> sintomasCompatibles;

    public Agroquimico(String nombre){
        setNombre(nombre);
        this.cultivosNoAconsejados = new ArrayList<>();
        this.sintomasCompatibles = new ArrayList<>();
    }

    public void addSintoma(String ss){
        if(!sintomasCompatibles.contains(ss))
            sintomasCompatibles.add(ss.toLowerCase());
    }

    public void addCultivoNoAconsejado(Cultivo cc){
        if(!cultivosNoAconsejados.contains(cc))
            cultivosNoAconsejados.add(cc);
    }

    public boolean trataSintoma(String ss){
        return sintomasCompatibles.contains(ss.toLowerCase());
    }

    public boolean tieneCultivo(Cultivo cc){
        return cultivosNoAconsejados.contains(cc);
    }

    public boolean trataEnfermedad(Enfermedad ee){
        ArrayList<String> aux = ee.getSintomas();
        for(String e : aux){
            if(!this.trataSintoma(e))
                return false;
        }
        return true;
    }

    public boolean equals(Object oo) {
        try {
            Agroquimico aux = (Agroquimico) oo;
            return aux.getNombre().equalsIgnoreCase(this.getNombre());
        } catch (Exception e) {
            return false;
        }
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
