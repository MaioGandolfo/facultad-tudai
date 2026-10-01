package ej1;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Agroquimico> agroquimicos;

    public Empresa(String nombre){
        setNombre(nombre);
        this.agroquimicos = new ArrayList<>();
    }

    public void addAgroquimico(Agroquimico aa){
        if(!agroquimicos.contains(aa))
            agroquimicos.add(aa);
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
