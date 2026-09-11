import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private boolean asignado;
    private String casaAsignada;
    private ArrayList<String> cualidades;
    private ArrayList<Alumno> familiaresEscuela;

    public Alumno(String nombre){
        setNombre(nombre);
        asignado = false;
        cualidades = new ArrayList<>();
        familiaresEscuela = new ArrayList<>();
    }

    public void addCualidad(String cc){
        if(!cualidades.contains(cc))
            cualidades.add(cc);
    }

    public void addFamiliarEscuela(Alumno aa){
        familiaresEscuela.add(aa);
    }

    public boolean equals(Object o1){
        Alumno aux = (Alumno) o1;
        try {
            return aux.getNombre().equalsIgnoreCase(this.getNombre());
        } catch (Exception e) {
            return false;
        }
    }

    public boolean cumpleCualidad(String cc){
        return cualidades.contains(cc);
    }


    public boolean getAsignado() {
        return asignado;
    }

    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "juan";
    }

    public void setCasaAsignada(String casa){
        this.casaAsignada = casa;
    }

    public String toString(){
        return "nombre: " + nombre + '\n' + "Cualidades: " + this.imprimirCualidades() + '\n' + "-------------" + '\n' + "casa asignada: " + casaAsignada;
    }


    public String  imprimirCualidades(){
        String resultado = "";
        for(String cc : cualidades)
            resultado += cc + '\n' ;
        return resultado;
    }
}
