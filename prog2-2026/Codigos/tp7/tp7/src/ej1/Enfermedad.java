package ej1;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> sintomas;

    public Enfermedad (String nombre){
        setNombre(nombre);
        sintomas = new ArrayList<>();
    }

    public void addSintoma(String ss){
        if(!sintomas.contains(ss))
            sintomas.add(ss);
    }

    public boolean tieneSintoma(String ss){
        return sintomas.contains(ss);
    }

    public boolean darSintoma(Agroquimico aa){
        int i=0;
        boolean corto = false;
        while(i < sintomas.size() && !corto){
            if(!aa.trataSintoma(sintomas.get(i)))
                corto = true;
        }
        return corto;
    }



    public boolean equals(Object oo){
        try {
            Enfermedad aux = (Enfermedad) oo;
            return aux.getNombre().equalsIgnoreCase(this.getNombre());
        } catch (Exception e) {
            return false;
        }
    }


    // gets y sets ---------------------------------------------------------------------------------------

    public void setNombre(String nombre){
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "--";
    }

    public String getNombre(){
        return nombre;
    }

    public ArrayList<String> getSintomas(){
        return new ArrayList<String>(sintomas);
    }
}
