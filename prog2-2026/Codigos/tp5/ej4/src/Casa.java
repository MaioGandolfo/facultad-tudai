import javax.swing.*;
import java.util.ArrayList;

public class Casa {
    private String nombre;
    protected ArrayList<Alumno> alumnos;
    protected ArrayList<String> cualidadesAceptadas;
    private int cantAlumnosMax;

    public Casa(String nombre, int cantAlumnosMax){
        setNombre(nombre);
        setCantAlumnosMax(cantAlumnosMax);
        alumnos = new ArrayList<>();
        cualidadesAceptadas = new ArrayList<>();
    }

    public void addAlumno(Alumno aa){
        if(!alumnos.isEmpty()) {
            if (!aa.getAsignado()) {
                int i = 0;
                boolean cumple = false;
                while ((i < cualidadesAceptadas.size() && !cumple) && alumnos.size() < cantAlumnosMax) {
                    if (aa.cumpleCualidad(cualidadesAceptadas.get(i)))
                        i++;
                    else
                        cumple = true;
                }

                if (i == cualidadesAceptadas.size()) {
                    alumnos.add(aa);
                    aa.setCasaAsignada(this.getNombre());
                    aa.setAsignado(true);
                }
            }
        }
        else
            alumnos.add(aa);
    }

    public boolean equals(Object o1){
        Casa aux = (Casa) o1;
        try{
            return aux.getNombre().equalsIgnoreCase(this.getNombre());
        } catch (Exception e) {
            return false;
        }
    }


    public void addCualidades(String cualidad){
        if(!cualidadesAceptadas.contains(cualidad))
            cualidadesAceptadas.add(cualidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "sin nombre";
    }

    public void setCantAlumnosMax(int cantAlumnosMax){
        if(cantAlumnosMax > 0)
            this.cantAlumnosMax = cantAlumnosMax;
        else
            this.cantAlumnosMax = 1;
    }

    public int getCantAlumnosMax() {
        return cantAlumnosMax;
    }

    public void imprimirCasa(){
        System.out.println("nombre: " + getNombre() +'\n');
        imprimirLista();
    }

    public void imprimirLista(){
        for(Alumno aa : alumnos)
            System.out.println(aa.toString());
    }
}
