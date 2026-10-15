package ej3;

import java.util.ArrayList;

public class Planta {
    private ArrayList<String> nombresVulgares;
    private String nombreCientifico;
    private String clasificacionSuperior;
    private String familia;
    private String clase;
    private boolean interior;
    private int riego;
    private int Sol;

    public Planta(String nombreCientifico){
        setNombreCientifico(nombreCientifico);
    }

    public void setNombreCientifico(String nombreCientifico){
        this.nombreCientifico = esValido(nombreCientifico);
    }

    public void addNombreVulgar(String ss){
        if(!nombresVulgares.contains(ss)){
            nombresVulgares.add(ss);
        }
    }


    private String esValido(String ss){
        if(ss != null)
            return ss;
        else
            return "--";
    }

    public void setClasificacionSuperior(String clasificacionSuperior){
        this.clasificacionSuperior = esValido(clasificacionSuperior);
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public boolean isInterior() {
        return interior;
    }

    public void setInterior(boolean interior) {
        this.interior = interior;
    }

    public int getRiego() {
        return riego;
    }

    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setRiego(int riego) {
        this.riego = riego;
    }

    public int getSol() {
        return Sol;
    }

    public void setSol(int sol) {
        Sol = sol;
    }

    public ArrayList<String> getNombresVulgares(){
        return new ArrayList<>(nombresVulgares);
    }

}
