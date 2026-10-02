package ej1;

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedadesFrecuentes;

    public Cultivo(String nombre){
        setNombre(nombre);
        this.enfermedadesFrecuentes = new ArrayList<>();
    }

    public  void addEnfermedad(Enfermedad ee){
        if(!enfermedadesFrecuentes.contains(ee))
            enfermedadesFrecuentes.add(ee);
    }


    public boolean equals(Object oo) {
        try {
            Cultivo aux = (Cultivo) oo;
            return aux.getNombre().equalsIgnoreCase(this.getNombre());
        } catch (Exception e) {
            return false;
        }
    }

    public boolean agroquimicoCompatible(Agroquimico aa){
        if(aa.tieneCultivo(this))
            return false;

        for(Enfermedad ee : enfermedadesFrecuentes)
            if(aa.trataEnfermedad(ee))
                return true;
        return false;
    }


    /*
    public boolean TrataEnfermedad(Agroquimico aa){
         if(!aa.tieneCultivo(this)) {
             for (Enfermedad ee : enfermedadesFrecuentes) {
                 if (ee.darSintoma(aa))
                     return false;
             }
         }
         return false;
    }
    */

    // gets y set ---------------------------------------------------------------------------------

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
