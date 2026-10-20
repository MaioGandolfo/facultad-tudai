import java.util.ArrayList;

public class Tripulacion {
    private ArrayList<Personaje> tripulacion;
    private String nombre;

    public Tripulacion (String nombre){
        this.nombre = nombre;
        this.tripulacion = new ArrayList<>();
    }

    public ArrayList<Personaje> buscarTripulacion(Condicion cc, int cantidad){
        ArrayList<Personaje> salida = new ArrayList<>();
        for(int i=0 ; i<tripulacion.size(); i++){
            if(cc.cumple(pp) && i<tripulacion.size())
                salida.add(pp);
        }
        return salida;
    }

    public void addTripulacion(Personaje pp){
        if(!tripulacion.contains(pp))
            tripulacion.add(pp);
    }

    public double pesoTripulacion(){
        return tripulacion.getFirst().getPeso();
    }

    public double edadTripulacion(){
        int max = 0;
        for(Personaje pp : tripulacion){
            if(pp.getEdad() > max)
                max = pp.getEdad();
        }
        return max;
    }

    public int getTamanioTripulacion(){
        return tripulacion.size();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
