package ej3;

import java.util.ArrayList;

public class Vivero {
    private String nombre;
    private ArrayList<Planta> plantas;

    public Vivero (String nombre){
        setNombre(nombre);
        this.plantas = new ArrayList<>();
    }

    public void addPlanta(Planta pp){
        if (!plantas.contains(pp))
            plantas.add(pp);
    }

    public ArrayList<Planta> buscarPlanta(Condicion cc){
        ArrayList<Planta> salida = new ArrayList<>();
        for(Planta pp : plantas){
            if(cc.cumple(pp))
                salida.add(pp);
        }
        return salida;
    }

    public void setNombre(String nombre){
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "--";
    }

    public String getNombre(){
        return nombre;
    }


}
