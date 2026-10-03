package ej2;

import java.util.ArrayList;

public class Historiador {
    private ArrayList<Documento> documentos;
    private String nombre;

    public Historiador(String nombre){
        setNombre(nombre);
        this.documentos = new ArrayList<>();
    }

    public void addDocumento(Documento dd){
        if(!documentos.contains(dd))
            documentos.add(dd);
    }

    public ArrayList<Documento> buscarDocumento(Condicion cc){
        ArrayList<Documento> salida = new ArrayList<>();
        for(Documento dd : documentos){
            if(cc.cumple(dd))
                salida.add(dd);
        }
        return salida;
    }


    //get y sets -----------------------------------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "--";
    }
}
